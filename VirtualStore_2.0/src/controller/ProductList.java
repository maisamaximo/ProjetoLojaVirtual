package controller;

import model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductList {

    private final List<Product> productsList;

    public ProductList(){
        productsList = new ArrayList<>();
        addProduct(new Product("TABLET", 900.));
        addProduct(new Product("NOTEBOOK", 1500.));
        addProduct(new Product("CELULAR", 800.));
        addProduct(new Product("PENDRIVE", 60.));
        addProduct(new Product("BAND-AID", 5.));
    }

    private void addProduct(Product product){
        productsList.add(product);
    }

    public List<Product> getProductsList() {
        return Collections.unmodifiableList(productsList);
    }

    public Product getItem(String item){
        for (Product product : getProductsList()){
            if (product.getProductName().equalsIgnoreCase(item)){
                return product;
            }
        }
        return null;
    }
}