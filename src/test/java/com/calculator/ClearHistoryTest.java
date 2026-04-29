package com.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClearHistoryTest {
    @Test
    void shouldClearTest(){
        HistoryManager historyManager = new HistoryManager();

        historyManager.addHistory("1 + 1");
        historyManager.addHistory("1 + 2");

        historyManager.clearHistory();
        assertTrue(historyManager.historyExpressionFormatter.isEmpty());
    }
}
