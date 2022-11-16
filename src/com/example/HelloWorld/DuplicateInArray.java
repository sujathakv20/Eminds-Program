package com.example.HelloWorld;

public class DuplicateInArray {
    public static void main(String[] args) {
        String arr[]={"java","C","C++","Python","perl"};

        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;i< arr.length;i++)
            {
                if(arr[i]==arr[j])
                {
                        System.out.println("Found duplicate element:" +arr[i]);
                        flag=true;
                }

            }
        }
        if(flag==false)
        {
            System.out.println("Duplicate element not found");
        }
    }
}
