package com.learn.jvm.demo.basicsDemo;

/**
 * @Author RGD
 * @Date: 2022/8/22 13:34
 * @description:
 */
public class DemoMain {
    public static void main(String[] args) {
//        A a = new A();
//        System.out.println( a.c);
        A ab = new B();
//        B b = new B();
//        C c = new C();
//        A ac = new C();
//        System.out.println(ac instanceof A);
//        System.out.println(AbstractDemo.a);;

        //增强for给数组元素直接赋值
//        int[] arr2 = new int[3];
//        for(int e:arr2){
//            e = 10;//不可以给数组的元素赋值
//        }
//
//        for(int e:arr2){//把数组arr里面的元素依次赋值给e,
//            System.out.print(e+"\t");
//        }
//        b.toString();
//        List<String> strings = List.of("one","two","three","four");
//        DemoInterface.fun1();
//        DemoInterfaceImpl demoInterface = new DemoInterfaceImpl();
//        DemoInterface demoInterface1 = new DemoInterfaceImpl();
//        fun();

//        Arrays.copyOf( arr, 1);
//        Arrays.binarySearch(arr, 1);
//        System.out.println(arr[0]);
//        String a = "a";
//        String b = "a";
//        String c = new String("a");
//        System.out.println(a == c);
//        String str6 = "b";
//        String str7 = "a" + str6;
//        System.out.println(str7.hashCode());
//        String str67 = "ab";
//        System.out.println(str67.hashCode());
//        System.out.println("str7 = str67 : "+ (str7 == str67));
//        String ab = "a" + "b";
//        System.out.println(ab.hashCode());
//        System.out.println(str7 == ab);
//        System.out.println(str67 == ab);
//
//        StringBuilder sb = new StringBuilder();
//        StringBuffer sbf = new StringBuffer();

    }

    public static void fun() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
