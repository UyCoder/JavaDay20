package dev.ahmed.dev.ahmed;

import org.junit.Test;

import java.util.Date;

/**
 * @author Ahmed Bughra
 * @create 2022-11-10  12:27 AM
 */
public class DateTimeTest {
    @Test
    public void test2(){
        // 1. constructor :Date()
        Date date1 = new Date();
        System.out.println(date1.toString());
        System.out.println(date1.getTime());

        // 2. constructor :mills-timestamp
        Date date3 = new Date(1668029466636L);
        System.out.println(date3.toString());

        // 3. sql.Date
        java.sql.Date date4 = new java.sql.Date(1668029466636L);
        System.out.println(date4);

        // hot to change java.util.Date to java.sql.Date
        Date date5 = new java.sql.Date(1668029466636L);
        java.sql.Date date7=  (java.sql.Date)date5;

        Date date8 = new Date();
        java.sql.Date date9=  (java.sql.Date)date5;
        System.out.println(date8);
        System.out.println(date9);
        java.sql.Date date11 = new java.sql.Date(1668029466636L);
    }




    @Test
    public void test1(){
        long time = System.currentTimeMillis();
        // 1970/1/1 00:00:00
        System.out.println(time);
    }
}
