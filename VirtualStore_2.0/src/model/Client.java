package model;

import controller.Order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    private final String clientName;
    private final String clientEmail;
    private final List<Order> orderList = new ArrayList<>();

    public Client(String name, String email) {
        this.clientName = name;
        this.clientEmail = email;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void addOrder(Order order){
        orderList.add(order);
    }

    public List<Order> getOrderList() {
        return Collections.unmodifiableList(orderList);
    }
}
