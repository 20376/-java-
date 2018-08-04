package com.hand.demo01;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by cjj on 2018/8/4.
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        SimpleDateFormat sdf =  new SimpleDateFormat( "yyyy-MM-dd" );
        boolean dateflag=true;
        System.out.println("请输入日期：");
        String date=input.nextLine();
        try{
            Date d = sdf.parse(date);
        } catch (ParseException e)
        {
            dateflag=false;
        }finally{
            System.out.println("日期是否满足要求"+dateflag);
        }
        //获取年
        String year=date.substring(0,4);
        //获取月
        String mon=date.substring(5,7);
        //获取天
        String day=date.substring(8,10);
        int nextday=Integer.parseInt(day)+1;
        day=String.valueOf(nextday);
       String nextDate=new String(year+"-"+mon+"-"+day);
        System.out.println("下一天为："+nextDate);

    }
}
