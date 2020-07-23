package com.mystery.list.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 队列（Queue）接口是一种特殊的线性表，是一种先进先出（FIFO）的数据结构。它只允许在表的前端（front）
 * 进行前端（front）进行删除操作，而在表的后端（rear）进行插入操作。进行插入操作的端称为队尾，进行
 * 删除操作的端称为对头。队列中没有元素时称为空队列。
 * 
 * 请求队列，消息队列
 * 
 * LinkedList是Queue接口的实现类
 * boolean add(E e):将指定的元素插入到此队列（如果立即可行且不会违反容量限制），在成功时返回
 * true，如果当前没有可用的空间，则抛出IllegalStateException。
 * E element():获取，但是不移除此队列的头。
 * boolean offer(E e):将指定的元素插入到此队列（如果立即可行且不会返回容量限制），当使用有容量
 * 限制的队列时，此方法通常优于add(E),后者可能无法插入元素，而只是抛出一个异常。
 * E peek():获取但不移除此队列的头；如果此队列为空，则返回null。
 * E poll():获取并移除此队列的头，如果此队列为空，则返回null
 * E remove():获取并移除此队列的头。
 * 
 * 
 *Deque（双端队列）:一个线性的collection，支持在两端插入和移除元素。
 *此接口既支持容量限制的双端队列，也支持没有固定大小限制的双端队列。
 *接口定义在双端队列两端访问元素的方法，提供插入，移除和检查元素的方法。
 *
 *Stack(类):堆栈,先进后出
 */
public class QueueAndStack {

	public static void main(String[] args) {
//		queue();
//		deque();
		stack();
	}
	private static void queue(){
		Queue<String> queue = new LinkedList<>();
		queue.add("小花");
		queue.add("小小");
		queue.add("小白");
		queue.add("小露");
		queue.add("小萌");
		
		System.out.println(queue.peek());
		System.out.println(queue.size());
		
		System.out.println(queue.poll());
		System.out.println(queue.size());
	}
	
	private static void deque(){
		Deque<String> deque = new LinkedList<>();
		deque.add("小花");
		deque.add("小小");
		deque.add("小白");
		deque.add("小露");
		deque.add("小萌");
		
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
		
	}
	
	private static void stack(){
		Stack<String> stack = new Stack();
		stack.push("喵喵");
		stack.push("华华");
		stack.push("露露");
		
		System.out.println(stack.peek());
		stack.pop();
	}
}
