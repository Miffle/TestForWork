package org.work.task3;


public class FahrenheitConverter extends BaseConverter {
    /**
     * Формула для конвертации выглядит следующим образом: <br>(<b>x</b>°C × 9/5) + 32 = <b>y</b> F. <br>Для округления до двух знаков после
     * запятой, полученный результат вычислений был умножен на 100 <br>(321,321321321 -> 32132,1321321), <br>округлен до целых<br>
     * (32132,1321321 -> 32132) <br>и разделен на 100.0 <br>(32132 -> 321,32)
     */
    @Override
    public double convert(double inputVal) {
        return Math.round((inputVal * (9.0 / 5.0) + 32) * 100) / 100.0;
    }
}
