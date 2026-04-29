package com.calculator;

public class ExpressionFormatter {
    String format(Expression expression, double result) {
        String firstNum = String.format("%.2f", expression.firstNumber);
        String secondNum = String.format("%.2f", expression.secondNumber);
        String rr = String.format("%.2f", result);
        return firstNum + " " + expression.operator + " " + secondNum + " = " + rr;
    }
}
