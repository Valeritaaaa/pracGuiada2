package prac2;
//valeria Sanchez c5j699
public class Main {
    public static void main(String[] args) {
        PrincipalFactory principalFactory = new FactoryCreditCard();
        principalFactory.createPayment().payment();

        principalFactory = new FactoryPayPal(); 
        principalFactory.createPayment().payment();
    }  
}
