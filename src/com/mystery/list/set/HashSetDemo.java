package com.mystery.list.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @program: DemoTest
 * @description: HashSet
 * @author: cheng
 * @create: 2020-06-10 15:50
 */
public class HashSetDemo {
    public static void main(String[] args) {
        /*
         * Set接口
         * public interface Set<E>extends Collection<E>
         * 一个不包含重复元素的collection。要确切的讲，set不包含e1.equals(e2)的元素对e1和e2
         * 并且最多包含一个null元素，此接口模仿了数学上的set抽象；
         * 1，无序的（不保证顺序）
         * 2，不允许有重复的元素
         * HashSet，TreeSet，LinkedHashSet
          */

        /*
         * HashSet
         *类实现Set接口，由哈希表（数组加链表，实际上是一个HashMap实例）支持。不能保证set的迭代顺序；特别是不能保证该顺序恒久不变，此类允许使用null元素。
         *无序唯一，重复的元素添加不进去
         */
        Set<String> set=new HashSet<>();
        set.add("1111");
        set.add("2222");
        set.add("3333");
        set.add("4444");
        set.add("5555");
        set.add("1111");//重复的添加不进去
        System.out.println(set.size());//5

        /*set集合的遍历（两种）：增强for，迭代器*/
        for (String s : set){
            System.out.println(s);
        }
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
