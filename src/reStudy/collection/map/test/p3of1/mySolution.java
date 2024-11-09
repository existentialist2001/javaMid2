package reStudy.collection.map.test.p3of1;

import java.util.HashMap;
import java.util.Map;

/*
내 풀이는 이중 반복문을 사용한 반면, 강의 풀이는 1중 반복문 만으로 해결함
내 풀이든 강의 풀이든, Map은 Set과 같은 성질로 중복을 허용하지 않으니, 이 성질을 이용해서
덮어쓰기를 할 수 있다.
*/

public class mySolution {
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
