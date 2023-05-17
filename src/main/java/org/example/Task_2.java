package org.example;

import java.util.Arrays;

public class Task_2 {
    public int[][] get(int[][] matr){
        int[][] out;
        out = new int[matr.length][];
        for (int i=0;i<matr.length;i++){
            int count = 0;
            for (int j=0;j<matr[i].length;j++){
                int _count = 0;
                for (int j2=0;j2<matr[i].length;j2++){
                    if (matr[i][j] == matr[i][j2]){
                        _count++;
                    }
                }
                if (_count > count)
                    count=_count;
            }
            out[i] = new int[matr[i].length];
            Arrays.fill(out[i],count);
        }
        return out;
    }
}
