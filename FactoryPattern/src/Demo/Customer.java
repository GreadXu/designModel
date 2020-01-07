package Demo;


import java.util.Date;

public class Customer {

    public static void main(String[] args) {
        VehicleVender vender = new VehicleVender();
        Vehicle first = vender.getVehicle(VehicleManufacturers.Benz);
        first.run();
        Vehicle seconed = vender.getVehicle(VehicleManufacturers.BMW);
        seconed.run();
        Vehicle third = vender.getVehicle(VehicleManufacturers.Ferrari);
        third.run();
        Date date;
    }
}
