package prac2;

public class FactoryPayPal implements PrincipalFactory{

    @Override
    public ProcessPayment createPayment() {
        return new PayPal(); 
    } 
}
