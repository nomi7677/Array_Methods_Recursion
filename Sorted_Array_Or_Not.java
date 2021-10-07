package com.firstpackage;

public class Sorted_Array_Or_Not {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,10,6,30,20,50};
        boolean isSorted=true;
        for (int i=0; i <arr.length-1; i++){
            if (arr[i] > arr[i+1]){
                    isSorted = false;
                    break;

            }
        }
        if(isSorted){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
}
