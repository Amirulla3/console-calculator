package com.calculator.Core;

import com.calculator.History.ExpressionFormatter;
import com.calculator.History.HistoryManager;
import com.calculator.Model.Expression;
import com.calculator.Normalizer.ExpressionNormalizer;
import com.calculator.Parser.Parser;

public class Service {
    Calculator calculator;
    Parser parser;
    HistoryManager historyManager;
    ExpressionFormatter expressionFormatter;
    ExpressionNormalizer expressionNormalizer;

    public Service() {
        this.calculator = new Calculator();
        this.parser = new Parser();
        this.expressionFormatter = new ExpressionFormatter();
        this.historyManager = new HistoryManager();
        this.expressionNormalizer = new ExpressionNormalizer();
    }

    public double calculateExpression(String jk) {
        String checkedExpression = expressionNormalizer.normalize(jk);
        Expression expression = parser.parseString(checkedExpression);
        double result = calculator.calculate(expression);
        String words = expressionFormatter.format(expression, result);
        historyManager.addHistory(words);
        return result;
    }

    public void listExpressionFormatter() {
        historyManager.viewHistory();
    }

    public void lastExpressionFormatter() {
        historyManager.lastExpressionFormatterHistory();
    }

    public void clearExpressionFormatter() {
        historyManager.clearHistory();
    }
}
