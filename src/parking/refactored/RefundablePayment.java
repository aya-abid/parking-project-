package parking.refactored;

public interface RefundablePayment extends PaymentMethod {
    void refund(double amount);
}