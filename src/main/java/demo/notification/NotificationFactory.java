package main.java.demo.notification;

// Creator (Factory Method): subclasses decide which product to instantiate
public abstract class NotificationFactory {
    public abstract Notification create();
}