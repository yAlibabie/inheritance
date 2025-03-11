package payment;

public class BitcoinPayment implements PaymentStrategy{
    String walletAddress;

    public BitcoinPayment (String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid:" + amount + "\n" + getPaymentDetails());
    }

    @Override
    public String getPaymentDetails() {
        return "Bitcoin payment - Wallet address: " + walletAddress;
    }
}
