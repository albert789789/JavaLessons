package com.mycompany.prepare.threads.thread_lifecycle;

public class Thread2 extends Thread {
    private final Object obj;
    private final Object obj2;

    public Thread2(Object obj,Object obj2){
        this.obj = obj;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        synchronized (obj) {
            System.out.println("nm:"+this.getName()+",state:"+this.getState().toString()+",Before notify().");
            obj.notify();
            System.out.println("nm:"+this.getName()+",state:"+this.getState().toString()+",After notify().");
        }
        synchronized (obj2) {
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
