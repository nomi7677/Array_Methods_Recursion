package com.firstpackage;

public class Factorial_Recursion {

    //Using simple method to get the factorial
    static int fact(int n){
if(n==0 || n==1){
    return 1;
} else{
    return n *fact(n-1);
}
    }

    //Using recursion method to get the factorial
    static int factorial_recursive(int n){
        if(n==0 || n==1){
            return 1;
        }else {
            int product=1;
            for (int i=1; i<=n; i++){
                product *=i;
            }
            return product;
        }
    }


    public static void main(String[] args) {

int x=4;
        System.out.println(fact(x));
        System.out.println(factorial_recursive(x));

    }
}
