package prac2;
public class PayPal implements ProcessPayment {

    @Override
    public void payment() {
        System.out.println("Pagando con paypal");
    }
}
