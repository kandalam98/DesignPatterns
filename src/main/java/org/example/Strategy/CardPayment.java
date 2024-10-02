package org.example.Strategy;


public class CardPayment implements PaymentStrategy{
    String cardDetails;
    String cvv;

    public CardPayment(String cardDetails, String cvv) {
        this.cardDetails = cardDetails;
        this.cvv = cvv;
    }


    @Override
    public String makePayment() {
        return "Payment Done using cardDetails " + cardDetails;
    }
}
