package org.example.Bridge;

public class Email implements NotificationSender {
    @Override
    public void sendNotification() {
        System.out.println("Sending Notification Using Email");
    }
}
