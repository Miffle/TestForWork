package org.work.task3;

public class ConversionChoice {
    /**
     * Метод предназначен для вывода меню в консоль и обработки введенного пользователем значения.
     */
    public static void makeChoice() {
        System.out.println("""
                Во что будем переводить?
                1) Фаренгейты
                2) Кельвины""");
        makeConversion();
    }

    private static void makeConversion() {
        switch (InputValidator.conversionChoice()) {
            case 1 -> {
                FahrenheitConverter fahrenheit = new FahrenheitConverter();
                System.out.println(fahrenheit);
            }
            case 2 -> {
                KelvinsConverter kelvinsConverter = new KelvinsConverter();
                System.out.println(kelvinsConverter);
            }
            default -> System.out.println("Такого варианта нет");
        }
    }
}
