package com.fkf.juc.c_031;

import java.util.HashSet;
import java.util.Set;

/**
 * @author fankaifeng
 * @date 2020/5/13-9:35
 */
public final class ThreeStoopes {
    private final Set<String> stooges = new HashSet<>();

    public ThreeStoopes() {
        stooges.add("123");
        stooges.add("456");
    }

    public boolean isStooge(String name) {
        return stooges.contains(name);
    }
}
