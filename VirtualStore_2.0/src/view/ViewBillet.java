package view;

import controller.Order;
import controller.PaymentStrategyBillet;
import controller.ViewPaymentStrategy;

public class ViewBillet implements ViewPaymentStrategy {

    @Override
    public void executeView(Order order) {
        PaymentStrategyBillet billet = new PaymentStrategyBillet();

        System.out.println("HyperClass Shopping");
        System.out.println("Av. Cassiano Ricardo, 601 - Jd Aquarius");
        System.out.println("________________________________________");
        System.out.println("---------------- BILLET ----------------");
        System.out.println(order.getOrderDate());
        System.out.println("Barcode\t" + billet.getBarcode());
        System.out.printf("Total:\tR$ %.2f", order.getTotal());
        System.out.println("\n________________________________________");
    }
}
