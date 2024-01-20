package org.work;

import org.work.task1.ThreeNumbers;
import org.work.task2.RepeatedLetters;
import org.work.task3.BaseConverter;
import org.work.task4.TimeCalculation;

public class Main {
    public static void main(String[] args) {
        runFirstTask();
        runSecondTask();
        runThirdTask();
        runFourthTask();
    }

    private static void runFirstTask() {
        printSeparator(1);
        ThreeNumbers firstTask = new ThreeNumbers();
        System.out.println(firstTask);
    }

    private static void runSecondTask() {
        printSeparator(2);
        System.out.println(RepeatedLetters.getRepeatedLetter("Hello"));
    }

    private static void runThirdTask() {
        printSeparator(3);
        BaseConverter converter = new BaseConverter();
        converter.conversion();
        System.out.println(converter);
    }

    private static void runFourthTask() {
        printSeparator(4);
        TimeCalculation.calculateDegree(9,22);
    }
    private static void printSeparator(int taskNumber){
        System.out.printf("-------Task %d-------%n", taskNumber);
    }
}