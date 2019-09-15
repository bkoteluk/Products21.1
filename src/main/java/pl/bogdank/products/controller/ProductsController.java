package pl.bogdank.products.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.bogdank.products.model.Category;
import pl.bogdank.products.model.Product;
import pl.bogdank.products.repository.ProductsRepository;

import java.util.List;

import static pl.bogdank.products.utils.ProductsUtils.*;

@Controller
public class ProductsController {

    private ProductsRepository productsRepository;

    public ProductsController(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @ResponseBody
    @GetMapping("/lista")
    public String productsList(@RequestParam(name = "kategoria", required = false) Category category) {

        List<Product> products;

        if (category != null)
            products = productsRepository.getByCategory(category);
        else
            products = productsRepository.getAll();

        String result = "";
        result += productsInfo(products);
        result += "<hr>";
        result += "Suma cen produktów: " + sumPrice(products);

        return result + goToMainMenu();
    }

    @RequestMapping(value = "/nowy", method = RequestMethod.POST)
    public String addProduct(@RequestParam String name,
                             @RequestParam Double price,
                             @RequestParam Category category) {

        Product product = new Product(name, price, category);
        productsRepository.add(product);

        return "redirect:/lista";
    }
}
