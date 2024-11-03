package collection.list.test.ex1.mysol;

import java.util.Scanner;

public class ListEx2 {

    private int[] arr;
    private int size = 0;
    private int capacity = 5;

    ListEx2() {
        this.arr = new int[capacity];
    }



    public void add(int num) {

        //꽉 찰 경우
        if (size == capacity) {

            capacity *= 2;
            int[] copy = new int[capacity];
            System.arraycopy(arr,0,copy,0,arr.length);
            arr = copy;
        }

        arr[size] = num;
        size++;
    }
    
    public void print() {
        for (int i : arr) {
            System.out.print(i +", ");
        }
    }

    public static void main(String[] args) {

        ListEx2 arr = new ListEx2();
        Scanner scanner = new Scanner(System.in);

        System.out.println("n개의 정수를 입력하세요 (종료 0)");

        while (true) {

            int input = scanner.nextInt();
            scanner.nextLine();
            if (input == 0) {
                break;
            }
            arr.add(input);
        }

        arr.print();
    }
}
