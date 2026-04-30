package com.calculator.History;

import com.calculator.Model.Expression;

public class ExpressionFormatter {
    public String format(Expression expression, double result) {
        String firstNum = String.format("%.2f", expression.firstNumber);
        String secondNum = String.format("%.2f", expression.secondNumber);
        String rr = String.format("%.2f", result);
        return firstNum + " " + expression.operator + " " + secondNum + " = " + rr;
    }
}
