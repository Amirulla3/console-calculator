package com.calculator;

public class Service {
    Calculator calculator;
    Parser parser;
    HistoryManager historyManager;
    ExpressionFormatter expressionFormatter;
    ExpressionNormalizer expressionNormalizer;

    Service() {
        this.calculator = new Calculator();
        this.parser = new Parser();
        this.expressionFormatter = new ExpressionFormatter();
        this.historyManager = new HistoryManager();
        this.expressionNormalizer = new ExpressionNormalizer();
    }

    double calculateExpression(String jk) {
        String checkedExpression = expressionNormalizer.normalize(jk);
        Expression expression = parser.parseString(checkedExpression);
        double result = calculator.calculate(expression);
        String words = expressionFormatter.format(expression, result);
        historyManager.addHistory(words);
        return result;
    }

    void listExpressionFormatter() {
        historyManager.viewHistory();
    }

    void lastExpressionFormatter() {
        historyManager.lastExpressionFormatterHistory();
    }

    void clearExpressionFormatter() {
        historyManager.clearHistory();
    }
}
