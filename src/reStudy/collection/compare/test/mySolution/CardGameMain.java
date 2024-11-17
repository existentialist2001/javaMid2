package reStudy.collection.compare.test.mySolution;

import java.util.ArrayList;

/*
출력할 때, 정렬해서 출력못해줬음, 아마 카드 뽑을 때부터 정렬해서 넣어야할 것 같음, 지금 너무 꼬아서 접근하고 있는 듯..
좀 더 다듬을 수 있을 것 같음
새로운 배열들 더 추가해서 정렬하긴 했는데, 숫자는 같은데 문양은 다를 때 못걸러냄
*/

public class CardGameMain {
    public static void main(String[] args) {

        // 코드 작성
        CardGame cardGame = new CardGame();
        cardGame.shuffle();
        ArrayList<String> player1 = cardGame.player1Pick();
        ArrayList<String> player2 = cardGame.player2Pick();

        System.out.println("플레이어1의 카드: " + player1 + ", 합계: " + cardGame.getTotal(player1));
        System.out.println("플레이어2의 카드: " + player2 + ", 합계: " + cardGame.getTotal(player2));

        cardGame.whoIsWinner();
    }
}
