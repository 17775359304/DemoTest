package com.mystery.list.set;

import com.mystery.list.util.Cat;
import com.mystery.list.util.CatCompartor;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @program: DemoTest
 * @description: TreeSet
 * @author: cheng
 * @create: 2020-06-10 16:15
 */
public class TreeSetDemo {
    public static void main(String[] args) {

        /*
         * TreeSet（有序的(自定义排序)，基于TreeMap（二叉树数据结构）），对象需要比较大小，通过对象比较器来实现，对象比较器还可以去除重复值
         * 如果自定义的数据类，没有实现比较器接口，将无法添加到TreeSet集合中（报错，类型转换异常）。
         * 基于TreeMap的NavigableSet实现。使用元素的自然顺序对元素进行排序，或者根据创建set时
         * 提供的Comparator进行排序，具体取决于使用的构造方法。
         */


        //创建TreeSet集合(创建时必须添加比较器类)
        TreeSet<Cat> tree = new TreeSet<>(new CatCompartor());
        Cat c1 = new Cat("miaomiao",5);
        Cat c2 = new Cat("huahua",4);
        Cat c3 = new Cat("tom",3);
        Cat c4 = new Cat("mm",5);//（年龄）重复的添加不了,进不去（比较器里面比较的是年龄）
        //添加对象
        tree.add(c1);
        tree.add(c2);
        tree.add(c3);
        tree.add(c4);
        System.out.println(tree.size());

        /*遍历（增强for，迭代器）*/
        for (Cat cat : tree) {
            System.out.println(cat);
        }
        Iterator it = tree.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
