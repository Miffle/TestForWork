package org.work.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тесты третьего задания")
class BaseConverterTest {
    private BaseConverter converter;
    @Test
    void convertToFahrenheitFirstTest() {
        createFahrenheitConverter();
        Assertions.assertEquals(53.6, converter.convert(12));
    }

    @Test
    void convertToFahrenheitSecondTest() {
        createFahrenheitConverter();
        Assertions.assertEquals(610.52, converter.convert(321.4));
    }

    @Test
    void convertToFahrenheitThirdTest() {
        createFahrenheitConverter();
        Assertions.assertEquals(-26.97, converter.convert(-32.76));
    }

    @Test
    void convertToKelvinsFirstTest() {
        convertToKelvins();
        Assertions.assertEquals(249.35, converter.convert(-23.8));
    }

    @Test
    void convertToKelvinsSecondTest() {
        convertToKelvins();
        Assertions.assertEquals(599.69, converter.convert(326.54));
    }

    @Test
    void convertToKelvinsThirdTest() {
        convertToKelvins();
        Assertions.assertEquals(273.15, converter.convert(0));
    }

    /**
     * Метод создаёт объект класса FahrenheitConverter
     */
    private void createFahrenheitConverter() {
        converter = new FahrenheitConverter();
    }

    /**
     * Метод создаёт объект класса KelvinsConverter
     */
    private void convertToKelvins() {
        converter = new KelvinsConverter();
    }


}
