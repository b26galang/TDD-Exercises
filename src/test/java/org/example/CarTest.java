package org.example;

import org.junit.*;

public class CarTest {
    Car car;

    @Before
    public void setUp() {
        car = new Car(0, 100);
    }

    @After
    public void cleanUp() {
        System.out.println("Clean Up");
    }

    // Test to see if mileage and gas is updated after successfully driving
    // and amount of miles actually driven is returned
    @Test
    public void testDrive() {
        car.drive(5);
        Assert.assertEquals(5, car.getMileage(), 1);
        Assert.assertEquals(95, car.getGas(),1);
        Assert.assertEquals(5, car.drive(5),1);
    }

    // Test to see if gas and mileage isn't updated after running out of gas
    // and amount of miles actually driven is 0
    @Test
    public void testDriveWithoutGas() {
        car.drive(101);
        Assert.assertEquals(0, car.getMileage(), 1);
        Assert.assertEquals(100, car.getGas(), 1);
        Assert.assertEquals(0, car.drive(101),1);
    }

    // Test to see if gas is successfully added to current amount of gas
    @Test
    public void testFillGas() {
        car.fill(20);
        Assert.assertEquals(120, car.getGas(), 1);
    }

    // Test multiple drive method calls
    @Test
    public void testDriveMultiple() {
        car.drive(21);
        car.drive(18);
        car.drive(6);
        car.drive(30);
        car.drive(7);
        Assert.assertEquals(82, car.getMileage(), 1);
        Assert.assertEquals(18, car.getGas(), 1);
    }
}
