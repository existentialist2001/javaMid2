package collection.list.test.ex1.lecSol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//이건 다시 스스로 풀어봤음
public class ListEx2 {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("n개의 정수를 입력하세요 (종료 0)");

        while (true) {

            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            arr.add(input);
        }

        System.out.println("출력");
        for (int i = 0; i < arr.size(); i++) {

            System.out.print(arr.get(i));
            if (i != arr.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
