package main.java.demo.notification;

public class SmsNotificationFactory extends NotificationFactory {
    @Override
    public Notification create() {
        return new SmsNotification();
    }
}