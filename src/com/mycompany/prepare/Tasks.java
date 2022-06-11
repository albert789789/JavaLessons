package com.mycompany.prepare;

import java.util.Arrays;

public class Tasks {

    public static void main(String[] args) {

        System.out.println("Test 01");

        System.out.println("Test 02");

        System.out.println("Test 03");
    }

    /*  Begin6   - 12
        Даны длины ребер a, b, c прямоугольного параллелепипеда.
        Найти его объем V = a·b·c и площадь поверхности S = 2·(a·b + b·c + a·c).
     */

    /*
        Integer6◦. - 12
        Дано двузначное число. Вывести вначале его левую цифру (десятки),
        а затем — его правую цифру (единицы).
        Для нахождения десятков использовать операцию деления нацело,
        для нахождения единиц — операцию взятия остатка от деления.
     */

    /*
        Boolean6◦. - 12
        Даны три целых числа: A, B, C.
        Проверить истинность высказывания: «Справедливо двойное неравенство A < B < C».
     */

    /*
        If6◦. 15
        Даны два числа. Вывести большее из них.
     */

    /*
            Case6. -  15
            Единицы длины пронумерованы следующим образом:
            1 — дециметр, 2 — километр, 3 — метр, 4 — миллиметр, 5 — сантиметр.
            Дан номер единицы длины (целое число в диапазоне 1–5) и
            длина отрезка в этих единицах (вещественное число).
            Найти длину отрезка в метрах.
     */

    /*
            For6. 17
             Дано вещественное число — цена 1 кг конфет.
            Вывести стоимость 1.2, 1.4, ..., 2 кг конфет
     */

    /*
            Дано целое число N (>0).
            Найти двойной факториал N:
            N!! = N·(N−2)·(N−4)·...
             (последний сомножитель равен 2, если N — четное, и 1, если N — нечетное).
             Чтобы избежать целочисленного переполнения,
             вычислять это произведение с помощью вещественной переменной и
             вывести его как вещественное число
     */


    static void boolean1() {
        int a = 15;

        boolean res = a > 0;

        System.out.println("res = " + res);
    }

    static void case1() {
        int x = 1;

        switch(x) {
            case 1:
                System.out.println("понедельник");
                break;
        }


        int y = 6;
        switch(y) {
            case 12: case 1: case 2:
                System.out.println("zima");
                break;
            case 3: case 4: case 5:
                System.out.println("vesna");
                break;
            case 6: case 7: case 8:
                System.out.println("leto");
                break;
            case 9: case 10: case 11:
                System.out.println("osen");
                break;
        }


        System.out.println();
    }

    /*
     Дано целое число N (>0).
     Сформировать и вывести целочисленный массив размера N,
     содержащийN первыхположительныхнечетныхчисел: 1, 3, 5, ... .
    */
    static void array1() {

        int n = 6; // 1   3   5  7  9  11
        int[] arr = new int[n];
        int a = 1;
        for(int i = 0; i < arr.length; ++i) {
            arr[i] = a;
            a += 2;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void array3() {
        double a = 12.25;
        double d = 2.25;

        int n = 7;
        double[] arr = new double[n]; // 12.25, 14.5, 16.75,


    }

    static void array5() {

        int n = 7;

        int[] arr = new int[n];

        arr[0] = arr[1] = 1;

        for(int i = 2; i < arr.length; ++i) {

            arr[i] = arr[i - 1] + arr[i - 2];

        }

        System.out.println(Arrays.toString(arr));

    }

    static void array18() {
        //           0    1  2   3   4   5   6  7    8   9
        int[] arr = {29, 47, 25, 62, 25, 60, 85, 88, 32, 80};
        int lastElement = arr[arr.length - 1];
        boolean exists = false;
        for(int i = 0; i < arr.length - 1; ++i) {
            if(arr[i] < lastElement) {
                System.out.println(arr[i]);
                exists = true;
                break;
            }
        }
        if(!exists) {
            System.out.println(0);
        }
    }

    static void testContinue() {
        int sum = 0;
        for(int i = 1;
            i < 11;
            ++i) {
            if(i % 3 == 0) {
                continue;
            }
            sum += i;
        }

        System.out.println(sum);
    }

     //

}
