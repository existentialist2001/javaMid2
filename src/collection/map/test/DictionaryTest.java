package collection.map.test;

import java.util.*;

public class DictionaryTest {
    public static void main(String[] args) {

        Map<String,String> dictionary = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("==단어 입력 단계==");

        while (true) {

            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String word = sc.nextLine();

            if (word.equals("q")) {
                break;
            }
            else {
                System.out.print("한글 뜻을 입력하세요: ");
                String meaning = sc.nextLine();
                dictionary.put(word,meaning);
            }
        }

        System.out.println("==단어 검색 단계==");

        while (true) {

            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String word = sc.nextLine();

            if (word.equals("q")) {
                break;
            }
            //아마 못찾는 경우 null을 반환할 듯? -> 맞네
            else if (dictionary.get(word) != null) {
                System.out.println(word + "의 뜻: " + dictionary.get(word));
            }
            else {
                System.out.println(word + "은(는) 사전에 없는 단어입니다");
            }
        }
    }
}
