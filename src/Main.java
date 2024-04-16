import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServicedTransport car = new Car("car1", 4);
        ServicedTransport car2 = new Car("car2", 4);

        ServicedTransport truck = new Truck("truck1", 6);
        ServicedTransport truck2 = new Truck("truck2", 8);

        ServicedTransport bicycle = new Bicycle("bicycle1", 2);
        ServicedTransport bicycle2 = new Bicycle("bicycle2", 2);

        List<ServicedTransport> transportList = List.of(bicycle, bicycle2, car, car2, truck, truck2);
        ServiceStation station = new ServiceStation();
        for (ServicedTransport t : transportList) {
            station.check(t);
        }
//        station.check(car, null, null);
//        station.check(car2, null, null);
//        station.check(null, bicycle, null);
//        station.check(null, bicycle2, null);
//        station.check(null, null, truck);
//        station.check(null, null, truck2);
    }
}