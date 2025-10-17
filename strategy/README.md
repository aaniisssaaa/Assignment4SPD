Strategy Pattern — Payment example

Files:
- PaymentStrategy.java — интерфейс стратегии оплаты
- CreditCardPayment.java — реализация для кредитной карты
- PayPalPayment.java — реализация для PayPal
- PaymentContext.java — контекст, использующий стратегию
- TestRunner.java — демонстрация сценариев

How to run (from project root):

javac -d out strategy/src/*.java
java -cp out strategy.TestRunner

Принципы Clean Code: четкие имена, минимальные методы, SRP, явные проверки входных значений.