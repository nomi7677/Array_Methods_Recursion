package com.firstpackage;

public class Sum_Of_FloatingNumbers {
    public static void main(String[] args) {
    float [] marks = {75.5f, 67.5f,85.5f,90.5f};
    float sum =0;

    // using for each loop
        // syntax is as following
        // for (Data_Type Variable_Name:Array_Name){}

    for(float element:marks){
        sum= sum + element;
    }
        System.out.println(sum);
    }
}
