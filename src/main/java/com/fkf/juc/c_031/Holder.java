package com.fkf.juc.c_031;

/**
 * @author fankaifeng
 * @date 2020/5/20-14:43
 */
public class Holder {
    private int n;

    public Holder(int n) {
        this.n = n;
    }

    public void assertSanity() {
        if (n != n) {
            throw new AssertionError("this statement is false ");
        }
    }
}
