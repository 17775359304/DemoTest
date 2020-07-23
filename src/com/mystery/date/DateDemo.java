package com.mystery.date;

import java.util.Calendar;
import java.util.Date;

/**
 * @program: DemoTest
 * @description:  Date
 * @author: cheng
 * @create: 2020-06-09 11:25
 */
public class DateDemo {
    public static void main(String[] args) {
        /*---------Date的使用-----------*/
        /*方法都过时了，常用的有获取： 年月日时分秒 星期 相对时间*/

        /*也可以传入具体时间（日期，字符串格式都可以）创建对象，无参默认的是当前系统时间*/
        Date date = new Date();     // Tue Jun 09 11:34:03 CST 2020

        /*常用方法*/

        /*建议使用  Calendar.get(Calendar.YEAR) */
        int year = date.getYear() + 1900;   // 2020

        /*建议使用  Calendar.get(Calendar.MONTH) */
        int month = date.getMonth() + 1;    // 6

        /*建议使用  Calendar.get(Calendar.DAY_OF_MONTH) */
        int day = date.getDate();           // 9

        /*建议使用  Calendar.get(Calendar.HOUR_OF_DAY) */
        int hour = date.getHours();         // 11

        /*建议使用  Calendar.get(Calendar.MINUTE) */
        int min = date.getMinutes();       // 34

        /*建议使用  Calendar.get(Calendar.SECOND) */
        int sec = date.getSeconds();       // 03

        /*获取星期几(星期天是0), 建议使用  Calendar.get(Calendar.DAY_OF_WEEK) */
        int weekDay = date.getDay();        // 2

        /*当前时间的相对时间*/
        long milli = date.getTime();        // 1591674457264

    }
}
