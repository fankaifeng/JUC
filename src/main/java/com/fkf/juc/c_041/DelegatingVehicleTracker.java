package com.fkf.juc.c_041;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author fankaifeng
 * @date 2020/9/1-13:09
 */
public class DelegatingVehicleTracker {
    private final ConcurrentMap<String, Point> locations;

    private final Map<String, Point> unModifiedMap;

    public DelegatingVehicleTracker(Map<String, Point> points) {
        locations = new ConcurrentHashMap<>(points);
        unModifiedMap = Collections.unmodifiableMap(locations);
    }

    public Map<String, Point> getLocations() {
        return unModifiedMap;
    }

    public Point getLocation(String id) {
        return locations.get(id);
    }

    public void setLocation(String id, int x, int y) {
        if (locations.replace(id, new Point(x, y)) == null) {
            throw new IllegalArgumentException("invalid vehicle name");
        }
    }
}
