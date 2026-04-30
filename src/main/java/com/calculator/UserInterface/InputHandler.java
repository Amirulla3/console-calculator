package com.calculator.UserInterface;

import java.util.Scanner;

public class InputHandler {
    Scanner scanner;
    String inputScanner;
    String menuScanner;

    public InputHandler() {
        this.scanner = new Scanner(System.in);
    }

    public String readExpression() {
        inputScanner = scanner.nextLine();
        return inputScanner;
    }

    public String getMenuScanner() {
        menuScanner = scanner.nextLine();
        return menuScanner;
    }
}
