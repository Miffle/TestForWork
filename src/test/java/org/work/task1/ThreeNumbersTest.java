package org.work.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@DisplayName("Тесты первого задания")
class ThreeNumbersTest {
    private double[] testArray;
    private ThreeNumbers firstTask;
    @BeforeEach
    void getTestArray() {
        firstTask = new ThreeNumbers();
        testArray = Arrays.copyOf(firstTask.getArray(), firstTask.getArrayLength());
        Arrays.sort(testArray);
    }

    @Test
    void testSum() {
        double sum = Arrays.stream(testArray).sum();
        Assertions.assertEquals(sum, firstTask.getSum(), "Сумма была посчитана неверно");
    }

    @Test
    void testMax() {
        double maxNum = testArray[testArray.length - 1];
        Assertions.assertEquals(maxNum, firstTask.getMaxNum(), "Максимальное число определено неверно");
    }

    @Test
    void testMin() {
        double minNum = testArray[0];
        Assertions.assertEquals(minNum, firstTask.getMinNum(), "Минимальное число определено неверно");
    }

    @Test
    void testAVG() {
        double avgNum = Arrays.stream(testArray).sum() / testArray.length;
        Assertions.assertEquals(avgNum, firstTask.getAvg(), "Среднее число было определено неверно");
    }
}