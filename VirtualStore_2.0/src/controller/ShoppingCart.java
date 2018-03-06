package controller;

import model.Item;
import model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ShoppingCart {

    private final List<Item> itensList;

    public ShoppingCart(){
        itensList = new ArrayList<>();
    }

    //stream - estudar mais sobre o conceito
    public void addItemAtList(Product product, int quantityItem){
        final Optional<Item> item = itensList.stream()
                .filter(i -> i.getProductItem().equals(product))
                .findFirst();
        if (item.isPresent()){
            item.get().increment(quantityItem);
        }else {
            itensList.add(new Item(quantityItem, product));
        }
    }

    public List<Item> getItensList() {
        return Collections.unmodifiableList(itensList);
    }

    //item duplicado na order
    public double getTotal() {
        return itensList.stream().mapToDouble(Item::getSubtotal).sum();
    }
}