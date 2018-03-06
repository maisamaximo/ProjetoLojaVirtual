package controller;

import model.Item;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {

    private LocalDateTime orderDate;
    private final List<Item> itens;
    private PaymentType paymentForm; //PaymentForm

    public Order(List<Item> itens, PaymentType paymentForm) {
        this.itens = new ArrayList<>(itens);
        this.orderDate  = LocalDateTime.now();
        this.paymentForm = paymentForm;
    }

    public double getTotal() {
        return itens.stream().mapToDouble(Item::getSubtotal).sum();
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public PaymentType getPaymentForm() {
        return paymentForm;
    }
}
