package view;

import controller.*;
import model.Client;
import model.Product;

import java.util.Scanner;

public class VirtualStore {

    Scanner read = new Scanner(System.in);

    private final PrintInformation printInformation = new PrintInformation();
    private final ShoppingCart shoppingCart = new ShoppingCart();
    private final ProductList productList = new ProductList();
    private final Payment payment = new Payment();
    private Client currentClient;
    private ClientList client = new ClientList();

    public void start(){
        String addItemOption;
        String informedProduct;
        int informedQuantity;
        String informedEmail;
        int informedPaymentForm;
        boolean continueRequest = true;

        do{
            showProductList();
            printInformation.requestAddItem();
            addItemOption = read.next();
            if (addItemOption.equalsIgnoreCase("Y")){
                // showProductList();
                printInformation.requestProduct();
                informedProduct = read.next();
                printInformation.requestQuantity();
                informedQuantity = read.nextByte();

                shoppingCart.addItemAtList(productList.getItem(informedProduct), informedQuantity);

            }else if (addItemOption.equalsIgnoreCase("N")){
                continueRequest = false;
                printInformation.requestEmailAddress();
                informedEmail = read.next();
                currentClient = client.getCurrentClient(informedEmail);
                printInformation.requestPaymentForm();
                informedPaymentForm = read.nextInt();

                Order currentOrder = new Order(shoppingCart.getItensList(), payment.getPaymentType());
                currentClient.addOrder(currentOrder);

                getPaymentOption(informedPaymentForm).executeView(currentOrder);

                System.out.println(currentClient.getClientEmail());
               //System.out.println(currentOrder.getPaymentForm());

            }
        }while (continueRequest);
    }

    private void showProductList(){
        ProductList productList = new ProductList();
        printInformation.productList();
        for (Product product : productList.getProductsList())
            System.out.printf("%s     R$%.2f\n", product.getProductName(), product.getProductPrice());
    }

    private ViewPaymentStrategy getPaymentOption(int informedPaymentForm) {
        return payment.viewPaymentStrategy(informedPaymentForm);
    }
}
