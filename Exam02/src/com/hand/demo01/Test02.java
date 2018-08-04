package com.hand.demo01;

import java.util.Scanner;

/**
 * Created by cjj on 2018/8/4.
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("请输入工资：");
        //工资
        double shuifei;
        double salary=input.nextDouble();
        if(salary<1500){
            System.out.println("所需缴纳的税费为："+salary*0.03);
        }else if(salary>1500&&salary<4500){
            shuifei=(int) (salary-1500)*0.1;
            System.out.println("所需缴纳的税费为："+shuifei);
        }else if(salary>=4500&&salary<9000){
            shuifei=(int)(salary-4500)*0.2;
            System.out.println("所需缴纳的税费为："+shuifei);
        }else if(salary>=9000&&salary<35000){
            shuifei=(int)(salary-9000)*0.25;
            System.out.println("所需缴纳的税费为："+shuifei);
        }else if(salary>=35000&&salary<55000){
            shuifei=(int)(salary-35000)*0.3;
            System.out.println("所需缴纳的税费为："+shuifei);
        }else if(salary>=55000&&salary<80000){
            shuifei=(int)(salary-55000)*.35;
            System.out.println("所需缴纳的税费为："+shuifei);
        }else if(salary>=80000){
            shuifei=(int)(salary-80000)*0.45;
            System.out.println("所需缴纳的税费为："+shuifei);
        }


    }
}
