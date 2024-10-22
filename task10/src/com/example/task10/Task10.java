package com.example.task10;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.

        boolean result = FALSE;
        if((int)a == (int)b){
            String fractionalA = Float.toString(a);
            String fractionalB = Float.toString(b);
            fractionalA = fractionalA.substring(fractionalA.lastIndexOf(".") + 1);
            fractionalB = fractionalB.substring(fractionalB.lastIndexOf(".") + 1);
            if (fractionalA.length() > precision)
                fractionalA = fractionalA.substring(0, precision);
            else
                while (fractionalA.length() < precision)
                    fractionalA += "0";
            if (fractionalB.length() > precision)
                fractionalB = fractionalB.substring(0, precision);
            else
                while (fractionalB.length() < precision)
                    fractionalB += "0";
            if(fractionalA.equals(fractionalB))
                result = TRUE;
        }
        return result;

    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;

        boolean result = compare(sum, c, 2);
        System.out.println(result);
    }

}
