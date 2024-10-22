package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        String result = "long";
        if (Integer.MIN_VALUE <= Long.parseLong(input) && Integer.MAX_VALUE >= Long.parseLong(input))
            result = "int";
        if (Short.MIN_VALUE <= Long.parseLong(input) && Short.MAX_VALUE >= Long.parseLong(input))
            result = "short";
        if (Byte.MIN_VALUE <= Long.parseLong(input) && Byte.MAX_VALUE >= Long.parseLong(input))
            result = "byte";
        return result;
    }

    public static void main(String[] args) {

    }

}
