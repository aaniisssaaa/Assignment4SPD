package strategy;

public interface PaymentStrategy {
    /**
     * Выполнить оплату с указанной суммой.
     * Возвращает true при успешной оплате, false при ошибке.
     */
    boolean pay(double amount);
}
