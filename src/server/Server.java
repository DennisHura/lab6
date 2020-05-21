package server;

import vehicle.Vehicle;

public class Server {

    private int[] countVehicles;
    private int commonCountVehicles;
    private int limitVehicles;
    private Vehicle[] vehicles = new Vehicle[limitVehicles];
    //
    public Server (int size,int limit) {
        countVehicles = new int[size];
        vehicles = new Vehicle[limit];
        this.limitVehicles = limit;
    }

    public int getLimitVehicles() {
        return limitVehicles;
    }

    public int getCurrentCountVehicles(){
        return commonCountVehicles;
    }

   // public void addTransport(int numberVehicle, Vehicle vehicle){
   //     countVehicles[numberVehicle]++;
    //    commonCountVehicles++;
      ///  vehicles [commonCountVehicles] = vehicle;
        //vehicle.move(countVehicles[numberVehicle]);

    //}




    public int[] getCountVehicles() {
        return countVehicles;
    }



    public void addTransport (int numberVehicles, Vehicle vehicle, int id) {
        countVehicles[numberVehicles]++;
        vehicles [commonCountVehicles] = vehicle;
        vehicles[commonCountVehicles].move(id);
        commonCountVehicles ++;
    }

}
