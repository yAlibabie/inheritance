package payment;

import java.util.ArrayList;

public abstract class Customer {
    String name;
    ArrayList<String> paymentHistory;

    public Customer (String name) {
        this.name = name;
        paymentHistory = new ArrayList<>();
    }

    public abstract void displayCustomerInfo ();

    public void makePayment(PaymentStrategy paymentStrategy , double amount) {
            paymentStrategy.pay(amount);
            String payments = "payment: " + amount + "\n" + paymentStrategy.getPaymentDetails();
            paymentHistory.add(payments);
    }

    public void showPaymentHistory () {
        for (String paymentHistories : paymentHistory) {
            System.out.println(paymentHistories);
            System.out.println();
        }
    }
}