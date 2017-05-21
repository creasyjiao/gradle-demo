package com.liyue.gradle.demo.util;

/**
 * Created by admin on 2017/5/14.
 */
public class StringKit {


    public static String captFirstChar(String str){
        return str.substring(0,1).toUpperCase()+str.substring(1);
    }
}
