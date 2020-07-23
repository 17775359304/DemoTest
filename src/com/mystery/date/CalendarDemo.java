package com.mystery.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @program: DemoTest
 * @description: Calendar
 * @author: cheng
 * @create: 2020-06-09 14:01
 */
public class CalendarDemo {
    public static void main(String[] args) {
        /*对象创建*/
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = new GregorianCalendar();/*通过Calendar的实现类GregorianCalendar创建对象*/

        /*1，set（）设置时间*/
        c1.set(2020,06,9);

        /*2,设置单独的字段*/
        /**
         *   如果只设定某个字段，例如日期的值，则可以使用public void set(int field,int value)
         */
        //把 c1对象代表的日期设置为10号，其它所有的数值会被重新计算(保留原来的设置)
        c1.set(Calendar.DATE,25);
        c1.set(Calendar.HOUR_OF_DAY,14);
        //把c1对象代表的年份设置为2014年，其他的所有数值会被重新计算(保留原来的设置)
        c1.set(Calendar.YEAR,2021);
     /*   其他字段属性set的意义以此类推
        Calendar.YEAR ——年份
        Calendar.MONTH ——月份
        Calendar.DATE ——日期
        Calendar.DAY_OF_MONTH ——日期，和上面的字段意义相同
        Calendar.HOUR——12小时制的小时
        Calendar.HOUR_OF_DAY ——24小时制的小时
        Calendar.MINUTE ——分钟
        Calendar.SECOND ——秒
        Calendar.DAY_OF_WEEK ——星期几
        */

        /**
         *3，add()设置(可用于计算时间)
         */
        c1.add(Calendar.DATE, 10);
        c1.add(Calendar.HOUR_OF_DAY, 3);

        /*4，getTime(),获取Date类型的时间*/
        Date d = c1.getTime();  // Wed Aug 04 17:37:34 CST 2021

        /*通过Calendar获取相关时间参数*/
        // 获得年份
        int year = c1.get(Calendar.YEAR);
        // 获取月，这里需要需要月份的范围为0~11，因此获取月份的时候需要+1才是当前月份值
        int month = c1.get(Calendar.MONTH) + 1;
        // 获得日期
        int date = c1.get(Calendar.DATE);
        // 获得小时
        int hour = c1.get(Calendar.HOUR_OF_DAY);
        // 获得分钟
        int minute = c1.get(Calendar.MINUTE);
        // 获得秒
        int second = c1.get(Calendar.SECOND);
        // 获得星期几（注意（这个与Date类是不同的）：1代表星期日、2代表星期1、3代表星期二，以此类推）
        int day = c1.get(Calendar.DAY_OF_WEEK);
        // 获取当前日期在一年中的第几个星期
        int weekNum = Calendar.WEEK_OF_YEAR;

        /*常用方法*/
        /*设置一周的第一天*/
        c1.setFirstDayOfWeek(Calendar.MONDAY);
        /*设置一年中第一个周所需的最少天数*/
        c1.setMinimalDaysInFirstWeek(7);
        /*获取一周的第一天*/
        c1.getFirstDayOfWeek();
    }
}
