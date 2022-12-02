package com.learn.jvm.demo.basicsDemo;

import java.io.Serializable;

/**
 * @Author RGD
 * @Date: 2022/8/22 13:33
 * @description:
 */
public class A implements Serializable {

    private static final long serialVersionUID = 2641968794541042036L;

    static {
        System.out.println("A---static");
    }

    protected char c;
    protected int i;
    private String s;

    {
        System.out.println("A---method");
    }

    public A() {
        System.out.println("A---constructor");
    }

    private String getS() {
        return s;
    }

    private void setS(String s) {
        this.s = s;
    }

    private char getC() {
        return c;
    }

    private void setC(char c) {
        this.c = c;
    }

    private void fun() {
        System.out.println("");
    }
}
