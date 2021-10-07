package com.firstpackage;

public class Number_Present_in_Array {
    public static void main(String[] args) {
        int [] marks = {15, 25,35, 45};
        int num = 25;

        boolean isInArray=false;

        for(int element:marks) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
            if(isInArray){
                System.out.println("Number is present in array");
            }else{
                System.out.println("Number is not in the array");
            }
        }
    }
