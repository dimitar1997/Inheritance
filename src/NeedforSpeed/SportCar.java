package NeedforSpeed;

public class SportCar extends Car{
    private double DEFAULT_FUEL_CONSUMPTION = 10;
    public SportCar(Double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
