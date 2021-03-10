package NeedforSpeed;

public class Car extends Vehicle{
    private double DEFAULT_FUEL_CONSUMPTION = 3;
    public Car(Double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
