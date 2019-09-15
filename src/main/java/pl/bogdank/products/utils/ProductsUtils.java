package pl.bogdank.products.utils;

import pl.bogdank.products.model.Product;
import java.util.List;

public class ProductsUtils {

    public static double sumPrice(List<Product> products, String category) {
        double sum = 0;
        for (Product product : products) {
            if(product.getCategory().getNickName().equals(category) || (category.equals("wszystkie")))
                sum += product.getPrice();
        }
        return sum;
    }

    public static String productsInfo(List<Product> products, String category) {
        String info = "";
        for (Product product : products) {
            if(product.getCategory().getNickName().equals(category) || (category.equals("wszystkie")))
                info += product.toString() + "<br/>";
        }
        return info;
    }

    public static String goToMainMenu() {
        return "<br/><br/><a href=\"/\"><<< Powrót do menu głównego</a>";
    }
}
