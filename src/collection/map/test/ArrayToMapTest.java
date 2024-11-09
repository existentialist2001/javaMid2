package collection.map.test;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {

        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA",
                "30000"}};

        Map<String,Integer> map = new HashMap<>();

        for (String[] entry : productArr) {
            map.put(entry[0],Integer.valueOf(entry[1]));
        }

        for (String s : map.keySet()) {
            System.out.println("제품: " + s + ", 가격: " + map.get(s));
        }
    }
}