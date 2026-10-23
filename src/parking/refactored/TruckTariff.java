package parking.refactored;

public class TruckTariff implements Tariff {
    @Override
    public double calculateFee(int hours) {
        return 20 + hours * 10.0;
    }
}