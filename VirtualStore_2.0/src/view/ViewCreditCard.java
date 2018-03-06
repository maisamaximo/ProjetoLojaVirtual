package view;

import controller.*;
import model.Item;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class ViewCreditCard implements ViewPaymentStrategy {

    Scanner read = new Scanner(System.in);

    private String informedCreditCardNumber;
    private int informedInstallmentsTimes;

    @Override
    public void executeView(Order order) {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(new Locale("pt", "br"));
        PaymentStrategyCreditCard credit = new PaymentStrategyCreditCard();
        getInformation();

        System.out.println("\nHyperClass Shopping");
        System.out.println("Av. Cassiano Ricardo, 601 - Jd Aquarius");
        System.out.println("________________________________________");
        System.out.println(formatter.format(order.getOrderDate()));
        System.out.println("CREDIT CARD");
        for (Item product : order.getItens()) {
            System.out.println("Product: " + product.getProductItem());
            System.out.println("Quantity: " + product.getQuantityItem());
            System.out.printf("Subtotal: R$%.2f\n", product.getSubtotal());
        }
        System.out.println("--");
        System.out.printf("Total:  RS%.2f", order.getTotal());
        System.out.println("\nInstallments: " + getInformedInstallmentsTimes());
        System.out.printf("Total each installments: RS%.2f", credit.getInstallmentsValue(order.getTotal(), getInformedInstallmentsTimes())); // diminuir esse metodo
        System.out.println("\n________________________________________");
    }

    private void getInformation(){
        System.out.print("Enter with your Credit Card number: ");
        informedCreditCardNumber = read.next();
        System.out.print("How many installments? ");
        informedInstallmentsTimes = read.nextByte();
    }

    private String getInformedCreditCardNumber() {
        return this.informedCreditCardNumber;
    }

    private int getInformedInstallmentsTimes() {
        return this.informedInstallmentsTimes;
    }

}
