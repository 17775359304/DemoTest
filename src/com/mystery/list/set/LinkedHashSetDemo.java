package com.mystery.list.set;

import com.mystery.list.util.Cat;

import java.util.LinkedHashSet;

/**
 * @program: DemoTest
 * @description: LinkedHashSet
 * @author: cheng
 * @create: 2020-06-10 16:28
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        /*LinkedHashSet:哈希表和链表的实现*/


        //创建集合，添加集合元素
        LinkedHashSet<Cat> set = new LinkedHashSet<>();
        Cat c1 = new Cat("miaomiao",5);
        Cat c2 = new Cat("huahua",4);
        Cat c3 = new Cat("tom",3);
        Cat c4 = new Cat("mm",5);
        set.add(c1);
        set.add(c2);
        set.add(c3);
        set.add(c4);

        //常用方法
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }
    /**
     *如果不用排序，也不用保证顺序---> HashSet
     *如果要排序---------------> TreeSet
     *如果只要保证顺序-----------> LinkedHashSet
     */
}
