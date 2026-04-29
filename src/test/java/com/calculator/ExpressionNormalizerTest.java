package com.calculator;

import com.calculator.ExpressionNormalizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ExpressionNormalizerTest {
    ExpressionNormalizer normalizer = new ExpressionNormalizer();
    @Test
    void shouldParseSimpleNumbers(){
        String result = normalizer.normalize("два плюс три");
        assertEquals("2 + 3", result );
    }
}
