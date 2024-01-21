package org.work.task3;

import java.util.Scanner;

public class InputValidator {
    /**
     * Метод, используемый для того, чтобы у пользователя было неограниченное количество попыток ввода градусов,
     * пока значение не будет нужного формата.
     * @return Введенное пользователем значение
     */
    public static double getCelsiusFromUser() {
        System.out.println("Введите градусы по Цельсию");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                return scanner.nextDouble();
            } catch (Exception e) {
                showWrongNumberException();
            }
        }
    }

    /**
     * Метод, используемый для того, чтобы у пользователя было неограниченное количество попыток выбора пункта меню,
     * пока не будет получено целочисленное значение.
     * @return Введенное пользователем значение
     */

    public static int conversionChoice() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                showWrongNumberException();
            }
        }
    }

    private static void showWrongNumberException() {
        System.out.println("Введено неправильное значение");
    }


}
