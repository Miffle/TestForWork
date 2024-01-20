package org.work.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TimeCalculationTest {
    private final String OUTPUT_STRING = "Результат: %.2f";
    private ByteArrayOutputStream out;

    @BeforeEach
    void setUp() {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    void calculateDegreeFirstCheck() {
        TimeCalculation.calculateDegree(5, 10);
        Assertions.assertEquals(String.format(OUTPUT_STRING, 95.00), out.toString());
    }

    @Test
    void calculateDegreeSecondCheck() {
        TimeCalculation.calculateDegree(6, 42);
        Assertions.assertEquals(String.format(OUTPUT_STRING, 51.00), out.toString());
    }

    @Test
    void calculateDegreeThirdCheck() {
        TimeCalculation.calculateDegree(14, 32);
        Assertions.assertEquals(String.format(OUTPUT_STRING, 116.00), out.toString());
    }

    @Test
    void calculateDegreeFourthCheck() {
        TimeCalculation.calculateDegree(21, 4);
        Assertions.assertEquals(String.format(OUTPUT_STRING, 248.00), out.toString());
    }
    @Test
    void calculateDegreeExceptionCheck() {
        TimeCalculation.calculateDegree(29, 69);
        Assertions.assertEquals("Введено неправильное время", out.toString());
    }
}