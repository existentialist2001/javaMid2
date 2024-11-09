package collection.map.test.cart;

import java.util.*;

//key가 중복을 허용하지 않는 다는 점을 이용해 중복되게 넣어주었다
//문제 풀 때도 느껴서 적었지만, 강의 볼 때도 느낀 건데, Map이 중복을 허용하지 않기 때문에 중복 덮어쓰기가 가능하다는 게 중요한 것 같다.

public class Cart {

    Map<Product,Integer> cartMap = new HashMap<>();

    public void add(Product product, int quantity) {

        //이름과 가격이 같으면(equals랑 hashCode 오버라이딩 해놨는데, 이게 될 지 모르겠다)
        if (cartMap.containsKey(product)) {

            int temp = cartMap.get(product);
            int totalQuantity = temp + quantity;
            cartMap.put(product,totalQuantity);
        }
        else {
            cartMap.put(product,quantity);
        }
    }

    public void minus(Product product, int quantity) {

        int temp = cartMap.get(product);
        int totalQuantity = temp - quantity;

        if (totalQuantity <= 0) {
            cartMap.remove(product);
        }
        else {
            cartMap.put(product,totalQuantity);
        }
    }

    public void printAll() {

        System.out.println("==모든 상품 출력==");
        for (Product p : cartMap.keySet()) {
            System.out.println("상품: " + p + " 수량: " + cartMap.get(p));
        }
    }
}
