/**
 * Abstract product in the Factory Method pattern.
 * Declares the common interface for all concrete products (vehicles).
 */
abstract class Vehicle {
    /**
     * Prints information about the specific type of vehicle.
     * Implemented by concrete vehicle classes.
     */
    public abstract void printVehicle();
}

/**
 * Concrete product representing a two-wheeler vehicle.
 */
class TwoWheeler extends Vehicle {
    @Override
    public void printVehicle() {
        System.out.println("I am two wheeler");
    }
}

/**
 * Concrete product representing a four-wheeler vehicle.
 */
class FourWheeler extends Vehicle {
    @Override
    public void printVehicle() {
        System.out.println("I am four wheeler");
    }
}

/**
 * Factory interface in the Factory Method pattern.
 * Declares the method for creating vehicle objects.
 */
interface VehicleFactory {
    /**
     * Creates and returns a new {@link Vehicle}.
     * @return a new vehicle instance
     */
    Vehicle createVehicle();
}

/**
 * Concrete factory that creates {@link TwoWheeler} instances.
 */
class TwoWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}

/**
 * Concrete factory that creates {@link FourWheeler} instances.
 */
class FourWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}

/**
 * Client class that uses a {@link VehicleFactory} to obtain {@link Vehicle} objects.
 * The client is decoupled from the concrete vehicle classes.
 */
class Client {
    private final Vehicle pVehicle;

    /**
     * Constructs a Client by accepting a {@link VehicleFactory}.
     * This allows the client to work with any vehicle type without knowing its concrete class.
     * @param factory the factory used to create the vehicle
     */
    public Client(VehicleFactory factory) {
        pVehicle = factory.createVehicle();
    }

    /**
     * Returns the vehicle created by the factory.
     * @return the created vehicle
     */
    public Vehicle getVehicle() {
        return pVehicle;
    }
}

/**
 * Demonstrates the Factory Method pattern.
 *
 * <p>
 * The pattern allows object creation to be delegated to factory classes,
 * promoting loose coupling and easier scalability.
 * </p>
 *
 * <p>
 * Pattern Roles:
 * <ul>
 *   <li>{@link Vehicle} - Abstract Product</li>
 *   <li>{@link TwoWheeler}, {@link FourWheeler} - Concrete Products</li>
 *   <li>{@link VehicleFactory} - Factory Interface</li>
 *   <li>{@link TwoWheelerFactory}, {@link FourWheelerFactory} - Concrete Factories</li>
 *   <li>{@link Client} - Uses factory to get product</li>
 * </ul>
 * </p>
 */
public class FactoryPattern {
    public static void main(String[] args) {
        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
        Client twoWheelerClient = new Client(twoWheelerFactory);
        Vehicle twoWheeler = twoWheelerClient.getVehicle();
        twoWheeler.printVehicle();

        VehicleFactory fourWheelerFactory = new FourWheelerFactory();
        Client fourWheelerClient = new Client(fourWheelerFactory);
        Vehicle fourWheeler = fourWheelerClient.getVehicle();
        fourWheeler.printVehicle();
    }
}
