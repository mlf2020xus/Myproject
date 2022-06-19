package com.mlf.java;

import java.util.ArrayList;
//F4:当前类的树型结构
public class HelloWorld {
    

    public static void main(String[] args){

        System.out.println("hello world");
        System.out.println("hello world");
        ArrayList<Object> objects = new ArrayList<>();


        String s = new String("张三");
        int length = s.length();
        System.out.println(length);
        System.out.println("在slave上做的第一个修改");
        System.out.println("在slave上做的第二个修改");
        System.out.println("在slave上做的第san个修改");
        System.out.println("在远程库进行pull的操作演示");
    }


}
