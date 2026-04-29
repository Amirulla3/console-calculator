package com.calculator;


public class Parser {
    Expression parseString(String expression) {
        String[] expresionsMassive = expression.trim().split("\\s+");
        String operator;
        double secondParse;
        double firstParse;
        if (expresionsMassive.length == 3) {
            firstParse = Double.parseDouble(expresionsMassive[0]);
            secondParse = Double.parseDouble(expresionsMassive[2]);
            operator = expresionsMassive[1];
        } else {
            throw new IllegalArgumentException();
        }
        return new Expression(firstParse, secondParse, operator);
    }
}
