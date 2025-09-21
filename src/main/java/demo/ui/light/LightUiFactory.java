package main.java.demo.ui.light;

import main.java.demo.ui.Button;
import main.java.demo.ui.Checkbox;
import main.java.demo.ui.UiFactory;

public class LightUiFactory implements UiFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}