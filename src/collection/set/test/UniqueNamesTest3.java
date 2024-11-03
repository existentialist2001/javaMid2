package collection.set.test;

import java.util.TreeSet;

public class UniqueNamesTest3 {
    public static void main(String[] args) {

        Integer[] inputArr = {30,20,20,10,10};

        TreeSet<Integer> treeSet = new TreeSet<>();

        for (Integer i : inputArr) {
            treeSet.add(i);
        }

        for (Integer i : treeSet) {
            System.out.println(i);
        }
    }
}
