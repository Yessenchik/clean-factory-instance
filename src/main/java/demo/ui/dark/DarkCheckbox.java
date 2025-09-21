package main.java.demo.ui.dark;

import main.java.demo.ui.Checkbox;

public class DarkCheckbox implements Checkbox {
    @Override
    public void render(String label) {
        System.out.println("DarkCheckbox [x] " + label);
    }
}