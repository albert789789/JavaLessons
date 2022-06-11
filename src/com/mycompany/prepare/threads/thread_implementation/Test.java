package com.mycompany.prepare.threads.thread_implementation;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new ThreadImpl("THREAD1", 5);
        Thread t2 = new ThreadImpl("THREAD2", 8);
        t.start();
        t2.start();

        t.join();
        t2.join();
        System.out.println("--------------------------------------------------------");

        Thread t3 = new Thread(new RunImpl("THREAD3", 4));
        Thread t4 = new Thread(new RunImpl("THREAD4", 7));

        t3.start();
        t4.start();
    }
}
