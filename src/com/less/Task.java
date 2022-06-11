package com.less;

import java.util.Arrays;

public class Task {

    public static void main(String[] args) {

        // stexcel 20 erkarutyamb masiv
        // arr[i] = i * i;
        // tpum eqn masiv@ Arrays.toString -i mijocov
        // hashvum enq masivi elementneri gumar@ ev tpum

        int[] arr = new int[20];
        int sum = 0;
        for(int i = 0; i < arr.length; ++i) {
            arr[i] = i * i;
            sum += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("sum = " + sum);

        // stexcel [3][4] erkchap masiv
        // arr[i][j] = (i + 1)*(j + 1)
        // tpel erkchap masiv@
        // hashvel erkchap masivi elementneri gumar@ ev tpel

        int[][] arr2 = new int[4][8];

        for(int i = 0; i < arr2.length; ++i) {
            for(int j = 0; j < arr2[i].length; ++j) {
                arr2[i][j] = 0;
            }
        }
    }
}
