package com.less;

import java.util.Arrays;

public class FlowControl {

    public static void main(String[] args) {

        int x = 40;

        if (false) {
            x = 50;
            x = 41;
        }



        System.out.println(x);

        if(10 < 4) {
            System.out.println(15);
        } else {
            System.out.println(25);
        }


        int z = 10;

        if(z > 50) {
            System.out.println("z > 50");
        } else if(z > 30) {
            System.out.println("z > 30");
        } else {
            System.out.println("z <= 30");
        }

        final int h = 20;
        final int h2 = 9;


        int y = 20;
        switch(y) {
            case 10:
                System.out.println(10);
                break;

            case h - h2:
                System.out.println(20);
                break;

            default:
                System.out.println(3000);


            case 5:
                System.out.println(40);
                break;
        }


        int r = 10;


        int sum = 0; // sum = 1 + 2 + 3 + 4 + ... +100
        int i = 0; //   i = 101
        while(++i <= 100) {

            if(i % 5 == 0) {
                continue;
            }
            sum = sum + i;

        }



        System.out.println("1 + 2 + 3 + ... + 100 = " + sum);

        int t = 1;
        do {
            System.out.println("t = " + t);
            ++t;
        } while(t < 11);

        for(int j = 1;
            j < 10;
            j += 2) {

            if(j == 5) {
                continue;
            }
            System.out.println(j);
        }


        A: for(int u = 1; u < 3; ++u) {

            B: for(int v = 1; v < 3; ++v) {
                if(v == 2) {
                    break A;
                }

                System.out.println("(u,v)=(" + u + "," + v + ")");
            }
        }




        int[] arr =  {10, 20, 30, 40};
        for(int ii = 0; ii < arr.length; ++ii) {
            if(arr[ii] == 20) {
                System.out.println(arr[ii]);
            }
        }
    }
}
