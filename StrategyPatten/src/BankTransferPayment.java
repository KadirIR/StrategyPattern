public class BankTransferPayment implements PaymentStrategy{
    private String bankAccount;
    public BankTransferPayment(String bankAccount){
        this.bankAccount=bankAccount;
    }
    @Override
    public void pay(int amount) {
        System.out.println(bankAccount +" iban numarasna " + amount+"TL, ödeme banka havalesi ile gerçekleştirildi.");
    }
}
