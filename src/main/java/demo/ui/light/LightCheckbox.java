package main.java.demo.ui.light;

import main.java.demo.ui.Checkbox;

public class LightCheckbox implements Checkbox {
    @Override
    public void render(String label) {
        System.out.println("LightCheckbox ( ) " + label);
    }
}