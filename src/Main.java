public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to polymorphism!");

        Transport[] transports = {
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2),

                new Car("car1", 4),
                new Car("car2", 4),

                new Truck("truck1", 6),
                new Truck("truck2", 8),
        };
        ServiceStation station = new ServiceStation();

        for (int i = 0; i < transports.length; i++) {
            station.check((Mainenance) transports[i]);
        }
    }
}
