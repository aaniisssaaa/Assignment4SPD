package strategy;

public class CreditCardPayment implements PaymentStrategy {
    private final String cardNumber;
    private final String cardHolder;

    public CreditCardPayment(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public boolean pay(double amount) {
        if (amount <= 0) return false;
        System.out.printf("Charging %.2f to credit card %s (holder: %s)\n", amount, mask(cardNumber), cardHolder);
        return true;
    }

    private String mask(String number) {
        if (number == null || number.length() < 4) return "****";
        int len = number.length();
        String last4 = number.substring(len - 4);
        return "**** **** **** " + last4;
    }
}
