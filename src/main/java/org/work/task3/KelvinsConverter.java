package org.work.task3;


public class KelvinsConverter extends BaseConverter {
    /**
     * Формула для конвертации выглядит следующим образом: <br><b>x</b>°C + 273.15 = <b>y</b> K. <br>Для округления до двух знаков после
     * запятой, полученный результат вычислений был умножен на 100 <br>(321,321321321 -> 32132,1321321), <br>округлен до целых<br>
     * (32132,1321321 -> 32132) <br>и разделен на 100.0 <br>(32132 -> 321,32)
     */
    @Override
    public double convert(double inputVal) {
        return Math.round((inputVal + 273.15) * 100) / 100.0;
    }
}
