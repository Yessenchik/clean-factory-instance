# Clean Code + Factory & Abstract Factory (Java)

## What this implements
- **Factory Method (Notifications):** `NotificationFactory` is the creator; concrete factories (`EmailNotificationFactory`, `SmsNotificationFactory`) decide which `Notification` product to instantiate. Client code (`App.sendWelcome`) is decoupled from concrete classes.  [oai_citation:1‡Lecture 2.pdf](file-service://file-NRzYEvPCrmsp316DGD7KxU)
- **Abstract Factory (UI family):** `UiFactory` creates a **family** of related products (`Button`, `Checkbox`). `LightUiFactory` and `DarkUiFactory` provide consistent themed widgets. Switching the factory swaps the whole family at once.  [oai_citation:2‡Lecture 2.pdf](file-service://file-NRzYEvPCrmsp316DGD7KxU)

## Clean Code principles demonstrated
- **Meaningful names** (e.g., `sendWelcome`, `UiFactory`, `LightButton`).
- **Small functions** (`sendWelcome`, `renderLoginScreen`).
- **Single Responsibility** (each class has one job).
- **Open/Closed** (add a new notification or a new theme by adding classes, without touching existing client code).
- **No long `if-else` chains** in clients — creation is encapsulated in factories.

## How to run
```bash
# From project root
javac -d out $(find src/main/java -name "*.java")
java -cp out main.App