package com.example.HelloWorld;

public class WhiteSpaceRemovalInString {
    public static void main(String[] args) {
        String str="This  is  my  first   task";
        System.out.println("String before removing white spaces:" +str);

        str=str.replaceAll("\\s", "");
        System.out.println("String after removing whitespaces:" +str);
    }
}
