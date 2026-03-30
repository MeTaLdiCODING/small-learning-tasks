public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy",3);
        dog.speak();
        dog.fetch();

        Cat cat = new Cat("Mittens",2);
        cat.speak();
        cat.scratch();
    }
}

class Animal { // модификтор доступа для класса дописывать НЕ нужно
    private String name;
   private int age;

public Animal (String name, int age){
    this.age = age;
    this.name = name;
    }
    void speak() {
        System.out.println("Animal sound");
    }
    public String getName(){
    return name;
    }
    public int getAge(){
    return age;
    }


}

class Dog extends Animal { // модификтор доступа для класса дописывать НЕ нужно
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    void speak() {
        System.out.println("Bark!");
    }
    void fetch() {
        System.out.println(getName() + " is fetching");
    }
}

class Cat extends Animal { // модификтор доступа для класса дописывать НЕ нужно
    public Cat (String name, int age) {
        super(name, age);
    }
   @Override
    void speak() {
        System.out.println("Meow!");
    }

    void scratch() {
        System.out.println(getName() + " is scratching");
    }
}
