package com.calculator;

import com.calculator.History.HistoryManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HistoryStoresLastTenTest {
    @Test
    void shouldStoreOnlyLastTenOperations(){
        HistoryManager history = new HistoryManager();
        for(int i = 1; i <= 12; i++){
            history.addHistory("expr " + i);
        }
        assertEquals(10, history.historyExpressionFormatter.size());
        assertEquals("expr 3", history.historyExpressionFormatter.get(0));
    }
}
