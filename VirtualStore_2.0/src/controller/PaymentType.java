package controller;

public enum PaymentType {
    BILLET(1, "BILLET"),
    CREDITCARD(2, "CREDIT CARD");

    private int optionPayment;
    private String title;

    PaymentType(int optionPayment, String title){
        this.optionPayment = optionPayment;
        this.title = title;
    }

    public static PaymentType getPaymentTypeByValue(int value){
        for (PaymentType type : values()){
            if (type.optionPayment==value){
                return type;
            }
        }
        return null;
    }

    public int getOptionPayment() {
        return optionPayment;
    }

    public String getTitle() {
        return title;
    }
}