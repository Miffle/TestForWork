package org.work.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

@DisplayName("Тесты третьего задания")
class BaseConverterTest {
    private ByteArrayInputStream in;
    private ByteArrayOutputStream out;
    private final String OUTPUT_STRING = "Результат конвертации - %.2f";

    @Test
    void convertToFahrenheitFirstTest() {
        in = new ByteArrayInputStream("109,84".getBytes());
        convertToFahrenheit();
        Assertions.assertEquals(String.format(OUTPUT_STRING, 229.71), out.toString());
    }
    @Test
    void convertToFahrenheitSecondTest() {
        in = new ByteArrayInputStream("14,98".getBytes());
        convertToFahrenheit();
        Assertions.assertEquals(String.format(OUTPUT_STRING, 58.96), out.toString());
    }
    @Test
    void convertToFahrenheitThirdTest() {
        in = new ByteArrayInputStream("423,11".getBytes());
        convertToFahrenheit();
        Assertions.assertEquals(String.format(OUTPUT_STRING, 793.60), out.toString());
    }
    @Test
    void convertToKelvinsFirstTest() {
        in = new ByteArrayInputStream("-23,8".getBytes());
        convertToKelvins();
        Assertions.assertEquals(String.format(OUTPUT_STRING, 249.35), out.toString());
    }
    @Test
    void convertToKelvinsSecondTest() {
        in = new ByteArrayInputStream("326,54".getBytes());
        convertToKelvins();
        Assertions.assertEquals(String.format(OUTPUT_STRING, 599.69), out.toString());
    }
    @Test
    void convertToKelvinsThirdTest() {
        in = new ByteArrayInputStream("0".getBytes());
        convertToKelvins();
        Assertions.assertEquals(String.format(OUTPUT_STRING, 273.15), out.toString());
    }

    /**
     * Метод создаёт объект класса FahrenheitConverter, вводит начальное значение и вызывает метод получающий результат вычислений
     */
    private void convertToFahrenheit() {
        System.setIn(in);
        BaseConverter converter = new FahrenheitConverter();
        getResult(converter);
    }
    /**
     * Метод создаёт объект класса KelvinsConverter, вводит начальное значение и вызывает метод получающий результат вычислений
     */
    private void convertToKelvins() {
        System.setIn(in);
        BaseConverter converter = new KelvinsConverter();
        getResult(converter);
    }

    /**
     * Метод считывающий результат вычисления
     * @param converter объект класса-конвертера
     */
    private void getResult(BaseConverter converter) {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        converter.convert();
        System.out.print(converter);
    }

}
