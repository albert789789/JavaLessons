package com.mycompany.prepare.threads.sync;

public class Counter {

    long count = 0;

    public synchronized void add(long value){
        this.count += value;
    }
}
