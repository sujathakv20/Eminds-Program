package com.example.HelloWorld;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[]={9,5,2,3,6,3,1};
        System.out.println("Array before sorting;" + Arrays.toString(a));
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)

                if(a[j]>j+1)
            {
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
}
