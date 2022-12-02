package com.learn.jvm.demo.basicsDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author RGD
 * @Date: 2022/9/13 2:06
 * @description:
 */
public class ThreadA implements Runnable {
    static int a = 100;
    //创建锁
    private Lock lock = new ReentrantLock();

    public static void sellTicket2() {
        synchronized (ThreadA.class) {
            System.out.println(Thread.currentThread().getName() + "-" + a);
        }
    }

    @Override
    public void run() {
        synchronized (this) {
            sellTicket2();
        }
    }

    /**
     * 锁对象，谁调用这个方法，就是谁
     * 隐含锁对象，就是this
     * <p>
     * 静态方法，隐含锁对象就是Ticket3.class
     */
    public synchronized void sellTicket1() {
        //出票操作
        //使用sleep模拟一下出票时间
        System.out.println(Thread.currentThread().getName() + "-" + a);

    }

    public void sellTicket3() {
        lock.lock();
        lock.unlock();
    }
}
