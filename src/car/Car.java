package car;

import vehicle.Vehicle;

public class Car extends Vehicle {
    public Car(int id) {
        super(id);
    }


    @Override
    public void move(int id) {
        System.out.println("Автомобиль №" + id + " выехал");
    }
}
