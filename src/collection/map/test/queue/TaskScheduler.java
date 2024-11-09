package collection.map.test.queue;

import java.util.Deque;
import java.util.ArrayDeque;

public class TaskScheduler {

    Deque<Task> taskScheduler = new ArrayDeque<>();

    public void addTask(Task task) {
        taskScheduler.offer(task);
    }

    public void processNextTask() {
        taskScheduler.poll().execute();
    }

    public int getRemainingTasks() {
        return taskScheduler.size();
    }
}
