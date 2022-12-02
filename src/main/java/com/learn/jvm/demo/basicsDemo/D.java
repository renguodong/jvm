package com.learn.jvm.demo.basicsDemo;

import java.util.List;

/**
 * @Author RGD
 * @Date: 2022/9/13 2:06
 * @description:
 */
public class D {

    public static void test1(List<?> list) {
        list.add(null);
        list.stream().forEach(System.out::println);
    }

    public static <T> void test1(List<T> list, T t) {
        list.add(t);
    }

    public static <T extends Number> void printListTExtend(List<T> list) {
        for (Number e : list) {
            System.out.print(e + " ");
        }
        System.out.println("");
    }

    public static void printList(List<?> list) {
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }

    public static <T extends Object> void printList1(List<T> list) {
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }

}
