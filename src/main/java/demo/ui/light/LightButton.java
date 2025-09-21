package main.java.demo.ui.light;

import main.java.demo.ui.Button;

public class LightButton implements Button {
    @Override
    public void render(String text) {
        System.out.println("LightButton [ " + text + " ]");
    }
}
