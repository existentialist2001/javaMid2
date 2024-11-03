package collection.list.test.ex1.lecSol;

import java.util.ArrayList;
import java.util.List;

//내가 너무 다르게 풀어서(전부 직접 구현함), 블로깅까지는 아니지만 따라칠 필요가 있다는 생각이 들어서
public class ListEx1 {
    public static void main(String[] args) {

        List<Integer> students = new ArrayList<>();
        students.add(90);
        students.add(80);
        students.add(70);
        students.add(60);
        students.add(50);

        int total = 0;

        for (int i = 0; i < students.size(); i++) {
            total += students.get(i);
        }

        double average = (double) total / students.size();
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
