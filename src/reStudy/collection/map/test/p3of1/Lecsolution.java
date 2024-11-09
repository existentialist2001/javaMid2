package reStudy.collection.map.test.p3of1;

import java.util.*;

public class Lecsolution {
    public static void main(String[] args) {

        String text = "orange banana apple apple banana apple";
        Map<String, Integer> map = new HashMap<>();

        String[] words = text.split(" ");

        for (String word : words) {
//            //Map은 배열과 달리 없는 데이터로 접근하려해도 에러가 발생하지 않고 null을 반환
//            Integer count = map.get(word);
//            if (count == null) {
//                count = 0;
//            }
//            count++;
//            map.put(word,count);
//        }

            //위 주석보다 더 간단한 방법
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
            System.out.println(map);

    }
}
