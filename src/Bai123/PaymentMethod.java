package Bai123;

public abstract class PaymentMethod {
    private String paymentType;
    private String methodName;

    public PaymentMethod(String paymentType, String methodName) {
        this.paymentType = paymentType;
        this.methodName = methodName;
    }

    public abstract void pay(double amount);
}