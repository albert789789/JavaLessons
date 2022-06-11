package com.less;

import java.util.Arrays;

public class ArraysLessons {

    public static void main(String[] args) {
        int[] arr = new int[4];

        System.out.println(Arrays.toString(arr));

        arr[0] = 24;
        arr[1] = 17;
        arr[2] = 32;
        arr[3] = 95;



        System.out.println(Arrays.toString(arr));

        System.out.println(arr.length);

        arr[2] = 82;

        System.out.println(Arrays.toString(arr));

        System.out.println(arr[arr[arr[1] - 15] - 81]);

        int[][] arr2 = new int[3][4];

        printArr2(arr2);
        System.out.println();
        arr2[0][2] = 25;

        printArr2(arr2);

        int[] a = new int[5]; //  {400}[0][0][0][0][0]
        int[] b = new int[3]; // b[300] -> {300}[0][0][0] <- a[300]

        a = b;

        b[0] = 500;

        System.out.println("a[0] = " + a[0]);

        int x = 50;  // x [40]
        int y = 40; // y [600]
        x = y;
        y = 600;
        System.out.println(x);

        int[] aa = {1000, 200};

        System.out.println(aa.length);

        aa = new int[] {5, 6, 7,8};

        System.out.println(Arrays.toString(aa));


        aa = null; // aa[129]

        aa = new int[2]; // {129}[0][0]

        System.out.println(aa[1]);

        System.out.println();

        int[] zz = new int[1000000];

    }

    static void printArr2(int[][] arr) {
        for(int i = 0; i < arr.length; ++i) {
            int[] ar = arr[i];
            System.out.println(Arrays.toString(ar));
        }
    }
}
