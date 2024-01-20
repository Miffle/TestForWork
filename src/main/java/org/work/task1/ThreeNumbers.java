package org.work.task1;

import java.util.Arrays;
import java.util.Random;

public class ThreeNumbers {
    /**
     * Класс создаёт массив "случайного" размер от 1, до 50.
     * Заполняет его случайными вещественными числами.
     * Максимальное и минимальное число вычисляются во время заполнения массива.
     * Сумма считается сразу после заполнения.
     */
    private double[] array;
    private int arrayLength;
    private double maxNum = Double.MIN_VALUE;
    private double minNum = Double.MAX_VALUE;
    private double avg;
    private double sum;

    public ThreeNumbers() {
        initArray();
        fillArray();

    }

    private void fillArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
            minNum = Math.min(array[i], minNum);
            maxNum = Math.max(array[i], maxNum);
        }
        sum = Arrays.stream(array).sum();
        avg = sum / arrayLength;
    }

    private void initArray() {
        arrayLength = new Random().nextInt(50);
        array = new double[arrayLength];
    }

    @Override
    public String toString() {
        return "Min - %f, avg - %f, max - %f".formatted(minNum, avg, maxNum);
    }

    public double[] getArray() {
        return array;
    }

    public int getArrayLength() {
        return arrayLength;
    }

    public double getMaxNum() {
        return maxNum;
    }

    public double getMinNum() {
        return minNum;
    }

    public double getAvg() {
        return avg;
    }

    public double getSum() {
        return sum;
    }
}
