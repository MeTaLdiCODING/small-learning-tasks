package Task11;

import java.util.ArrayList;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Бобик");
        System.out.println("Собака по имени " + dog1.getName() + " говорит: " + dog1.makeSound());

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.get(0)+list.get(1)+list.get(2));

    }
}



// Абстрактный класс
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String makeSound();

    public String getName() {
        return name;
    }
}

// Интерфейс
interface Flyable {
    void fly();
}

// Класс, который наследуется + реализует интерфейс + использует generics
class Dog extends Animal implements Flyable {

    // конструктор
    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Гав!";
    }

    @Override
    public void fly() {
        System.out.println("Собака не умеет летать... но я стараюсь!");
    }
}

