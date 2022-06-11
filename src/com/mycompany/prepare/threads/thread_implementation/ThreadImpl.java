package com.mycompany.prepare.threads.thread_implementation;

public class ThreadImpl extends Thread {

    private final String name;

    private final int size;

    public ThreadImpl(String name, int size) {
        if(name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name must be non empty");
        }
        if(size < 1) {
            throw new IllegalArgumentException("Illegal argument: " + size);
        }
        this.name = name;
        this.size = size;
    }

    @Override
    public void run() {
        for(int i = 0; i < size; ++i) {
            System.out.println(name + "\t" + i);
        }
    }
}
