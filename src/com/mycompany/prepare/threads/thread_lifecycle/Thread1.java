package com.mycompany.prepare.threads.thread_lifecycle;

public class Thread1 extends Thread {
    private final Object obj;
    private final Object obj2;
    int cnt;
    public Thread1(Object obj,Object obj2) {
        this.obj = obj;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        synchronized (obj) {
            try {
                System.out.println("nm:"+this.getName()+",state:"+this.getState().toString()+",Before Wait().");
                obj.wait();
                System.out.println("nm:"+this.getName()+",state:"+this.getState().toString()+",After Wait().");
                synchronized (obj2) {
                    cnt++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
