package com.less;

public class Test {

    public static void main(String[] args) {

        System.out.println((char)97);
        int z = 200;

        boolean b6 = true; // b6[false]

        System.out.println(b6);

        b6 = false;

        System.out.println(b6);

        int d = 25;  // d[25]

        byte b = 127; // 01111111 [- 2 ^ (n - 1), 2 ^ (n - 1) - 1]

        System.out.println("--------------  " + (64 + 32 + 16 + 8 + 4 + 2 + 1));
        byte b2 = -128; // 10000000

        short s = 125;
        short s2 = -6000;

        long l = 3_000_000_000L;

        char c = 'a'; // c[a]
        System.out.println(c);


        System.out.println(12.96  + 56.85);
        double e = 12.36;
        float f = 15.96F;

        short s7 = 300; // 00000001 00101100
        int r = s7;

        byte b1 =  (byte) s7; // 00101100

        System.out.println("------------------------    " + b1);

        short ss = 400;
        byte bb = (byte) ss;



        // 0011 0111
        //         1
        // 0011 1000

        //00000001 10010000  - 400
        // 10010000
        // 01101111
        // 01110000
        System.out.println(bb);
        System.out.println(-(64 + 32 + 16));

        short s3 = 387;
        byte b3 = (byte) s3;
        System.out.println(b3);
    }
}

// tramabanakan artahaytutyunneri arjeqner
// boolean

// amboxj tver
// byte - 1 // signed [-128, ]
// short- 2
// int - 4
// long-8

// simvolner
// char - 2 // unsigned


// irakan tver
// float
// double
