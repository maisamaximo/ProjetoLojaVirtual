package controller;

public class PaymentStrategyCreditCard extends PaymentForm {

    public double getInstallmentsValue(double totalValueOrder, int installmentsTimes) {
        return totalValueOrder / installmentsTimes;
    }
}
