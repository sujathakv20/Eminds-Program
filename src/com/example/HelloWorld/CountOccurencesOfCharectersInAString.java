package com.example.HelloWorld;

public class CountOccurencesOfCharectersInAString {
    public static void main(String[] args) {
        String s="Java is a good programming language";
        int totalcount=s.length();
        int totalcount_afterremove=s.replace("a","").length();
        int count=totalcount-totalcount_afterremove;
        System.out.println("System occorences of a is:"  +count);
    }
}
