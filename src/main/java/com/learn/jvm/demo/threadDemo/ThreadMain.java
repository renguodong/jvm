package com.learn.jvm.demo.threadDemo;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author RGD
 * @Date: 2022/8/22 13:34
 * @description:
 */
public class ThreadMain {

    private static Object lock1 = new Object();//锁1，资源1
    private static Object lock2 = new Object();//锁2，资源2

    public static void main(String[] args) {
        new Thread();

//        ThreadA a = new ThreadA();
//        Thread thread = new Thread(a, "sss");
//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        thread.start();

        //创建锁对象，保证唯一
//        Object obj =new Object();
//
//        //创建顾客线程
//        new Thread() {
//            @Override
//            public void run() {
//                //保证等待和唤醒只能有一个在执行
//                synchronized (obj) {
//                    System.out.println("告知老板要的包子种类和数量");
//                    //进入等待
//                    try {
//                        obj.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(this);
//                    //唤醒之后执行的代码
//                    System.out.println("拿到包子，开始吃。。。");
//                    System.out.println("---------------------");
//                }
//            }
//        }.start();
//
//        //创建老板线程
//        new Thread() {
//            @Override
//            public void run() {
//                //花5秒钟做包子，
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                //保证等待和唤醒只能有一个在执行
//                synchronized (obj) {
//                    System.out.println("包子做好了。。。。");
//                    //做好包子之后，调用notify方法，通知顾客吃包子，
//                    obj.notify();
//                    System.out.println(this);
//                }
//            }
//        }.start();


//        //启动一个线程
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                synchronized(lock1){
//                    System.out.println(Thread.currentThread().getName()+"拿到了锁1，资源1");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName()+"等待锁2，资源2");
//                    synchronized (lock2){
//                        System.out.println(Thread.currentThread().getName()+"拿到了锁2，资源2");
//                    }
//                }
//            }
//        },"线程1").start();
//
//        //产生死锁的线程
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                synchronized(lock2){
//                    System.out.println(Thread.currentThread().getName()+"拿到了锁2111，资源2");
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName()+"等待锁1，资源1");
//                    synchronized (lock1){
//                        System.out.println(Thread.currentThread().getName()+"拿到了锁1，资源1");
//                    }
//                }
//            }
//        },"线程2").start();

//        //1创建集合
//        CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<>();
//        //2使用多线程操作
//        ExecutorService es= Executors.newFixedThreadPool(5);
//        //3提交任务
//        for(int i=0;i<5;i++) {
//            es.submit(new Runnable() {
//
//                @Override
//                public void run() {
//                    for(int j=0;j<10;j++) {
//                        list.add(Thread.currentThread().getName()+"...."+new Random().nextInt(1000));
//                    }
//                }
//            });
//        }
//        //4关闭线程池
//        es.shutdown();
//        while(!es.isTerminated()) {}
//        //5打印结果
//        System.out.println("元素个数:"+list.size());
//        for (String string : list) {
//            System.out.println(string);
//        }

        //1创建集合
        ConcurrentHashMap<String, String> hashMap = new ConcurrentHashMap<String, String>();
        //2使用多线程添加数据
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {

                @Override
                public void run() {
                    for (int k = 0; k < 10; k++) {
                        hashMap.put(Thread.currentThread().getName() + "--" + k, k + "");
                        System.out.println(hashMap);
                    }
                }
            }).start();
        }
    }
}
