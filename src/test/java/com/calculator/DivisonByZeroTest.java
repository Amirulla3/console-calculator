package com.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class DivisonByZeroTest {
    @Test
    void shouldThrowExceptionWhenDivideByZero(){
        Service service = new Service();
        assertThrows(ArithmeticException.class, () -> {
            service.calculateExpression("10 / 0");
        });
    }
}
