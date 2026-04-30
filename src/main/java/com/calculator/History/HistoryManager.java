package com.calculator.History;

import java.util.ArrayList;

public class HistoryManager {
    ArrayList<String> historyExpressionFormatter = new ArrayList<>();

    public void addHistory(String stringgg) {
        if (historyExpressionFormatter.size() >= 10) {
            historyExpressionFormatter.remove(0);
        }
        historyExpressionFormatter.add(stringgg);
    }

    public void viewHistory() {
        if (historyExpressionFormatter.isEmpty()) {
            System.out.println("История пуста!");
        } else {
            for (String nn : historyExpressionFormatter) {
                System.out.println(nn);
            }
        }
    }

    public void lastExpressionFormatterHistory() {
        if (historyExpressionFormatter.isEmpty()) {
            System.out.println("История пуста!");
        } else {
            System.out.println(historyExpressionFormatter.get(historyExpressionFormatter.size() - 1));
        }
    }

    public void clearHistory() {
        historyExpressionFormatter.clear();
    }
}
