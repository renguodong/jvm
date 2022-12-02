package com.learn.jvm.demo.basicsDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author RGD
 * @Date: 2022/8/22 13:34
 * @description:
 */
public class ArrayDemoMain {
    public static void main(String[] args) {
//        int[] nums = new int[3];
//        nums[0] = 1;
//        nums[1] = 4;
//        nums[2]  =5;

//        int[] arr = nums;//拷贝的是内存地址，
//        arr[0] = 20;
//        for(int i=0;i<nums.length;i++){
//            System.out.println("nums["+i+"]---->"+nums[i]);
//        }
//        System.out.println();++++
//        int[] arr2 = new int[3];
//
//        for(int i=0;i<nums.length;i++){
//            arr2[i]  = nums[i];//拷贝的是数值。
//        }
//
//        arr2[0] = 90;
//        System.out.println("arr2[0]--->"+arr2[0]);
//        System.out.println("nums[0]--->"+nums[0]);
//        System.out.println(BigDecimal.ZERO.compareTo(BigDecimal.ZERO) < 0);
//        Arrays.asList(nums);
        Collection<String> c1 = new ArrayList<>();
        c1.add("aa");
        c1.add("bb");
        c1.add("cc");
        c1.add("dd");
        //3.2使用迭代器(迭代器专门用来遍历集合的一种方式)
        //hasNext();有没有下一个元素，
        //next();获取下一个元素
        //remove();删除当前元素
        Iterator<String> iterator = c1.iterator();
        while (iterator.hasNext()) {

            System.out.println(iterator.next());
            //不能使用collection删除方法，因为遍历同时不能使用集合删除方法，否则出现并发修改异常。
//            c1.remove(iterator.next());
            //可以使用迭代器的删除方法
            iterator.remove();
        }
    }

}
