package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        float output;
        switch (operation)
        {
            case "+":
                output = a+b;
                break;
            case "-":
                output = a-b;
                break;
            case "/":
                output = (float) a/b;
                break;
            case "*":
                output = a*b;
                break;
            default:
                output = 0;
                break;
        }
        return output;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        float result = calculate(-25, 5, "/");
        System.out.println(result);
        */
    }

}
