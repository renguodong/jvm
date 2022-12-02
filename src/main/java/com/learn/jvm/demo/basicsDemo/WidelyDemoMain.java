package com.learn.jvm.demo.basicsDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author RGD
 * @Date: 2022/8/22 13:34
 * @description:
 */
public class WidelyDemoMain {
    public static void main(String[] args) {
        C c = new C();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        C.test1(list);

        D d = new D();
        D.printList(list);
        D.printList1(list);
    }
}
