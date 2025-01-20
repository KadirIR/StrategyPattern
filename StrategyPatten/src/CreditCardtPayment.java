public class CreditCardtPayment implements PaymentStrategy{
    private String cardNumber;
    private String cardHolderName;

    public CreditCardtPayment(String cardNumber, String cardHolderName){
        this.cardNumber= cardNumber;
        this.cardHolderName= cardHolderName;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+" TL "+cardHolderName+" isimli kredi kartı ile ödeme yapılmıştır "+cardNumber);
    }
}
