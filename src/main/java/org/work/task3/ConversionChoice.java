package org.work.task3;

public class ConversionChoice {
    public static int makeConversion() {
        System.out.println("""
                Во что будем переводить?
                1) Фаренгейты
                2) Кельвины""");
        return InputValidator.conversionChoice();
    }
}
