package collection.map.test.stack;

import java.util.Deque;
import java.util.ArrayDeque;

public class BrowserHistory {

    Deque<String> browserHistory = new ArrayDeque<>();

    public void visitPage(String page) {

        System.out.println("방문: " + page);
        browserHistory.push(page);
    }

    public String goBack() {

        browserHistory.pop();
        System.out.println("뒤로 가기: " + browserHistory.peek());
        return browserHistory.peek();

    }
}

