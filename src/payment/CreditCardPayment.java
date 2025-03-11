package payment;

import java.util.ArrayList;

public class CreditCardPayment implements PaymentStrategy {
    String cardNumber ;
    String cardHolderName ;
    ArrayList <CreditCardPayment> customer = new ArrayList<>();

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        customer.add(this);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid: " + amount +"\n" + getPaymentDetails());

    }

    @Override
    public String getPaymentDetails() {
       return "Credit card payment - Card number: " + cardNumber +", Card golder:" + cardHolderName ;
    }
}
