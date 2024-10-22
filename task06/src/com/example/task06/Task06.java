package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int num = Math.abs(x + y);
        int count = 1;
        while (num >= 10){
            count++;
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = solution(12, 34);
        System.out.println(result);
        */
    }

}
