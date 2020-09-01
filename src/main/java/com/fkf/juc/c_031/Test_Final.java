package com.fkf.juc.c_031;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

/**
 * @author fankaifeng
 * @date 2020/5/13-9:34
 */
public class Test_Final {
    public static void main(String[] args) throws Exception {
        ThreeStoopes stoopes = new ThreeStoopes();
        Field field = stoopes.getClass().getDeclaredField("stooges");
        field.setAccessible(true);
        Set<String> stooges = new HashSet<>();
        stooges.add("789");
        field.set(stoopes, stooges);
        System.out.println(stooges.contains("789"));

    }
}
