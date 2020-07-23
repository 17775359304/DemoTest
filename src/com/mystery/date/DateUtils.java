package com.mystery.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @program: DemoTest
 * @description: DateUtils
 * @author: cheng
 * @create: 2020-06-09 16:17
 */
public class DateUtils {
    public static void main(String[] args) {


    }
    /**
     * 1.给定一个年份判断该年份是否为闰年
     */
    public static boolean isLeapYear(int year) {
        GregorianCalendar gc = new GregorianCalendar();
        return gc.isLeapYear(year);
    }
    /**
     * 2.利用SimpleDateFormat获取当前日期的字符串表示形式 格式：2009-06-06
     */
    public static String getCurrentDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(date);
    }
    /**
     * 3.给出任意一个年月日得到该天是星期几
     */
    public static int getWeek(String date) {
        // 注意参数的大小写格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        try {
            Date d = dateFormat.parse(date);
            c.setTime(d);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c.get(Calendar.DAY_OF_WEEK)-1;
    }
    /**
     * 4.获得距离今天n天的那一天的日期
     */
    public static String getDistanceDay(int day) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, day);
        Date date = cal.getTime();
        // 这里也个用SimpleDateFormat的format（）进行格式化，然后以字符串形式返回格式化后的date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(date);
    }
    /**
     * 5.获得距离指定日期n天的那一天的日期
     */
    public static String getDistanceDay(String date, int day) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Date d;
        Calendar c =Calendar.getInstance();
        try {
            d = dateFormat.parse(date);
            c.setTime(d);
            c.add(Calendar.DATE, day);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dateFormat.format(c.getTime());
    }
    /**
     * 6.获得给定两个日期相差的天数
     */
    public static long getGapDays(String date1, String date2) {
        String[] d1 = date1.split("-");
        String[] d2 = date2.split("-");
        Calendar c = Calendar.getInstance();
        c.set(Integer.parseInt(d1[0]), Integer.parseInt(d1[1]), Integer.parseInt(d1[2]), 0, 0, 0);
        long l1 = c.getTimeInMillis();
        c.set(Integer.parseInt(d2[0]), Integer.parseInt(d2[1]), Integer.parseInt(d2[2]), 0, 0, 0);
        long l2 = c.getTimeInMillis();
        return (Math.abs(l1 - l2) / (24 * 60 * 60 * 1000));
    }
}
