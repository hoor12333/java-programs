public class Inheritance {
    class Animal {
    // Method to make a sound
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
    class Dog extends Animal {
        // Overriding the makeSound method
        @Override
        public void makeSound() {
            System.out.println("Bark");
        }
    }

    public static void main(String[] args) {
        Inheritance inheritance = new Inheritance();
        Animal myAnimal = inheritance.new Animal(); // Create an Animal object
        Animal myDog = inheritance.new Dog(); // Create a Dog object

        myAnimal.makeSound(); // Outputs: Some generic animal sound
        myDog.makeSound();    // Outputs: Bark
    }
    
}
