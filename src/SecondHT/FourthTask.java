package SecondHT;

import java.util.*;

public class FourthTask {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Алия", "1111");
        phoneBook.put("Аман", "2222");
        phoneBook.put("Бек", "3333");
        phoneBook.put("Бота", "4444");
        phoneBook.put("Санжар", "5555");
        phoneBook.put("Сергей", "6666");
        phoneBook.put("Айжан", "7777");
        phoneBook.put("Алина", "8888");

        System.out.println("Бек -> " + phoneBook.get("Бек"));
        System.out.println("Кто-то -> " + phoneBook.getOrDefault("Кто-то", "не найдено"));

        phoneBook.put("Алия", "9999");

        phoneBook.remove("Сергей");

        System.out.println("\nТелефонная книга:");
        for (Map.Entry<String, String> e : phoneBook.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        System.out.println("\nВсего контактов: " + phoneBook.size());

        Map<String, String> sorted = new TreeMap<>(phoneBook);
        System.out.println("Отсортированная книга: " + sorted);
    }
}