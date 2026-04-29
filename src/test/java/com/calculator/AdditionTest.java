package com.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdditionTest{
    @Test
    void shouldAddTwoNumbers(){
        Service service = new Service(); 
        double result = service.calculateExpression("2 + 3"); 
        assertEquals(5.0, result);
    }
}
