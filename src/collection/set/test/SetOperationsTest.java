package collection.set.test;

import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class SetOperationsTest {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(List.of(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(List.of(3,4,5,6,7));

        //합집합
        set1.addAll(set2);
        System.out.println("합집합: " + set1);

        //결과 조정
        set1.remove(6);
        set1.remove(7);

        //교집합
        set1.retainAll(set2);
        System.out.println("교집합: " + set1);

        //결과 조정
        set1.add(1);
        set1.add(2);

        //차집합
        set1.removeAll(set2);
        System.out.println("차집합: " + set1);
    }
}
