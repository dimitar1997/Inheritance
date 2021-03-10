package NeedforSpeed;

public class RaceMotorcycle  extends Motorcycle{

    private double DEFAULT_FUEL_CONSUMPTION = 10;
    public RaceMotorcycle(Double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
