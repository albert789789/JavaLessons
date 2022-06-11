package com.less;

public class FlowControl2 {

    public static void main(String[] args) {

        int sum = 0;
        int x = 1;

        while(x <= 100) {
            sum = sum + x;
            ++x;
        }
        System.out.println(sum);
    }
}
