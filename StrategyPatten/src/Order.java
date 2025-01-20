public class Order {
    private PaymentStrategy paymentStrategy;
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }

    public void processPayment(int amount){
        if (paymentStrategy == null){
            System.out.println("Herhangi bir ödeme yöntemi seçilmedi");
            return;
        }
        paymentStrategy.pay(amount);
    }
}
