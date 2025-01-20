import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();
        System.out.println("Lütfen tutar giriniz: ");
        int amount = scanner.nextInt();
        System.out.println("\n--------------------");
        System.out.println("Ödeme Yöntemi");
        System.out.println("--------------------");
        System.out.println("1- Kredi Kartı ile Ödeme");
        System.out.println("2- Banka Havalesi ile Ödeme");
        System.out.println("3- PayPal ile Ödeme");
        System.out.println("4- Papara Ödeme");
        System.out.print("Lütfen ödeme yönteminizi seçiniz: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Kredi Kartı Bilgilerinizi Giriniz.");
                scanner.nextLine();
                System.out.print("Kart Numarası: ");
                String cardNumber = scanner.nextLine();
                System.out.print("Kart Sahibi İsmi: ");
                String cardHolderName = scanner.nextLine();
                order.setPaymentStrategy(new CreditCardtPayment(cardNumber, cardHolderName));
                break;

            case 2:
                System.out.println("IBAN Bilgilerinizi Giriniz.");
                scanner.nextLine();
                System.out.print("IBAN: ");
                String bankAccount = scanner.nextLine();
                order.setPaymentStrategy(new BankTransferPayment(bankAccount));
                break;

            case 3:
                System.out.println("PayPal Bilgilerinizi Giriniz.");
                scanner.nextLine();
                System.out.print("Email: ");
                String email = scanner.nextLine();
                order.setPaymentStrategy(new PayPalPayment(email));
                break;

            case 4:
                System.out.println("Papara Ödeme Bilgilerinizi Giriniz.");
                scanner.nextLine();
                System.out.print("Papara Numarası: ");
                String paparaNumber = scanner.nextLine();
                order.setPaymentStrategy(new PaparaPayment(paparaNumber));
                break;

            default:
                System.out.println("Geçersiz seçim. Lütfen tekrar deneyiniz.");
                return;
        }

        order.processPayment(amount);
    }
}
