package com.mystery.list.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections类：
 * Collections工具类提供了大量针对Collection/Map的操作，总体可分为四类，都为静态方法
 * 
 * 1，排序操作（主要针对List接口）
 * reverse（List list）：反转指定List集合中的元素顺序
 * shuffle（List list）:对List中的元素进行随机排序（洗牌）
 * sort(List list):对list里的元素进行自然升序排序
 * sort(List list,Comparator c):自定义比较器进行排序
 * swap(List list,int i,int j):将指定的List集合和元素进行交换
 * rotate(List list,int distance):将所有元素向右移位指定长度，如果distance等于size那么结果不变
 * 
 * 2,查找和替换
 * binarySearch(List list,Object key):使用二分法查找，以获得指定对象在List中的索引，前提是已经排序好的集合
 * max(Collection coll):返回最大元素
 * max(Collection coll,Comparator comp):根据自定义比较器，返回最大元素
 * min(Collection coll):返回最小元素
 * min(Collection coll,Comparator comp):根据自定义比较器，返回最小元素
 * fill(List list,Object obj):使用指定对象填充集合
 * frequency(Collection,Object o):返回指定集合中的指定对象出现的次数
 * replaceAll(List list,Object new):替换
 * 
 * 3，同步控制
 * Collections工具类中提供了多个synchronizedXxx方法，该方法返回指定集合对象对应的同步对象，
 * 从而解决多线程并访问集合时的线程安全问题。HashSet，ArrayList，HashMap都是线程不安全的，如
 * 果需要考虑同步，则使用这些方法，有：synchronizedSet,synchronizedSortedSet,synchronizedList,
 * synchronizedMap,synchronizedSortedMap
 * 
 * 4，设置不可变集合
 * 1emptyXxx():返回一个空的不可变的集合对象
 * singletonXXX():返回一个只包含一个指定对象的不可变集合对象
 * unmodifiableXxx:返回指定集合对象的不可变视图
 * 
 * 
 * 5，其他
 * disjoint(Collection<?>c1,Collection<?>c2):如果两个指定的collection中没有相同的元素，则返回true
 * addAll(Collection<?super T>c,T...a):一种方便方式，将所有的指定元素添加到指定的collection中。
 * Comparator<T>reverseOrder(Comparator<T>cmp):返回一个比较器，他强行反转指定比较器的顺序。如果指定比较
 * Comparable接口那些对象collection上的自然顺序。
 * 
 */
public class CollectionDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("jack");
		list.add("tom");
		list.add("lily");
		
		System.out.println("----------1，排序操作（主要针对List接口）----------");
		//反转
//		Collections.reverse(list);
		//洗牌
//		Collections.shuffle(list);
		//自然升序(字母，数字)
//		Collections.sort(list);
		//自定义比较
//		Collections.sort(list,c);
		//交换
//		Collections.swap(list, 0, 2);
		//元素右移
//		Collections.rotate(list, 1);
		
		System.out.println("----------2，查找和替换----------");
		//二分查找
//		System.out.println(Collections.binarySearch(list, "tom"));
		//返回最大值
//		System.out.println(Collections.max(list));
		//返回最小值
//		System.out.println(Collections.min(list));
		//填充
//		Collections.fill(list, "lulu");
		//返回指定集合指定元素出现的次数
//		System.out.println(Collections.frequency(list, "lulu"));
		//替换元素
//		Collections.replaceAll(list,"tom","lulu");
		
		System.out.println("----------3，同步控制----------");
		List<String> synclist = Collections.synchronizedList(new ArrayList<String>());
		
		System.out.println("----------4，设置不可变集合----------");
//		List<String> sList = Collections.emptyList();
//		sList.add("lulu");//不可变集合，无法添加元素
		
		System.out.println("----------5，其他----------");
		//反转排序
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
	}

}
