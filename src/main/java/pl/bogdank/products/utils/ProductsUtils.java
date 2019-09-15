package pl.bogdank.products.utils;

import pl.bogdank.products.model.Product;
import java.util.List;

public class ProductsUtils {

    public static double sumPrice(List<Product> products) {
        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        return sum;
    }

    public static String productsInfo(List<Product> products) {
        String info = "";
        for (Product product : products) {
           info += product.toString() + "<br/>";
        }
        return info;
    }

    public static String goToMainMenu() {
        return "<br/><br/><a href=\"/\"><<< Powrót do menu głównego</a>";
    }
}
