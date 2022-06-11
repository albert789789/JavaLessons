package com.mycompany.prepare.threads.sync;

public class CounterThread extends Thread{

    private final Counter counter;

    public CounterThread(Counter counter){
        this.counter = counter;
    }

    public void run() {
        for(int i = 0; i < 1000_000; i++) {
            counter.add(1);
        }
    }
}
