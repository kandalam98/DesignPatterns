package org.example.Strategy;

public class UpiPayment implements PaymentStrategy{

    String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public String makePayment() {
        return "Payment Done using UPI ID "+ upiId;
    }
}
