package com.example.HelloWorld;

public class RemoveJunkOrSpecialCharectersInString {
    public static void main(String[] args) {
        String s="@#%Y latin string %%*&#@!*&$#";
        String s1="#%^**&&^&% hello *&&7785  perl";
        s=s.replaceAll("[^a-zA-Z0-9]" ,"");
        System.out.println(s);

        s1=s1.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s1);

    }
}
