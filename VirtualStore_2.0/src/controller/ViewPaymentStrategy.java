package controller;

import controller.Order;

public interface ViewPaymentStrategy {

    void executeView(Order order);
}

