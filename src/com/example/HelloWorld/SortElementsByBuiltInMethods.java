package com.example.HelloWorld;

import java.util.Arrays;

public class SortElementsByBuiltInMethods {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,};

        System.out.println("Array Elements Before Sorting:" + Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println(("Array Elements Before Sorting:" + Arrays.toString(a)));
    }
}
