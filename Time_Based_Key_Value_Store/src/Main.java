import java.util.*;

public class Main {
    public static void main(String[] args) {
        TimeMap timeMap = new TimeMap();
        timeMap.set("love","high",10);
        timeMap.set("love","low", 20);
        timeMap.get("love",5);
//        timeMap.set("love","bar2",4);
        timeMap.get("love",10);
        timeMap.get("love",15);
    }
}

class TimeMap {
    Map<String, TreeMap<Integer, String>> hashMap;

    public TimeMap() {
        this.hashMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (this.hashMap.get(key) != null) {
            this.hashMap.get(key).put(timestamp, value);
        }
        else {
            TreeMap<Integer, String> map = new TreeMap<>();
            map.put(timestamp, value);
            this.hashMap.put(key, map);
        }
    }

    public String get(String key, int timestamp) {
        if (!this.hashMap.containsKey(key)) {
            return "";
        }

        TreeMap<Integer, String> timeMap = this.hashMap.get(key);
        Integer floorKey = timeMap.floorKey(timestamp);

        return floorKey == null ? "" : timeMap.get(floorKey);
    }
}