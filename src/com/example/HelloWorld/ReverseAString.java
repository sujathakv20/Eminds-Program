package com.example.HelloWorld;

public class ReverseAString {
    public static void main(String[]args){
        String str="ABCD";
        String rev=" ";

        StringBuffer sb=new StringBuffer(str);
        System.out.println(sb.reverse());
    }
}
