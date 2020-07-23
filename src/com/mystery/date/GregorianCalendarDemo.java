package com.mystery.date;

import java.util.GregorianCalendar;

/**
 * @program: DemoTest
 * @description: GregorianCalendar
 * @author: cheng
 * @create: 2020-06-09 14:19
 */
public class GregorianCalendarDemo {
    public static void main(String[] args) {
        /*创建对象的方式*/
        GregorianCalendar g0 = new GregorianCalendar();/*无参创建的对象时间默认是系统的当前时间*/
        GregorianCalendar g1 = new GregorianCalendar(2021, 6-1, 9);
        GregorianCalendar g2 = new GregorianCalendar(2020, 6-1, 9, 14, 54) ;
        GregorianCalendar g3 = new GregorianCalendar(2020, 6-1, 9, 14, 20, 20);
        /*常用的方法*/
        /*判断是否是闰年*/
        System.out.println(g1.isLeapYear(2020));
    }
}
