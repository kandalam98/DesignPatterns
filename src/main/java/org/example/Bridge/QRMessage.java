package org.example.Bridge;

public class QRMessage implements Notification{

    NotificationSender notificationSender;
    public QRMessage(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    @Override
    public void sendNotification() {
        System.out.println("this is QR Message");
        notificationSender.sendNotification();
    }
}
