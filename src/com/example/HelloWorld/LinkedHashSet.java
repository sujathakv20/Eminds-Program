package com.example.HelloWorld;


    import java.util.*;
public class LinkedHashSet {

    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("Dal");
        set.add("Rice");
        set.add("curd");
        set.add("fruits");

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        {
        }
    }
}