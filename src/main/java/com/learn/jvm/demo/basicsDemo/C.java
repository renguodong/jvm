package com.learn.jvm.demo.basicsDemo;

import java.util.List;

/**
 * @Author RGD
 * @Date: 2022/9/13 2:06
 * @description:
 */
public class C extends B {

    public static List<?> test1(List<?> list) {

        list.stream().forEach(System.out::println);
        return list;
    }

}
