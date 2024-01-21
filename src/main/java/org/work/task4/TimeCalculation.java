package org.work.task4;

public class TimeCalculation {
    /**
     * Метод получает на вход час и минуты. Проверяет корректность введённых данных (часы в диапазоне от 0, до 23,
     * минуты от 0, до 59), переводит каждую величину в градусы относительно 12 часов. Например, 2 часа - 60 градусов,
     * 30 минут - 180 градусов. Выводит в консоль модуль разности между часами и минутами.
     *
     * @param hours   часы (int)
     * @param minutes минуты (int)
     */
    public static void calculateDegree(int hours, int minutes) {
        if (isTimeCorrect(hours, minutes)) {
            hours = validateHours(hours);
            double hoursDegree = convertHoursToDegree(hours, minutes);
            double minutesDegree = convertMinutesToDegree(minutes);
            double result = Math.abs(hoursDegree - minutesDegree);
            System.out.printf("Результат: %.2f", result);
        } else {
            System.out.print("Введено неправильное время");
        }
    }

    private static double convertMinutesToDegree(int minutes) {
        return minutes * 6.0;
    }

    private static boolean isTimeCorrect(int hours, int minutes) {
        boolean checkHours = hours > 0 && hours < 24;
        boolean checkMinutes = minutes >= 0 && minutes < 60;
        return checkHours && checkMinutes;
    }

    private static double convertHoursToDegree(int hours, int minutes) {
        return hours * 30 + minutes / 2.0;
    }

    private static int validateHours(int hours) {
        return hours >= 12 ? hours - 12 : hours;
    }
}
