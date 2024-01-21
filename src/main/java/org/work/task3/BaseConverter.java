package org.work.task3;

public abstract class BaseConverter {
    protected double inputVal;
    protected double resultVal;

    public BaseConverter() {
        inputVal = InputValidator.getCelsiusFromUser();
    }

    /**
     * Метод, используемы для конвертации. Внутри вычисляется значение переменной resultVal по нужной формуле
     */
    public abstract void convert();

    @Override
    public String toString() {
        return String.format("Результат конвертации - %.2f", resultVal);
    }
}
