package com.learn.jvm.demo.basicsDemo;

/**
 * @Author RGD
 * @Date: 2022/8/22 13:34
 * @description:
 */
public class BasicsMain {
    public static void main(String[] args) {
        char a;
        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 2) {
                    break; //
                }
                System.out.println("J" + j);
            }
            if (i == 2) {
                break; //
            }
            System.out.println("i" + i);
        }
    }
}
