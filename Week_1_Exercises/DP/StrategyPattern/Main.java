package StrategyPattern;


public class Main {
 public static void main(String[] args) {
     PaymentContext context = new PaymentContext();

     PaymentStrategy creditCardPayment = new CreditCardPayment("1234 5678 9012 3456", "John Doe", "123", "12/24");
     context.setPaymentStrategy(creditCardPayment);
     context.pay(100.00);

     PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com", "password123");
     context.setPaymentStrategy(payPalPayment);
     context.pay(150.00);
 }
}
