package SecondHT;

import java.util.*;

public class SecondTask {
    public static void main(String[] args) {
        List<String> rawCities = Arrays.asList(
                "Алматы","Астана","Париж","Астана","Рим","Берлин",
                "Лондон","Париж","Токио","Осака","Берлин","Прага","Сеул"
        );

        Set<String> hashSet = new HashSet<>(rawCities);
        Set<String> linkedSet = new LinkedHashSet<>(rawCities);
        Set<String> treeSet = new TreeSet<>(rawCities);

        System.out.println("HashSet (" + hashSet.size() + "): " + hashSet);
        System.out.println("LinkedHashSet (" + linkedSet.size() + "): " + linkedSet);
        System.out.println("TreeSet (" + treeSet.size() + "): " + treeSet);

        hashSet.add("Париж");
        System.out.println("\nПосле добавления дубликата (HashSet): " + hashSet + " размер=" + hashSet.size());
    }
}
