package com.firstpackage;

public class Fibonacci_Sum_Recursion {

    // Fibonacci series is sum of last 2 numbers starting always from 0 and 1
    // n values: 1 2 3 4 5 6 7 8  9  10 11
    //           0 1 1 2 3 5 8 13 21 34 55 and so on
    static int fib(int n){
        if (n==1){  // means first element which is 0
            return 0;
        }else if(n==2){ // means second element which is 1
            return 1;
        }else{
            return fib(n-1)+fib(n-2);   // suppose n = 7 so n-1 =6th term which is 5 and n-2=5th term which is 3 (5+ 3) = 8
        }
    }

    public static void main(String[] args) {
        int result = fib(7);
        System.out.println(result);
    }
}
