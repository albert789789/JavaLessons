package com.mycompany.prepare;

public class Loops {

    public static void main(String[] args) {

        int n = 7; // 7 * 5 * 3 * 1

        int m = 1; // 1 * 7 * 5 * 3 * 1

        while(n > 0) {
            m = m * n;
            n = n - 2;
        }

        System.out.println(m);




    }
}
