package com.mycompany.prepare.threads.thread_lifecycle;

public class ThreadBlockingState {

    public static void main(String[] args) throws InterruptedException {

        final Object obj= new Object();

        final Object obj2 = new Object();

        final Thread1 t1 = new Thread1(obj,obj2);

        t1.start();

        Thread.sleep(1000);

        System.out.println("nm:"+t1.getName()+",state:"+t1.getState().toString()+
                ",when Wait() is called & waiting for notify() to be called.");

        final Thread2 t2 = new Thread2(obj,obj2);

        t2.start();

        Thread.sleep(3000);

        System.out.println("nm:"+t1.getName()+",state:"+t1.getState().toString()+",After calling Wait() & waiting for monitor of obj2.");

        System.out.println("nm:"+t2.getName()+",state:"+t2.getState().toString()+",when sleep() is called.");

        t1.join();

        System.out.println(t1.getState());

    }
}
