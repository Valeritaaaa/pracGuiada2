package prac2;
public class FactoryCreditCard implements PrincipalFactory{

    @Override
    public ProcessPayment createPayment() {
        return new CreditCard(); 
    }

}
