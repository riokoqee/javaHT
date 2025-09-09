import  java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите номер задания(1-5):");
        String numberTask =  sc.nextLine();

        switch (numberTask) {
            case "1" -> firstTask();
            case "2" -> secondTask();
            case "3" -> thirdTask();
            case "4" -> fourthTask();
            case "5" -> fifthTask();

            default -> System.out.println("Такого задания нет.");
        }
    }

    public static int firstTask() {
        System.out.println("Введите число основания:");
        int base = sc.nextInt();
        sc.nextLine();

        System.out.println("Введите число степени:");
        int exponent = sc.nextInt();
        sc.nextLine();

        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        System.out.println("Вывод: " +  result);
        return result;
    }

    public static double secondTask() {
        System.out.println("Введите первое число:");
        int a = sc.nextInt();
        sc.nextLine();

        System.out.println("Введите второе число:");
        int b = sc.nextInt();
        sc.nextLine();

        System.out.println("Введите третье число:");
        int c = sc.nextInt();
        sc.nextLine();

        int result = (a + b + c) / 3;
        System.out.println("Среднее арифметическое ваших трех чисел: " +  result);
        return result;
    }

    public static int thirdTask() {
        System.out.println("Введите число:");
        int number =  sc.nextInt();
        sc.nextLine();

        int lastDigit = Math.abs(number % 10);
        System.out.println("Последняя цифра числа: " + lastDigit);
        return lastDigit;
    }

    public static int fourthTask() {
        System.out.println("Введите отрицательное число:");
        int number = sc.nextInt();
        sc.nextLine();

        int result = number < 0 ? -number : number;
        System.out.println("Теперь оно положительное :3 = " + result);
        return result;
    }

    public static void fifthTask() {
        System.out.println("Послушать звуки животных - 1");
        System.out.println("Создать свой звук - 2");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            Dog dog = new Dog();
            System.out.println(dog.getName() + " говорит: ");
            dog.showSound();

            Cat cat = new Cat();
            System.out.println(cat.getName() + " говорит: ");
            cat.showSound();

            Amir amir = new Amir();
            System.out.println(amir.getName() + " говорит: ");
            amir.showSound();
        }

        else if (choice == 2) {
            System.out.println("Введите имя вашего животного:");
            String animalName = sc.nextLine();

            System.out.println("Введите звук вашего животного:");
            String userSound =  sc.nextLine();

            Animal userAnimal = new Animal(userSound, animalName);

            System.out.println(userAnimal.getName() + " говорит:");
            userAnimal.showSound();
        }

        else {
            System.out.println("Такой выбор отсутствует.");
        }
    }
}