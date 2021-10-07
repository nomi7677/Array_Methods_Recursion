package com.firstpackage;

public class Max_Number_Of_Array {
    public static void main(String[] args) {
        int [] arr = {1,5,25,45,56,101,77,88};
        int max=0;
        for (int e:arr){
            if(e>max){
                max=e;
            }

        }
        System.out.println("Max number is: " + max);
    }
}
