import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServicedTransport car = new Car("car1", 4);
        ServicedTransport car2 = new Car("car2");

        ServicedTransport truck = new Truck("truck1", 6);
        ServicedTransport truck2 = new Truck("truck2", 8);

        ServicedTransport bicycle = new Bicycle("bicycle1", 2);
        ServicedTransport bicycle2 = new Bicycle("bicycle2");

        new ServiceStation().check(List.of(bicycle, bicycle2, car, car2, truck, truck2));
    }
}