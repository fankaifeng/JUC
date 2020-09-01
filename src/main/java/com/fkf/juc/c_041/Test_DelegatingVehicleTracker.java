package com.fkf.juc.c_041;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author fankaifeng
 * @date 2020/9/1-13:20
 */
public class Test_DelegatingVehicleTracker {
    public static void main(String[] args) {
        Map<String, Point> pointHashMap = new HashMap<>();
        pointHashMap.put("1", new Point(1, 2));
        DelegatingVehicleTracker delegatingVehicleTracker = new DelegatingVehicleTracker(pointHashMap);
        Map<String, Point> locations = delegatingVehicleTracker.getLocations();
        new Thread(() -> {
            delegatingVehicleTracker.setLocation("1", 1, 1);
            System.out.println("t2 结束");
        }, "t2").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("locations" + locations);
    }
}
