package org.example.Bridge;

public class SMS implements NotificationSender {
    @Override
    public void sendNotification() {
        System.out.println("Sending Notification Using SMS");
    }
}
