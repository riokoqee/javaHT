package SecondHT;

import java.util.*;

public class FifthTask {
    public static void main(String[] args) {
        List<String> catalog = new ArrayList<>(Arrays.asList(
                "Takehiko - Vagabond",
                "Takehiko - Slam Dunk",
                "Yusuke - One Punch Man",
                "Yusuke - Mob Psycho 100",
                "Naoki - Monster",
                "Naoki - 20th Century Boys"
        ));

        Set<String> authors = new HashSet<>();
        for (String book : catalog) {
            authors.add(book.split(" - ")[0]);
        }

        Map<String, List<String>> readers = new HashMap<>();

        Queue<String> waitQueue = new LinkedList<>();

        String reader = "Амир";
        String book = "Yusuke - One Punch Man";
        if (!readers.values().stream().anyMatch(list -> list.contains(book))) {
            readers.putIfAbsent(reader, new ArrayList<>());
            readers.get(reader).add(book);
        } else {
            waitQueue.add(reader);
        }

        readers.get(reader).remove(book);
        if (!waitQueue.isEmpty()) {
            String next = waitQueue.poll();
            readers.putIfAbsent(next, new ArrayList<>());
            readers.get(next).add(book);
        }

        System.out.println("Каталог манг: " + catalog);
        System.out.println("Авторы: " + authors);
        System.out.println("Очередь ожидания: " + waitQueue);
        System.out.println("Выданные манги: " + readers);
    }
}
