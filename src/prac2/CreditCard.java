package prac2;
public class CreditCard implements ProcessPayment{

    @Override
    public void payment() {
        System.out.println("Pagando con tarjeta de crédito");
    }
    
}
