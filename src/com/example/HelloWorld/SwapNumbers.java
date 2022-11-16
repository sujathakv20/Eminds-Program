package com.example.HelloWorld;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Numbers before swap" + a + " " + b);

        //swapping numbers by using
        //+ &-,,* & /,,X OR ^


        a = a + b;
        b = a - b;
        a = a - b;


        System.out.println("numbers after swapping" + a + " " + b);

    }
}



