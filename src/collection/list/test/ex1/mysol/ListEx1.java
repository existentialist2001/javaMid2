package collection.list.test.ex1.mysol;

public class ListEx1 {

    private int[] array;

    ListEx1(int[] array) {
        this.array = array;
    }

    public int getTotal() {

        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        return total;
    }

    public double getAverage() {
        return (double) getTotal() / array.length;
    }

    public static void main(String[] args) {

        ListEx1 students = new ListEx1(new int[] {90, 80, 70, 60, 50});

        System.out.println("점수 총합: " + students.getTotal());
        System.out.println("점수 평균: " + students.getAverage());
    }
}
