package org.example.Bridge;

public class Application {

    public static void main(String[] args){
        Email email = new Email();
        SMS sms = new SMS();
        QRMessage qrMessage = new QRMessage(email);
        QRMessage qrMessage2 = new QRMessage(sms);
        qrMessage.sendNotification();
        qrMessage2.sendNotification();
    }
}
