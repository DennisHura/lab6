package bicycle;

import vehicle.Vehicle;

public class Bicycle extends Vehicle {
    public Bicycle(int id) {
        super(id);
    }

    @Override
    public void move(int id) {
        System.out.println("Велосипед №" + id + " выехал");
    }
}
