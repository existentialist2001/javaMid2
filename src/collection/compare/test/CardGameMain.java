package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;

/*
출력할 때, 정렬해서 출력못해줬음, 아마 카드 뽑을 때부터 정렬해서 넣어야할 것 같음, 지금 너무 꼬아서 접근하고 있는 듯..
좀 더 다듬을 수 있을 것 같음
새로운 배열들 더 추가해서 정렬하긴 했는데, 숫자는 같은데 문양은 다를 때 못걸러냄

강의 풀이는 내 풀이랑 차원이 다름.. 내 풀이는 뭔가 원시인..? 전부 한땀 한땀 구현하는 느낌.. 배운 것들을 제대로 활용하지 못했음
그리고 변수 생성과 동시에 함수로 값을 받아와 값을 할당하는 코딩 방식 좋은 듯, 이 코딩 방식의 본질은 변수의 생성과 값 할당이 떨어져 있는 것(나중에 값이 세팅되는 것)을 허용하지 않는 것,
그래서 그냥 return 해버리기도 함

아직 객체지향적 사고가 부족하다, 현실과 대응시켜 객체를 활용할 줄 모른다.
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
