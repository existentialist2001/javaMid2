package reStudy.collection.compare.test.mySolution;

import java.util.ArrayList;
import java.util.Collections;

public class CardGame {

    private ArrayList<String> player1;
    private ArrayList<String> player2;
    private ArrayList<String> deck;
    private String[] marks = {"♠","♥","\u2666","♣"};

    public CardGame() {

        this.deck = new ArrayList<>();
        //덱 생성
        for (int i = 0; i <= 3; i++) {
            for (int j = 1; j <= 13; j++) {
                this.deck.add(j + "(" +  marks[i] + ")");
                //System.out.println(j + "(" +  marks[i] + ")");
            }
        }
    }

    //덱 섞기
    public void shuffle() {
        Collections.shuffle(this.deck);
    }

    //덱 뽑기
    public ArrayList<String> player1Pick() {

        this.player1 = new ArrayList<>();
        ArrayList<String> tempArr = new ArrayList<>();
        ArrayList<Integer> onlyNums = new ArrayList<>();

        //덱에서 카드 뽑기
        for (int i = 0; i < 5; i++) {
           String card = this.deck.remove(0);
           Integer numCard = Integer.valueOf(card.replaceAll("[^0-9]",""));
           tempArr.add(card);
           onlyNums.add(numCard);
        }

        Collections.sort(onlyNums);

        //근데 이렇게 하면 같은 숫자 다른 문양일 때를 정렬하지 못하는데..?
        //오름차순으로 정렬된 배열
        for (int i = 0; i < 5; i++) {
            //픽한 5개 카드
            for (int j = 0; j < 5; j++) {

                Integer numCard = Integer.valueOf(tempArr.get(j).replaceAll("[^0-9]", ""));
                if (numCard.equals(onlyNums.get(i))) {
                    this.player1.add(tempArr.get(j));
                }
            }
        }
        return this.player1;
    }

    public ArrayList<String> player2Pick() {

        this.player2 = new ArrayList<>();
        ArrayList<String> tempArr = new ArrayList<>();
        ArrayList<Integer> onlyNums = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            String card = this.deck.remove(0);
            Integer numCard = Integer.valueOf(card.replaceAll("[^0-9]",""));
            tempArr.add(card);
            onlyNums.add(numCard);
        }

        Collections.sort(onlyNums);

        //근데 이렇게 하면 같은 숫자 다른 문양일 때를 정렬하지 못하는데..?
        //오름차순으로 정렬된 배열
        for (int i = 0; i < 5; i++) {
            //픽한 5개 카드
            for (int j = 0; j < 5; j++) {

                Integer numCard = Integer.valueOf(tempArr.get(j).replaceAll("[^0-9]", ""));
                if (numCard.equals(onlyNums.get(i))) {
                    this.player2.add(tempArr.get(j));
                }
            }
        }
        return this.player2;
    }

    public int getTotal(ArrayList<String> player) {

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            String card = player.get(i).replaceAll("[^0-9]","");
            //System.out.println("card = " + card);
            int cardNum = Integer.parseInt(card);
            sum += cardNum;
        }
        return sum;
    }

    public void whoIsWinner() {

        int player1Sum = getTotal(this.player1);
        int player2Sum = getTotal(this.player2);

        if (player1Sum > player2Sum) {
            System.out.println("플레이어1 승리");
        }
        else if (player1Sum < player2Sum) {
            System.out.println("플레이어2 승리");
        }
        else {
            System.out.println("무승부");
        }
    }
}
