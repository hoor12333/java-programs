public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2020);
        myCar.displayInfo();

        System.out.println("another car:  ");
        Car anotherCar = new Car("Honda", "Civic", 2021);
        anotherCar.displayInfo();
    }
} 