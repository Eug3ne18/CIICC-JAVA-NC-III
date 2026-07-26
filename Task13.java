
public class Task13 {
    public static void main(String[] args) {
        // 3. Create an instance of the Car class and set values for its attributes
        Car myCar = new Car("Susuki", "Camry", 2026, 4);

        myCar.displayDetails();
    }
}
 
class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year); // Inheriting attributes from Vehicle
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}