package SecondHT;

import java.util.*;

public class ThirdTask {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>(Arrays.asList(
                "Али", "Бек", "Санжар", "Диана", "Марат", "Жанна"
        ));

        System.out.println("Следующий: " + queue.peek());

        queue.poll(); queue.poll();
        System.out.println("После обслуживания двух: " + queue);

        queue.add("Тимур");
        queue.add("Айжан");
        System.out.println("После добавления: " + queue);

        System.out.println("Следующий: " + queue.peek());

        System.out.println("\nОбслуживание:");
        while (!queue.isEmpty()) {
            System.out.println("Обслужен: " + queue.poll());
        }

        Deque<String> deque = new LinkedList<>();
        deque.add("А"); deque.add("C"); deque.add("В");
        deque.addFirst("X"); deque.addFirst("Y"); deque.addFirst("Z");
        System.out.println("\nDeque старт: " + deque);

        while (!deque.isEmpty()) {
            if (!deque.isEmpty()) System.out.println("С начала: " + deque.pollFirst());
            if (!deque.isEmpty()) System.out.println("С конца: " + deque.pollLast());
            System.out.println("Текущее состояние: " + deque);
        }
    }
}
