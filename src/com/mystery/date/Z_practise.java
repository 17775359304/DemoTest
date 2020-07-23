package com.mystery.date;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @program: DemoTest
 * @description: 练习
 * @author: cheng
 * @create: 2020-06-10 09:41
 */
public class Z_practise {
    public static void main(String[] args) {
        Date date = new Date();
//        System.out.println(getWeekOfYear(date));

//        System.out.println(getMaxWeekNumOfYear(date));

//        System.out.println(getFirstDayOfWeek(date));

//        System.out.println(getFirstDayOfWeek(date));

//        System.out.println(getFirstDayOfWeek(2020,1));

//        System.out.println(getLastDayOfWeek(2020,getMaxWeekNumOfYear(date)));

//        System.out.println("------------------------------------------------------------");


    }
    /**
     * 关于周的操作
     */
    /*-- 1.获取传入时间是在年的第几周*/
    public static int getWeekOfYear(Date date){
        Calendar cal = Calendar.getInstance();
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        /*一周必须满七天才算一周*/
        cal.setMinimalDaysInFirstWeek(7);
        cal.setTime(date);
        return cal.get(Calendar.WEEK_OF_YEAR);
    }

    /*-- 2。获取当前年的最大周数*/
    public static int getMaxWeekNumOfYear(Date date){
        Calendar cal = Calendar.getInstance();
        cal.set(date.getYear(),Calendar.DECEMBER,31,23,59,59);
        return  getWeekOfYear(cal.getTime());
    }
    /*-- 3.获取某日期所在周的开始日期*/
    public static Date getFirstDayOfWeek(Date date){
        Calendar cal = Calendar.getInstance();
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        cal.setTime(date);

        cal.set(Calendar.DAY_OF_WEEK,cal.getFirstDayOfWeek());//Monday
        return cal.getTime();
    }
    /*-- 4.获取当前时间所在周的结束日期*/
    public static Date getLastDayOfWeek(Date date) {
        Calendar c = Calendar.getInstance();
        c.setFirstDayOfWeek(Calendar.MONDAY);

        c.setTime(date);
        c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek() + 6); // Sunday
        return c.getTime();
    }
    /*-- 5.获取某年的第几周的开始日期*/
    public static Date getFirstDayOfWeek(int year, int week) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DATE, 1);
        Calendar c = (Calendar) cal.clone();
        c.add(Calendar.DATE, week * 7);
        return getFirstDayOfWeek(cal.getTime());
    }
    /*-- 6.获取某年的第几周的结束日期*/
    public static Date getLastDayOfWeek(int year, int week) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DATE, 1);

        Calendar c = (Calendar) cal.clone();
        c.add(Calendar.DATE, week * 7);
        return getLastDayOfWeek(c.getTime());
    }
    /*-- 7.获取当前年的第一天到当前时间有多少周*/
    public static int getWeekList(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.setTime(date);
        return calendar.get(Calendar.WEEK_OF_YEAR);
    }
    /*-- 8.根据周数获取该周周一的日期*/
    public static String getStartDateByWeek(int week){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, cal.get(Calendar.YEAR));
        cal.set(Calendar.WEEK_OF_YEAR, week);
        cal.set(Calendar.DAY_OF_WEEK, 2); // 1表示周日，2表示周一，7表示周六
        Date date = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }
    /*-- 9.根据周数获取周日的日期数*/
    public static String getEndDateByWeek(int week){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, cal.get(Calendar.YEAR));
        cal.set(Calendar.WEEK_OF_YEAR, week + 1);
        cal.set(Calendar.DAY_OF_WEEK, 1); // 1表示周日，2表示周一，7表示周六
        Date date = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }
    /*-- 10.返回当前时间为周几*/
    public static int getWeekDay() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        // 获得当前日期是一个星期的第几天
        int dayWeek = cal.get(Calendar.DAY_OF_WEEK) - 1 ;
        if(dayWeek == 0) {
            dayWeek = 7;
        }
        return dayWeek;
    }

    /** 11.将数字转为date 如：43188   0.468333
     * @param date 43188
     * @param ditNumber 0.468333
     */
    public static Date getTime(Date date, double ditNumber) {
        Calendar c = Calendar.getInstance();
        int mills = (int) (Math.round(ditNumber * 24 * 3600));
        int hour = mills / 3600;
        int minute = (mills - hour * 3600) / 60;
        int second = mills - hour * 3600 - minute * 60;
        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY, hour);
        c.set(Calendar.MINUTE, minute);
        c.set(Calendar.SECOND, second);
        return c.getTime();
    }

    /**
     * 关于月的操作
     */

    /*-- 12.获取某月的第一天 */
    public static String getFirstDayOfMonth(int year, int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DAY_OF_MONTH,cal.getMinimum(Calendar.DATE));
        return   new SimpleDateFormat( "yyyy-MM-dd ").format(cal.getTime());
    }

    /*-- 13.获取某月的最后一天*/
    public static String getLastDayOfMonth(int year, int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DAY_OF_MONTH,cal.getActualMaximum(Calendar.DATE));
        return  new   SimpleDateFormat( "yyyy-MM-dd ").format(cal.getTime());
    }

    /*-- 14.获取某月的最大天数*/
    public static int getMaxDayByYearMonth(int nowdateYYYY, int nowdateMM) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DATE, 1);
        calendar.set(Calendar.YEAR, nowdateYYYY);
        calendar.set(Calendar.MONTH, nowdateMM - 1);
        return calendar.getActualMaximum(Calendar.DATE);
    }

    /*-- 15.获取当前时间所在月的第几天*/
    public static int getWeeksByChooseDay(){
        Calendar calSelected=Calendar.getInstance();
        return calSelected.get(Calendar.DAY_OF_MONTH);
    }

    /*-- 16.将一个月的所有天数封装到list中*/
    public static List<Date> getDatesByYearAndMonth(int year, int month){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, 1);
        List<Date> list = new ArrayList<Date>();
        do{
            list.add(calendar.getTime());
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }while(month-1==calendar.get(Calendar.MONTH));
        return list;
    }
}
