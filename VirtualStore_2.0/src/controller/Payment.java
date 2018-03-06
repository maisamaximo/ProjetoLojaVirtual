package controller;

import view.ViewBillet;
import view.ViewCreditCard;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class Payment {

    private Map<PaymentType, ViewPaymentStrategy> map = new EnumMap<>(PaymentType.class);
    private PaymentType paymentType;

    public Payment(){
        map.put(paymentType.BILLET, new ViewBillet());
        map.put(paymentType.CREDITCARD, new ViewCreditCard());
    }

    public ViewPaymentStrategy viewPaymentStrategy(int paymentOption){
        return map.get(PaymentType.getPaymentTypeByValue(paymentOption));
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }
}