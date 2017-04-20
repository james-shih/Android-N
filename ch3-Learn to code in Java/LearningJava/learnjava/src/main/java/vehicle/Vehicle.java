package vehicle;

/**
 * Created by James on 2017/4/19.
 */

public class Vehicle {

    private String make;
    private String model;
    protected int horsepower;
    private int odometer;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        if (odometer > 0) {
            this.odometer = odometer;
        }
    }

    public void addToOdometer(int milesToAdd) {
        if (milesToAdd > 0) {
            this.odometer += milesToAdd;
        }
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void accelerate() {
        //Write some code to accelerate a vehicle
        System.out.println("Accelerating Vehicle");
    }

    public void printDetail() {
        System.out.println("Make: " + this.make + " Model: " + this.model);
    }
}
