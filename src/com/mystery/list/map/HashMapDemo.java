package com.mystery.list.map;

import java.util.*;

/**
 * @program: DemoTest
 * @description: HashMap
 * @author: cheng
 * @create: 2020-06-10 16:33
 */
public class HashMapDemo {
    public static void main(String[] args) {
        /** HashMap实现原理
         *（1）基于数组，链表，红黑二叉树（JDK1.8）
         *（2）默认加载因子0.75，达到后会增加内存（默认数组初始容量16）
         *（3）把对象存储到哈希表中：把key对象通过hash()方法计算hash值，然后用这个hash值对数组长度取余
         *（默认16），来决定该对KEY对象在数组中存储的位置，当这个位置有多个对象时，以链表的结构存储，JDK1.8后，
         *当链表的长度大于8时，链表将转成红黑二叉树的结构存储。这样做可以让取值更快，数据的量越大时，性能越明显。
         *（4）扩充原理：当数组容量超过了0.75，则表示数组需要扩充，当前数组容量<<1（即扩大为原来的两倍），扩充次数
         *过多会影响性能，每次扩充表示哈希表重新散列（重新计算每个对象的存储位置），开发时尽量减少扩充次数，减少
         *性能问题。
         *（5）线程不安全，适合在单线程中使用。
         */
        //创建集合
        Map<Integer,String> map = new HashMap<>();
        //添加集合元素
        map.put(1, "Tom");
        map.put(2, "Jack");
        map.put(3, "Mimi");
        map.put(4, "MM");
        map.put(5, "Tony");
        map.size();

        /*map集合的遍历（5种方式）*/
        /*方式一：map.entrySet()*/
        Set<Map.Entry<Integer,String>> es = map.entrySet();
        for (Map.Entry<Integer,String> e : es) {
            System.out.println(e.getKey()+"->"+e.getValue());
        }
        /*方式二：通过 map.keySet()+增强for*/
        Set<Integer> set = map.keySet();
        for(Integer i : set){
            System.out.println(i+"-->"+map.get(i));
        }
        /*方式三： 通过 map.values()*/
        Collection<String> c = map.values();
        for (String s : c) {
            System.out.println(s+"--->");
        }
        /*方式四： map.forEach*/
        map.forEach((key,value)->{
            System.out.println(key+"---->"+value);});
        /*方式五： map.entrySet()+迭代器 */
        Iterator it = set.iterator();
        while(it.hasNext()){
            Integer s = (Integer)it.next();
            System.out.println(s+"----->"+map.get(s));
        }
    }
}
