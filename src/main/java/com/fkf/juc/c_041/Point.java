package com.fkf.juc.c_041;

/**
 * @author fankaifeng
 * @date 2020/9/1-11:13
 */
public class Point {
    private final int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
