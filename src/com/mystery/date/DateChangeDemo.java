package com.mystery.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @program: DemoTest
 * @description: DateChangeDemo
 * @author: cheng
 * @create: 2020-06-09 15:05
 */
public class DateChangeDemo {
    public static void main(String[] args) {

        /*1-Date和long之间的转换*/
        Date date = new Date();
        long mills1 = date.getTime();// 1591686437875

        Date date2 = new Date(mills1);

        /*2-Calender和long之间的转换*/
        Calendar cal1 = Calendar.getInstance();
        long mills2 = cal1.getTimeInMillis();// 1591686630473
        Calendar cal2 = Calendar.getInstance();
        cal2.setTimeInMillis(mills2);
        System.out.println(cal2.getTime());// Tue Jun 09 15:34:58 CST 2020

        /*3-Calendar和Date之间的转换*/
        Calendar cal = Calendar.getInstance();
        Date date3 = cal.getTime();
        cal.setTime(date3);

        /*4-Date 和 String之间的转换*/
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strDate = sdf.format(new Date());
        System.out.println(strDate);
        try {
            Date newDate = sdf.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        /*5-Calendar 和 String 之间的转换(转Date，再转SDF)*/
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = simpleDateFormat.format(calendar.getTime());
        try {
            calendar.setTime(simpleDateFormat.parse(str));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
