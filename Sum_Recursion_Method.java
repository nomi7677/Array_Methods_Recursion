package com.firstpackage;
// Find sum of natural numbers using recursion method
public class Sum_Recursion_Method {

    static int SumRec(int n){
        if(n==1){
            return 1;
        }else{
            return n + SumRec(n-1);
        }
    }


    public static void main(String[] args) {
    int x=3;
        System.out.println(SumRec(x));
    }
}
