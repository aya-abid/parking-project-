package parking.refactored;

public class CarTariff implements Tariff {
    @Override
    public double calculateFee(int hours) {
        return hours * 5.0;
    }
}