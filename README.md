# Strategy Pattern - Payment System

## Proje Açıklaması
Bu proje, **Strategy Design Pattern (Strateji Tasarım Deseni)** kullanarak farklı ödeme yöntemlerini yönetmektedir. Bu sayede, ödeme yöntemleri birbirinden bağımsız bir şekilde eklenebilir veya değiştirilebilir. 

## Kullanılan Teknolojiler
- **Java** (Proje dili)
- **Object-Oriented Programming (OOP)**
- **Design Patterns (Tasarım Desenleri)**

## Proje Yapısı

### Ana Bileşenler
- **PaymentStrategy.java** → Strateji arayüzü
- **BankTransferPayment.java** → Banka havalesi ödeme stratejisi
- **CreditCardPayment.java** → Kredi kartı ödeme stratejisi
- **PayPalPayment.java** → PayPal ödeme stratejisi
- **PaparaPayment.java** → Papara ödeme stratejisi
- **Order.java** → Ödeme işlemlerini yöneten sınıf
- **Main.java** → Uygulamanın başlangıç noktası

## Kurulum ve Kullanım

### Projeyi Çalıştırma
1. **Projeyi klonlayın:**
   ```bash
   git clone https://github.com/kullaniciadi/StrategyPattern-PaymentSystem.git
   ```
2. **Java'yı yükleyin** (Eğer yüklü değilse):
   - Java 8 veya daha üstü sürüm gereklidir.
3. **Derleyip çalıştırın:**
   ```bash
   cd StrategyPattern-PaymentSystem/src
   javac Main.java
   java Main
   ```

### Örnek Kullanım
Kullanıcı ödeme yöntemini seçerek siparişini tamamlar:
```java
Order order = new Order(new CreditCardPayment());
order.processPayment(100);
```
Ödeme yöntemini değiştirmek için:
```java
order.setPaymentStrategy(new PayPalPayment());
order.processPayment(50);
```
