package com.mystery.list.list;


import java.util.LinkedList;
import java.util.List;

/**
 * @program: DemoTest
 * @description: LinkedList
 * @author: cheng
 * @create: 2020-06-10 15:36
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        /*有序不唯一，不适合改查，线程不安全，双向链表*/
        LinkedList<String> list = new LinkedList();
        list.add("LinkedList");

        /*除ArrayList具有的方法外，还具有对首位元素的操作*/
        list.addFirst("首位元素");
        String s = list.removeFirst();
        String first = list.getFirst();
    }
}
/**
 *在实际开发中，如何选择List的具体始实现（ArrayList，Vector，LinkedList）
 *1，安全性问题：单线程选ArrayList，多线程Vector
 *2，是否频繁进行插入，删除操作，是则选LinkedList，否则选ArrayList，Vector
 *3，是否存储后遍历，是则选ArrayList，Vector，否可以选LinkedList
 */
