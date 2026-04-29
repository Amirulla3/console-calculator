package com.calculator;

import java.util.Scanner;

public class InputHandler {
    Scanner scanner;
    String inputScanner;
    String menuScanner;

    InputHandler() {
        this.scanner = new Scanner(System.in);
    }

    String readExpression() {
        inputScanner = scanner.nextLine();
        return inputScanner;
    }

    String getMenuScanner() {
        menuScanner = scanner.nextLine();
        return menuScanner;
    }
}
