
package rentalcars;


 public class Car {
    // 
    private String plateNumber;
    private String model;
    private double mileage;
    private double fuelLevel;
    private double tankCapacity;

   
    public Car(String plateNumber, String model, double startingFuel, double tankCapacity) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.mileage = 0; 
        this.fuelLevel = startingFuel;
        this.tankCapacity = tankCapacity;
    }


    public void drive(double km) {
        
        double fuelNeeded = km / 10.0;
        
        System.out.println("Driving " + km + " km...");
        if (fuelNeeded > this.fuelLevel) {
            System.out.println("Not enough fuel for this trip!");
        } else {
            this.mileage += km;
            this.fuelLevel -= fuelNeeded;
        }
    }

    public void refuel(double amount) {
        System.out.println("Refueling " + amount + " liters...");
        if (this.fuelLevel + amount > this.tankCapacity) {
            this.fuelLevel = this.tankCapacity;
            System.out.println("Tank is full, extra fuel discarded.");
        } else {
            this.fuelLevel += amount;
        }
    }

    public void checkStatus() {
        System.out.println("Current Mileage: " + this.mileage + " km | Current Fuel: " + this.fuelLevel + " L");
        
        if (this.fuelLevel < (0.10 * this.tankCapacity)) {
            System.out.println("Low fuel warning!");
        }
    }}

   
