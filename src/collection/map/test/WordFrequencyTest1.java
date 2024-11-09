package collection.map.test;

import java.util.Map;
import java.util.HashMap;

public class WordFrequencyTest1 {
    public static void main(String[] args) {

        //Map 역시 Set과 같은 성질로, 중복을 허용하지 않는다는 점에 착안하여 이중반복문으로 구성했다.

        String text = "orange banana apple apple banana apple";

        String[] textArr = text.split(" ");

        Map<String,Integer> wordFrequency = new HashMap<>();

        for (String word : textArr) {

            int count = 0;

            for (String s : textArr) {
                if (word.equals(s)) {
                    count++;
                }
            }
            wordFrequency.put(word,count);
        }

        System.out.println(wordFrequency);
    }
}
