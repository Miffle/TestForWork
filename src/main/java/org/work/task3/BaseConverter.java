package org.work.task3;

import java.util.Scanner;

public class BaseConverter {
    /**
     * Класс для конвертации градусов по Цельсию в Фаренгейты или Кельвины.
     * В консоль выводится меню (до цикла и в случае, если пользователь ввёл неправильный пункт).
     * Пользователь вводит целочисленное значение для выбора нужного пункта в меню и происходит конвертация.
     */
    private final double celsius;
    private double convertedValue;

    public BaseConverter() {
        this.celsius = getCelsiusFromUser();
    }

    private void showMenu() {
        System.out.println("""
                Во что будем переводить?
                1) Фаренгейты
                2) Кельвины""");
    }

    public void conversion() {
        showMenu();
        int convertTo = conversionChoice();
        while (convertTo != 0) {
            switch (convertTo) {
                case 1 -> {
                    convertToFahrenheit();
                    convertTo = 0;
                }
                case 2 -> {
                    convertToKelvins();
                    convertTo = 0;
                }
                default -> {
                    System.out.println("Неправильно выбран пункт меню");
                    showMenu();
                    convertTo = conversionChoice();
                }
            }
        }
    }

    public double getCelsius() {
        return celsius;
    }

    public double getConvertedValue() {
        return convertedValue;
    }

    private void convertToFahrenheit() {
        convertedValue = Math.round((celsius * (9.0 / 5.0) + 32) * 100) / 100.0;
    }

    private void convertToKelvins() {
        convertedValue = Math.round((celsius + 273.15) * 100) / 100.0;
    }

    private int conversionChoice() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Введено неправильное значение");
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Введённое значение - %.3f Полученное значение - %.3f", celsius, convertedValue);
    }

    private double getCelsiusFromUser() {
        System.out.println("Введите градусы по Цельсию");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                return scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Введено неверное значение градусов? Попробуй заново");
            }
        }
    }
}
