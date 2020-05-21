package jumpers;

import vehicle.Vehicle;

public class Jumpers extends Vehicle {
    public Jumpers(int id) {
        super(id);
    }

    @Override
    public void move(int id) {
        System.out.println("Джамперы №" + id + " ускакали");
    }
}
