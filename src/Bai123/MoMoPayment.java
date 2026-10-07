package Bai123;

import java.text.DecimalFormat;

public class MoMoPayment extends PaymentMethod {
    public MoMoPayment() {
        super("Không dùng tiền mặt", "MoMo");
    }

    @Override
    public void pay(double amount) {
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("Thanh toán " + df.format(amount) + " qua MoMo.");
    }
}