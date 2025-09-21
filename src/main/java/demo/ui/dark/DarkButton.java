package main.java.demo.ui.dark;

import main.java.demo.ui.Button;

public class DarkButton implements Button {
    @Override
    public void render(String text) {
        System.out.println("DarkButton < " + text + " >");
    }
}