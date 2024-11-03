package collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {
    public static void main(String[] args) {

        Integer[] inputArr = {30,20,20,10,10};

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        for (Integer i : inputArr) {
            linkedHashSet.add(i);
        }

        //반복문으로 넣는 대신에 이렇게 해도 됨(생성자에 바로 리스트를 넣는 방법)
        //Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));

        for (Integer i : linkedHashSet) {
            System.out.println(i);
        }
    }
}
