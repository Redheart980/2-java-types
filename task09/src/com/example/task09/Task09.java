package com.example.task09;

public class Task09 {

    public static double solution() {
        // TODO Устраните ошибку вычисления выражения, не изменяя типы данных у переменных

        float a = 1.0f;
        float b = 3.0f;
        double x = (a / b - (float)1.0 / (float)3.0) * 1.0e9;
        //Значения 1.0 и 3.0 являются именно значениями, а не переменными, так что надеюсь что понял верно задачу x)
        return x;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение
        /*
        System.out.println(solution());
        */
    }

}
