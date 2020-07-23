package com.mystery.list.list;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @program: DemoTest
 * @description: ArrayList
 * @author: cheng
 * @create: 2020-06-10 15:04
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        /**
        * 有序不唯一，不适合增删，线程不安全，动态数组，初始容量10，扩展1.5
        * */

        /*-- 常用方法*/
        List<String> list = new ArrayList<>();
        list.add("ArrayList");
        list.add("添加");
        list.add("元素");

        int size = list.size();

        boolean b1 = list.contains("ArrayList");

        int index1 = list.indexOf("ArrayList");

        boolean b2 = list.isEmpty();

        int index2 = list.lastIndexOf("ArrayList");//从后往前找，没有则输出-1

        boolean b3 = list.remove("ArrayList");

        String str = list.set(1,"arraylist");//返回被修改的元素

        String [] arr = list.toArray(new String[]{});

        /*遍历方式（3种）:普通for，增强for，迭代器*/
        for (String s : list) {
            System.out.print(s+"-->");
        }
        System.out.println();

        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+"-->");
        }
        System.out.println();

        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+"-->");
        }
    }
}
