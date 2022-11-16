package com.example.HelloWorld;

public class CountDigits {
    public static void main(String[] args) {
                int num=8765432;
                int count=0;
        while (num != 0) {
            num /= 10;
            ++count;
        }

        System.out.println("Number of digits: " + count);
    }
}