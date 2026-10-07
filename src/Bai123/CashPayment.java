package Bai123;

import java.text.DecimalFormat;

public class CashPayment extends PaymentMethod {
    public CashPayment() {
        super("Trực tiếp", "tiền mặt");
    }

    @Override
    public void pay(double amount) {
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("Thanh toán " + df.format(amount) + " bằng tiền mặt.");
    }
}