package parking.refactored;

public class CashPayment implements PaymentMethod {

    @Override
    public String name() {
        return "CASH";
    }

    @Override
    public void pay(double amount) {
        System.out.println("[CASH] received " + amount + " MAD");
    }
}