package org.work.task3;

public class Main {
    public static void main(String[] args) {
        BaseConverter converter;
        switch (ConversionChoice.makeConversion()) {
            case 1 -> converter = new FahrenheitConverter();
            case 2 -> converter = new KelvinsConverter();
            default -> {
                System.out.println("Я не знаю такого варианта, буду переводить в Фаренгейты");
                converter = new FahrenheitConverter();
            }
        }
        System.out.println(converter.convert(InputValidator.getCelsiusFromUser()));
    }
}
