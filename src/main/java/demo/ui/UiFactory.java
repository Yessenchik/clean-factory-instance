package main.java.demo.ui;

// Abstract Factory: creates a family of related products
public interface UiFactory {
    Button createButton();
    Checkbox createCheckbox();
}