package com.learn.jvm.demo.basicsDemo;

/**
 * @Author RGD
 * @Date: 2022/11/18 21:52
 * @description:
 */
public class LambdaDemoMain {
    public static void main(String[] args) {

//        LambdaDemoInterface lambdaDemoInterface1 = () -> System.out.println("lambda1");
//        lambdaDemoInterface1.lambda1();
        LambdaDemoInterface lambdaDemoInterface2 = a -> a;
        lambdaDemoInterface2.lambda2(1);
        new Thread();
        new Thread(() -> {

        });
    }
}
