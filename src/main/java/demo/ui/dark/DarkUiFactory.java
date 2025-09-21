package main.java.demo.ui.dark;

import main.java.demo.ui.Button;
import main.java.demo.ui.Checkbox;
import main.java.demo.ui.UiFactory;

public class DarkUiFactory implements UiFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}