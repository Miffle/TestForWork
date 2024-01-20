package org.work.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

class BaseConverterTest {
    private ByteArrayInputStream in;
    private BaseConverter converter;

    @BeforeEach
    void setCelsius() {
        in = new ByteArrayInputStream("32,2".getBytes());
        System.setIn(in);
        converter = new BaseConverter();
    }

    @Test
    void inputCelsiusTest() {
        Assertions.assertEquals(32.2, converter.getCelsius());
    }

    @Test
    void getConvertedToKelvinValueTest() {
        in = new ByteArrayInputStream("2".getBytes());
        System.setIn(in);
        converter.conversion();
        Assertions.assertEquals(305.35, converter.getConvertedValue());
    }

    @Test
    void getConvertedToFahrenheitValueTest() {
        in = new ByteArrayInputStream("1".getBytes());
        System.setIn(in);
        converter.conversion();
        Assertions.assertEquals(89.96, converter.getConvertedValue());
    }
}
