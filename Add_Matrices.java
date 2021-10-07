package com.firstpackage;

public class Add_Matrices {
    public static void main(String[] args) {
        // 2x3 matrix (2 rows and 3 columns

        int [][] mat1 = {{1,2,3},
                         {4,5,6}};
        int [][] mat2 = {{7,8,9},
                         {10,11,12}};

        int [][] result = {{0,0,0},
                           {0,0,0}};

        for(int i=0; i<mat1.length;i++) { // prints row number of times
            for (int j = 0; j < mat1[i].length; j++) {// prints column number of times

                System.out.format("Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }

        }
        // printing values for 2x3 matrix
            for(int i=0; i<mat1.length;i++){ // prints row number of times
                for(int j=0; j<mat1[i].length;j++) {// prints column number of times

                    System.out.print(result[i][j] + " ");
                    result[i][j] = mat1[i][j] + mat2[i][j];
                }
                System.out.println("");
        }
    }
}
