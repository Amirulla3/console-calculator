package com.calculator.Application;

import com.calculator.UserInterface.InputHandler;
import com.calculator.UserInterface.OuputHandler;
import com.calculator.Core.Service;

public class Application {
    InputHandler InputHandler;
    OuputHandler ouputHandler;
    Service service;

    public Application() {
        this.InputHandler = new InputHandler();
        this.ouputHandler = new OuputHandler();
        this.service = new Service();
    }

    public void run() {
        while (true) {
            ouputHandler.printMenu();
            String startMenu = InputHandler.getMenuScanner();
            switch (startMenu) {
                case "1":
                    while (true) {
                        ouputHandler.outputExpression();
                        String calculatorInput = InputHandler.readExpression();
                        if (calculatorInput.equals("exit")) {
                            ouputHandler.exitFromCalculator();
                            break;
                        } else {
                            try {
                                double result = service.calculateExpression(calculatorInput);
                                ouputHandler.calculate(calculatorInput, result);
                            } catch (IllegalArgumentException ex) {
                                ouputHandler.argumentException();
                            } catch (ArithmeticException e) {
                                ouputHandler.aritmeticsException();
                            }
                        }
                    }
                    break;
                case "2":
                    service.listExpressionFormatter();
                    break;
                case "3":
                    service.lastExpressionFormatter();
                    break;
                case "4":
                    service.clearExpressionFormatter();
                    break;
                case "5":
                    ouputHandler.printExitApp();
                    return;
                default:
                    ouputHandler.printUnknownCommand();
            }
        }
    }
}
