import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Toyota", "Camry", 2022);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarHasFourWheels() {
        Car car = new Car("Toyota", "Camry", 2022);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2022);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void testCarAcceleratesTo60() {
        Car car = new Car("Toyota", "Camry", 2022);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void testMotorcycleAcceleratesTo75() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2022);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void testCarStopsWhenParked() {
        Car car = new Car("Toyota", "Camry", 2022);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void testMotorcycleStopsWhenParked() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2022);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}