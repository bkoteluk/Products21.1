package pl.bogdank.products.repository;

import org.springframework.stereotype.Repository;
import pl.bogdank.products.model.Product;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductsRepository {

    private List<Product> products = new ArrayList<>();

    public List<Product> getAll() {
        return products;
    }

    public void add(Product product) {
        products.add(product);
    }
}
