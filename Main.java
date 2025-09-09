// ----------- Calculator Class (Method Overloading) -----------
class Calculator {
    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two doubles
    double add(double a, double b) {
        return a + b;
    }
}

// ----------- Shape Class (Method Overriding) -----------
class Shape {
    // Base area method (generic)
    double area() {
        return 0;
    }
}

// Circle class extends Shape and overrides area()
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Square class extends Shape and overrides area()
class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }
}

// ----------- Main Class -----------
public class Main {
    public static void main(String[] args) {
        // --------- Method Overloading Demonstration ---------
        Calculator calc = new Calculator();
        System.out.println("Add 2 integers: " + calc.add(2, 3));         // 5
        System.out.println("Add 3 integers: " + calc.add(2, 3, 4));      // 9
        System.out.println("Add 2 doubles: " + calc.add(2.5, 3.5));      // 6.0

        // --------- Method Overriding Demonstration ---------
        // Polymorphism: Shape reference to Circle object
        Shape myShape = new Circle(5);
        System.out.println("Circle area: " + myShape.area());             // 78.5398...

        // Shape reference to Square object
        myShape = new Square(4);
        System.out.println("Square area: " + myShape.area());             // 16.0
    }
}
