package SecondHT;

import java.util.*;

public class FirstTask {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList(
                "Айжан", "Руслан", "Дана", "Айжан", "Ержан", "Мария", "Руслан", "Света"
        ));

        System.out.println("Список имён с индексами:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + ": " + names.get(i));
        }

        System.out.println("\n1-е имя: " + names.get(0));
        System.out.println("3-е имя: " + names.get(2));
        System.out.println("Последнее имя: " + names.get(names.size() - 1));

        names.remove("Айжан");
        System.out.println("\nПосле удаления первого 'Айжан': " + names);

        names.add(0, "Алина");
        names.add(names.size() / 2, "Тимур");
        System.out.println("После добавлений: " + names);

        names.sort(Comparator.naturalOrder());
        System.out.println("\nПо алфавиту: " + names);

        names.sort((a, b) -> Integer.compare(b.length(), a.length()));
        System.out.println("По длине (убывание): " + names);

        Set<String> unique = new HashSet<>(names);
        System.out.println("\nВсего имён: " + names.size());
        System.out.println("Уникальных имён: " + unique.size());
    }
}