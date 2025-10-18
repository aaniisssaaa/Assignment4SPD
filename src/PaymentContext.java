package strategy;

public class PaymentContext {
    private PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean pay(double amount) {
        if (strategy == null) throw new IllegalStateException("Payment strategy not set");
        return strategy.pay(amount);
    }
}
