package Bai123;

import java.text.DecimalFormat;

public class CreditCardPayment extends PaymentMethod {
    public CreditCardPayment() {
        super("Không dùng tiền mặt", "thẻ tín dụng");
    }

    @Override
    public void pay(double amount) {
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("Thanh toán " + df.format(amount) + " bằng thẻ tín dụng.");
    }
}