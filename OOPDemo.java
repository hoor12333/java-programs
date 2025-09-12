
// 1. Abstraction
// ------------------------------
abstract class Animal {
    private String name;  // Encapsulation (private field)

    public Animal(String name) {
        this.name = name;
    }

    // Abstract method (must be implemented by subclasses)
    public abstract String speak();

    // Encapsulation: controlled access
    public String getName() {
        return name;
    }
}

// ------------------------------
// 2. Inheritance
// ------------------------------
class Dog extends Animal {
    private String breed;  // Encapsulation (private field)

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    // ------------------------------
    // 3. Polymorphism
    // ------------------------------
    @Override
    public String speak() {
        return getName() + " says Woof!";
    }

    public String getBreed() {
        return breed;
    }
}

class Cat extends Animal {
    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public String speak() {
        return getName() + " says Meow!";
    }

    public String getColor() {
        return color;
    }
}

// ------------------------------
// Example usage
// ------------------------------
public class OOPDemo {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Buddy", "Golden Retriever"),
            new Cat("Whiskers", "Black")
        };

        // Polymorphism: same method call, different behavior
        for (Animal animal : animals) {
            System.out.println(animal.speak());
        }
    }
}

    

