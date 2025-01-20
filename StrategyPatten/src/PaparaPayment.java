public class PaparaPayment implements PaymentStrategy{
    private String paparaNumber;
    public PaparaPayment(String paparaNumber) {
        this.paparaNumber = paparaNumber;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount + " TL, Papara ödeme yöntemiyle ödendi. Papara numarası: " + paparaNumber);
    }
}
