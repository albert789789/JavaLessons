package com.less;

public class Test2 {

    public static void main(String[] args) {

        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);

        System.out.println(25.2 / 6);
        System.out.println(25 % 6);

        int x = 20;

        x += 10; // x = (int)(x + 10)

        System.out.println(x);

        byte b = 10; // 00001010


        b += 300; // b = (byte) (b + 300);

        // 00000000 00000000 00000000 00001010
        // 00000000 00000000 00000001 00101100
        // 00000000 00000000 00000001 00110110
        //                            00110110
        System.out.println(b);

        short s = 260;
        System.out.println((short) (s >>> 3));
        s >>>= 3; // s =(short) (s >>> 3)

        System.out.println(s);

        // T s = value; // T -byte, short, int, long, double, float, char
        // s op= k // +, -, *, /, &, |...

        // s = (T) (s op k)

        byte b2 = 110;

        b2 |= 4; // b2 = (byte) (b2 | 4)

        System.out.println("b2 = " + b2);

        byte a = 12;
        short ss = 24;

        int r = ss + a;  // (int)ss + (int)a

        System.out.println(ss + a);

        System.out.println("10 == 10 : " + (10 == 10));

        System.out.println("Postfix and prefix increment and decrement");

        int k = 10;

        int tx = k++;

        System.out.println(tx);
        System.out.println(k);

        int k2 = 10;

        System.out.println(k2--);
        System.out.println(k2);

        int k3 = 10;

        System.out.println(++k3);
        System.out.println(k3);

        int k4 = 10;

        System.out.println(--k4);
        System.out.println(k4);

        System.out.println("END: Postfix and prefix increment and decrement");

        System.out.println(!true);
        System.out.println(~5);

        System.out.println(true && false);
        System.out.println(10 + 20);

        int ff = 45;
        int x10 = false ? 10 : 20;

        System.out.println("x10 = " + x10);

        System.out.println(10 + 20 * 6);

        int zzz = 10;

        if(10 > 20 & zzz++ < 4) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println(zzz);

        System.out.println(10 + 20 + 30);

        int e,f,g;

        e = f = g = 40;

        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }

    static int postfixIncrement(int x) {
        int t = x;
        x = x + 1;
        return t;
    }

    static int prefixIncrement(int x) {
        x = x + 1;
        return x;
    }


}
