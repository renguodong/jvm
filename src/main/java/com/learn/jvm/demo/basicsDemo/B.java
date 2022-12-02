package com.learn.jvm.demo.basicsDemo;

/**
 * @Author RGD
 * @Date: 2022/8/22 13:34
 * @description:
 */
public class B extends A {

    static {
        System.out.println("B---static");
    }

    {
        System.out.println("B---method");
    }

    public B() {
        System.out.println("B---constructor");
    }
}
