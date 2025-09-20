interface Vehicle {
    void start();
    void stop();
}
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }
    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike started");
    }
    @Override
    public void stop() {
        System.out.println("Bike stopped");
    }
}
public class Interface_ex {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
        myCar.stop();
        Vehicle myBike = new Bike();
        myBike.start();
        myBike.stop();
    }
}
