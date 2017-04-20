package vehicle;

/**
 * Created by James on 2017/4/19.
 */

public class Bus extends Vehicle {

    public Bus(String make, String model) {
        super(make, model);

    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating Bus");
    }
}
