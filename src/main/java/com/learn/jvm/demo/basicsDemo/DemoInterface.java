package com.learn.jvm.demo.basicsDemo;

/**
 * @Author RGD
 * @Date: 2022/8/23 0:41
 * @description:
 */
public interface DemoInterface {

    int a = 0;

    static void fun1() {
        System.out.println("interface --- static");
    }

    void fun();

    default void fun2() {
        System.out.println("interface --- default");
    }

}
