package com.mystery.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: DemoTest
 * @description: DateFormat与SimpleDateFormat
 * @author: cheng
 * @create: 2020-06-09 11:56
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        /**
         * Date转化成指定的日期格式
         */
        Date now = new Date();

        DateFormat myFmt = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        System.out.println(myFmt.format(now));//结果：2020年06月09日 13时31分41秒

        SimpleDateFormat myFmt1 = new SimpleDateFormat("yy/MM/dd HH:mm");
        System.out.println(myFmt1.format(now));//结果：20/06/09 13:31

        SimpleDateFormat myFmt2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//等价于now.toLocaleString()
        System.out.println(myFmt2.format(now));//结果：2020-06-09 13:31:41

        SimpleDateFormat myFmt3 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 E ");
        System.out.println(myFmt3.format(now));//结果：2020年06月09日 13时31分41秒 星期二

        SimpleDateFormat myFmt4 = new SimpleDateFormat("一年中的第 D 天 一年中第 w 个星期 一月中第 W 个星期 在一天中 k 时 z 时区");
        System.out.println(myFmt4.format(now));//结果：一年中的第 161 天 一年中第 24 个星期 一月中第 2 个星期 在一天中 13 时 CST 时区

        System.out.println(now.toGMTString());//结果：9 Jun 2020 05:31:41 GMT
        System.out.println(now.toLocaleString());//结果：2020-6-9 13:31:41
        System.out.println(now.toString());//结果：Tue Jun 09 13:31:41 CST 2020

    /*
     * Date和日期字符串之间的转换
     * 通常是一个日期字符串，但不是想要的格式，可以先转化为Date，再转化为其它格式
     */
        String strDate = "2020-06-09 13:58:31.785" ;
        // 从字符串中提取出日期数字
        String pat1 = "yyyy-MM-dd HH:mm:ss.SSS" ;
        // 将提取后的日期数字变为指定的格式
        String pat2 = "yyyy年MM月dd日 HH时mm分ss秒SSS毫秒" ;
        SimpleDateFormat sdf1 = new SimpleDateFormat(pat1) ;   // 实例化模板对象
        SimpleDateFormat sdf2 = new SimpleDateFormat(pat2) ;   // 实例化模板对象
        Date d = null ;
        try{
            d = sdf1.parse(strDate) ;   // 将给定的字符串中的日期提取出来
        }catch(Exception e){            // 如果提供的字符串格式有错误，则进行异常处理
            e.printStackTrace() ;       // 打印异常信息
        }
        /* date转字符串 */
        System.out.println(sdf2.format(d)) ;
    }
}
