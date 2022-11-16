package com.example.HelloWorld;

public class MaxAndMinValuesInArray {

    public static void main(String[] args) {
        int a[]={50,100,45,68,20};
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if (a[i] > max)
            {
                max =a[i];
            }
        }
        System.out.println("Maximum element inarray is:" +max);

    }
}
