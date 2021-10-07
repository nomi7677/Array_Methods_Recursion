package com.firstpackage;

public class Reverse_Array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,34,67};
        int l = arr.length;
        int highest_Div = Math.floorDiv(l,2);
        int temp;

        for (int i=0; i <highest_Div; i++){
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }
        for(int element:arr){
            System.out.print(element+ " ");
        }

    }
}