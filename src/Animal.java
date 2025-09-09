import java.util.Scanner;

public class Animal {
    private String sound;
    private String name;

    public Animal(String sound, String name) {
        this.name = name;
        this.sound = sound;
    }

    private void makeSound() {
        System.out.println(sound);
    }

    protected void showSound() {
        makeSound();
    }

    public String getName() {
        return name;
    }
}
