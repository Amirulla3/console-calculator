package com.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class DivisionTest {
    @Test
    void shouldDivideTwoNumbers(){
        Service service = new Service();
        double result = service.calculateExpression("10 / 2");
        assertEquals(5.0, result);
    }
}
