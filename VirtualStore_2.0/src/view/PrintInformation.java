package view;

public class PrintInformation {

    public void productList(){
        System.out.println("_________________________");
        System.out.println("_______Product_List______\n");
    }

    public void requestAddItem(){
        System.out.println("Would you like to add an item to your shopping cart? \nY - Yes \nN - no");
    }

    public void requestProduct(){
        System.out.print("Enter with the product name: ");
    }

    public void requestQuantity(){
        System.out.print("Quantity: ");
    }

    public void requestEmailAddress(){
        System.out.println("Enter with your e-mail address: ");
    }

    public void requestPaymentForm(){
        System.out.println("Type of payment? \n1 - Billet\n2 - Credit Card");
    }

}
