package com.calculator.Model;

public class Expression {
    public double firstNumber;
    public double secondNumber;
    public String operator;

    public Expression(double firstNumber, double secondNumber, String operator) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
    }
}
