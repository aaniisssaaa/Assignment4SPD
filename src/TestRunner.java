package strategy;

public class TestRunner {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext(new CreditCardPayment("4111111111111111", "Alice"));
        boolean ok1 = context.pay(100.0);
        System.out.println("Credit card payment success: " + ok1);

        context.setStrategy(new PayPalPayment("alice@example.com"));
        boolean ok2 = context.pay(50.5);
        System.out.println("PayPal payment success: " + ok2);

        boolean fail = context.pay(-10);
        System.out.println("Negative amount payment success: " + fail);
    }
}
