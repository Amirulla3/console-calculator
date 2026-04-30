package com.calculator.Core;

import com.calculator.Model.Expression;

public class Calculator {
    public double calculate(Expression expression) {
        switch (expression.operator) {
            case "+":
                return expression.firstNumber + expression.secondNumber;
            case "-":
                return expression.firstNumber - expression.secondNumber;
            case "*":
                return expression.firstNumber * expression.secondNumber;
            case "/":
                if (expression.secondNumber == 0) throw new ArithmeticException();
                else {
                    return expression.firstNumber / expression.secondNumber;
                }
        }
        throw new IllegalArgumentException();
    }
}
