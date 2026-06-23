package kce;

interface Payment {
    void makePayment(double amount);
}
class UPIPayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("Payment of " + amount + " completed using UPI");
    }
}
class CardPayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("Payment of " + amount + " completed using Card");
    }
}
public class ex5 {
    public static void main(String[] args) {
        UPIPayment upi = new UPIPayment();
        CardPayment card = new CardPayment();
        upi.makePayment(1500);
        card.makePayment(2500);
    }
}