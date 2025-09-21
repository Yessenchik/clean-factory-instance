package main.java.demo.notification;

public class EmailNotification implements Notification {
    @Override
    public void send(String to, String message) {
        System.out.println("[EMAIL] -> " + to + " : " + message);
    }
}