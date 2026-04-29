package com.calculator;

import java.util.ArrayList;

public class HistoryManager {
    ArrayList<String> historyExpressionFormatter = new ArrayList<>();

    void addHistory(String stringgg) {
        if (historyExpressionFormatter.size() >= 10) {
            historyExpressionFormatter.remove(0);
        }
        historyExpressionFormatter.add(stringgg);
    }

    void viewHistory() {
        if (historyExpressionFormatter.isEmpty()) {
            System.out.println("История пуста!");
        } else {
            for (String nn : historyExpressionFormatter) {
                System.out.println(nn);
            }
        }
    }

    void lastExpressionFormatterHistory() {
        if (historyExpressionFormatter.isEmpty()) {
            System.out.println("История пуста!");
        } else {
            System.out.println(historyExpressionFormatter.get(historyExpressionFormatter.size() - 1));
        }
    }

    void clearHistory() {
        historyExpressionFormatter.clear();
    }
}
