package parking;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ParkingGarage garage = new ParkingGarage();

        Vehicle car   = new Vehicle("12345-A-6", "CAR");
        Vehicle bike  = new Vehicle("67890-B-1", "MOTORBIKE");
        Vehicle truck = new Vehicle("24680-D-8", "TRUCK");

        ParkingGarage garage2 = new ParkingGarage();
        Vehicle truck2 = new Vehicle("24680-D-8", "TRUCK");

        System.out.println(garage2.fee(truck2, 4));
        garage2.checkout(truck2, 4, new CardPayment("4242"));

        PaymentMethod card = new CardPayment("4242");
        PaymentMethod cash = new CashPayment();

        garage.checkout(car, 3, card);
        garage.checkout(bike, 2, cash);
        garage.checkout(truck, 4, card);

        garage.cancel(bike, 2, cash);
        garage.cancel(truck, 4, card);

        System.out.println(garage.dailyReport());
    }
}
