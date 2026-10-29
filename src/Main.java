public class Main {

    public static void main(String[] args) {

        Car car = new Car("Civic", "Honda", 2022, 25000.0, "Black", 5);

        System.out.println("Initial car information:");
        System.out.println(car.toString());

        car.sell();

        System.out.println("\nAfter selling one car:");

        System.out.println("Model: " + car.getModel());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Color: " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());

        car.setModel("Corolla");
        car.setBrand("Toyota");
        car.setYear(2025);
        car.setPrice(30000.0);
        car.setColor("White");

        System.out.println("\nUpdated car information:");
        System.out.println(car.toString());

        car.delivery();

        System.out.println("\nAfter delivering one car:");
        System.out.println(car.toString());
    }
}