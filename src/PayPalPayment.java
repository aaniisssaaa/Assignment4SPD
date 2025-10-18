package strategy;

public class PayPalPayment implements PaymentStrategy {
    private final String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public boolean pay(double amount) {
        if (amount <= 0) return false;
        System.out.printf("Charging %.2f to PayPal account %s\n", amount, email);
        return true;
    }
}
