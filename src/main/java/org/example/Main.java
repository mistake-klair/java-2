package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Task_2 task2 = new Task_2();

        int[][] matr1 = {
                {1,2,3,3,0,9},
                {2,3,1,4,0,9},
                {4,5,6,6,6,6},
        };
        System.out.println(Arrays.deepToString(task2.get(matr1)));

        Task_3 task3 = new Task_3();

        int[][] matr2 = {
                {1,1,1,1,1},
                {3,3,3,3,3},
                {3,3,3,3,4},
                {3,3,3,3,2},
                {5,5,5,5,5},
                {2,2,2,2,2},
                {4,4,4,4,4}
        };
        System.out.println(Arrays.deepToString(task3.get(matr2)));
    }
}