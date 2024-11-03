package collection.list.test.ex1.mysol;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("n개의 정수를 입력하세요 (종료 0)");

        while (true) {

            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }

            arr.add(input);
        }

        int sum = 0;

        for (Integer i : arr) {

            sum += i;
        }

        double average = (double) sum / arr.size();
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
