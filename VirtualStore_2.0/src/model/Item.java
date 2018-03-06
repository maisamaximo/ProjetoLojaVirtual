package model;

public class Item {
    private int quantityItem;
    private final Product productItem;

    public Item(int quantityItem, Product productItem) {
        this.quantityItem = quantityItem;
        this.productItem = productItem;
    }

    public int getQuantityItem() {
        return quantityItem;
    }

    public Product getProductItem() {
        return productItem;
    }

    public double getSubtotal() {
        return productItem.getProductPrice() * this.quantityItem;
    }

    public void increment(int quantityItem){
        this.quantityItem += this.quantityItem;
    }


}
