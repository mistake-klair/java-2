package org.example;

public class Task_3 {
    public int[][] get(int[][] matr){

        boolean isSorted = false;

        while (!isSorted){
            int[] tempLine;
            int maxSum = 0;
            isSorted=true;
            for (int i = 0;i<matr.length-1;i++){
                int lineSum = 0;
                int nextLineSum = 0;

                if (matr[i].length == 0)
                    continue;

                for (int j = 0; j< matr[i].length;j++) {
                    lineSum+=matr[i][j];
                }

                for (int j = 0; j< matr[i+1].length;j++) {
                    nextLineSum+=matr[i+1][j];
                }

                if (lineSum>nextLineSum) {
                    tempLine = matr[i+1];
                    matr[i+1] = matr[i];
                    matr[i] = tempLine;
                    isSorted = false;
                }
            }
        }
        return matr;
    };
}
