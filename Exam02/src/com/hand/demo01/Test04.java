package com.hand.demo01;

import java.util.*;

/**
 * Created by cjj on 2018/8/4.
 */
public class Test04 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();//存放50个随机数
        Random rand = new Random();
        List<Map<Integer, ArrayList>> lists=new ArrayList<>();//存放所有数据
        //Map<Integer,ArrayList> map= new HashMap<>();
        //ArrayList<Integer> nums=new ArrayList<>();

for(int i=0;i<50;i++){
    list.add(rand.nextInt(100));
}
//遍历50个随机数
        for (Object o:list) {
            Integer i = (Integer) o;
            int value = i / 10;
            if (value == 1) {

                ArrayList<Integer> nums1 = new ArrayList<>();
                Map<Integer, ArrayList> map1 = new HashMap<>();
                nums1.add(i);
                map1.put(1, nums1);
                lists.add(map1);
              //  System.out.println(map1);
            } else if (value == 2) {

                ArrayList<Integer> nums2 = new ArrayList<>();
                Map<Integer, ArrayList> map2 = new HashMap<>();
                nums2.add(i);
                map2.put(2, nums2);
                lists.add(map2);
            } else if (value == 3) {
                ArrayList<Integer> nums3 = new ArrayList<>();
                Map<Integer, ArrayList> map3 = new HashMap<>();
                nums3.add(i);
                map3.put(3, nums3);
                lists.add(map3);
            } else if (value == 4) {
                ArrayList<Integer> nums4 = new ArrayList<>();
                Map<Integer, ArrayList> map4 = new HashMap<>();
                nums4.add(i);
                map4.put(4, nums4);
                lists.add(map4);
            } else if (value == 5) {
                ArrayList<Integer> nums5 = new ArrayList<>();
                Map<Integer, ArrayList> map5 = new HashMap<>();
                nums5.add(i);
                map5.put(5, nums5);
                lists.add(map5);
            } else if (value == 6) {
                ArrayList<Integer> nums6 = new ArrayList<>();
                Map<Integer, ArrayList> map6 = new HashMap<>();
                nums6.add(i);
                map6.put(6, nums6);
                lists.add(map6);
            }else if(value==7){
                ArrayList<Integer> nums7=new ArrayList<>();
                Map<Integer,ArrayList> map7=new HashMap<>();
                nums7.add(i);
                map7.put(7,nums7);
                lists.add(map7);
            }else if(value==8){
                ArrayList<Integer> nums8=new ArrayList<>();
                Map<Integer,ArrayList> map8=new HashMap<>();
                nums8.add(i);
                map8.put(8,nums8);
                lists.add(map8);
            }else if(value==9){
                ArrayList<Integer> nums9=new ArrayList<>();
                Map<Integer,ArrayList> map9=new HashMap<>();
                nums9.add(i);
                map9.put(9,nums9);
                lists.add(map9);
            }

           // System.out.println(value+"-->"+i);
        }
      //  System.out.println(lists.size());

        for(int i=0;i<lists.size();i++){
    if(lists.get(i)!=null){
        System.out.print(lists.get(i));
    }

        }
        }

    }

