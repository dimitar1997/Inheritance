package NeedforSpeed;

public class Vehicle {
     final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
     private  double fuelConsumption;
     private double fuel;
     private int horsePower;

     public Vehicle(Double fuel, int horsePower){
         this.fuel = fuel;
         this.horsePower = horsePower;
         this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
     }
     public void drive(Double kilometers){
         double usedFuel = kilometers * fuelConsumption;
         if (usedFuel <= fuel){
             fuel -= usedFuel;
         }

     }
    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
