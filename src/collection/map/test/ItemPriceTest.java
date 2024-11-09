package collection.map.test;

import java.util.*;

public class ItemPriceTest {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        Set<String> items = new HashSet<>();

        for (String item : map.keySet()) {

            if (map.get(item) == 1000) {
                items.add(item);
            }
        }

        System.out.println(items);
    }
}
