package main.java.demo;

import main.java.demo.notification.EmailNotificationFactory;
import main.java.demo.notification.NotificationFactory;
import main.java.demo.notification.SmsNotificationFactory;
import main.java.demo.ui.UiFactory;
import main.java.demo.ui.dark.DarkUiFactory;
import main.java.demo.ui.light.LightUiFactory;

public class App {
    public static void main(String[] args) {
        // ===== Factory Method demo: notifications =====
        sendWelcome(new EmailNotificationFactory(), "yessenchiik@gmail.com");
        sendWelcome(new SmsNotificationFactory(), "+7 777 777 7777");

        // ===== Abstract Factory demo: UI family =====
        renderLoginScreen(new LightUiFactory()); // switch to a different family by one line
        renderLoginScreen(new DarkUiFactory());
    }

    // Small, clear helper (Clean Code: small functions, meaningful names)
    private static void sendWelcome(NotificationFactory factory, String recipient) {
        var notification = factory.create();
        notification.send(recipient, "Welcome to our app!");
    }

    private static void renderLoginScreen(UiFactory factory) {
        var button = factory.createButton();
        var checkbox = factory.createCheckbox();

        button.render("Login");
        checkbox.render("Remember me");
        System.out.println("---");
    }
}