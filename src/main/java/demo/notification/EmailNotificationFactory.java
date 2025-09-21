package main.java.demo.notification;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public Notification create() {
        return new EmailNotification();
    }
}