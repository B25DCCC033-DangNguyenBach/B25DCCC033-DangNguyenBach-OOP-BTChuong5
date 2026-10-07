package Bai123;

import java.text.DecimalFormat;

public class PayPalPayment extends PaymentMethod {
    public PayPalPayment() {
        super("Không dùng tiền mặt", "PayPal");
    }

    @Override
    public void pay(double amount) {
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("Thanh toán " + df.format(amount) + " qua PayPal.");
    }
}