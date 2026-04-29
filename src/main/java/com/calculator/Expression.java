package com.calculator;

public class Expression {
    double firstNumber, secondNumber;
    String operator;

    Expression(double firstNumber, double secondNumber, String operator) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
    }
}
