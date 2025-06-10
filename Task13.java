public class Task13 {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Carmry", 2022, 4);

        car1.displayDetails();
    }
}

class Vehicle {

    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }
}

class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {
        System.out.printf("""
                Car Details:
                Make: %1$s
                Model: %2$s
                Year: %3$d
                Number of Doors: %4$d""".formatted(super.getMake(), super.getModel(), super.getYear(), this.numberOfDoors));
    }
}
