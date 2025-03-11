import payment.*;

public class Main {
    public static void main(String[] args) {

        //making new customers
        RegularCustomer Sara = new RegularCustomer("Sara");
        PremiumCustomer Zahra = new PremiumCustomer("Zahra");
        RegularCustomer Maisam = new RegularCustomer("Maisam");
        PremiumCustomer Mostafa = new PremiumCustomer("Mostafa");

        //making new
        CreditCardPayment saraCreditCard = new CreditCardPayment("1234-5678-9012-3456","Sara");
        PaymentStrategy zahraPaypal = new PayPalPayment("zahra@emaill.coom");
        CreditCardPayment maisamCreditCard = new CreditCardPayment("0987-6543-2109-8765" ,  "maisam");
        BitcoinPayment mostafaBitcoin = new BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfN");

        Sara.displayCustomerInfo();
        Zahra.displayCustomerInfo();
        Mostafa.displayCustomerInfo();
        Maisam.displayCustomerInfo();

        Sara.makePayment(saraCreditCard , 730);
        Sara.makePayment(saraCreditCard , 98);

        Maisam.makePayment(maisamCreditCard , 760);
        Maisam.makePayment(maisamCreditCard , 754);

        Zahra.makePayment(zahraPaypal , 6605);
        Zahra.makePayment(zahraPaypal , 9);

        Mostafa.makePayment(mostafaBitcoin , 2920);
        Mostafa.makePayment(mostafaBitcoin , 2388);

        Sara.showPaymentHistory();
        Zahra.showPaymentHistory();
        Mostafa.showPaymentHistory();
        Maisam.showPaymentHistory();

    }
}