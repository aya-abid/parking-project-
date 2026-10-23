package parking.refactored;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Tariff carTariff = new CarTariff();
        Tariff bikeTariff = new MotorbikeTariff();
        Tariff truckTariff = new TruckTariff();

        Vehicle car = new Vehicle("12345-A-6", "CAR", carTariff);
        Vehicle bike = new Vehicle("67890-B-1", "MOTORBIKE", bikeTariff);
        Vehicle truck = new Vehicle("24680-D-8", "TRUCK", truckTariff);

        PaymentMethod card = new CardPayment("4242");
        PaymentMethod cash = new CashPayment();

        ReceiptLogger logger = new FileLogger("parking.log");
        ReceiptFormatter formatter = new ReceiptFormatter();

        ParkingService garage =
                new ParkingService(logger, formatter);

        garage.checkout(car, 3, card);
        garage.checkout(bike, 2, cash);
        garage.checkout(truck, 4, card);

        garage.cancel(bike, 2, cash);
        garage.cancel(truck, 4, card);

        System.out.println(garage.dailyReport());

        System.out.println(garage.dailyReport());
    }
}