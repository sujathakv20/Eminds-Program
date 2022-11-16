package com.example.HelloWorld;

import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        Scanner Ln=new Scanner(System.in);

        System.out.println("Enter first number");
        int a=Ln.nextInt();

        System.out.println("Enter Second number");
        int b=Ln.nextInt();

        System.out.println("Enter Third number");
        int c=Ln.nextInt();

        if(a>b && a>c)
        {
            System.out.println("a is largest");
        } else if (b>a && b>c)
        {
            System.out.println("b is largest");
        }
        else
        {
            System.out.println("c is largest");
        }


    }

}
