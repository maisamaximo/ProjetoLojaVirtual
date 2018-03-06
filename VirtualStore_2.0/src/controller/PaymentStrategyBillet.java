package controller;

public class PaymentStrategyBillet extends PaymentForm {

    private final double barcode = Math.random() * 100;

    public double getBarcode() {
        return barcode;
    }

}
