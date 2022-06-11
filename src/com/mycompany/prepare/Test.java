package com.mycompany.prepare;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

        System.out.println(arr.length);

        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
        System.out.println(arr[2].length);

        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr[i].length; ++j) {
                arr[i][j] = 17 + i + j;
            }
         }

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

        /*
 arr    []    [][][][]
        []    [][][][]
        []    [][][][]


         */
    }
}
