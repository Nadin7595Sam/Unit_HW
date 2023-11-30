class Car extends Vehicle {
    public Car(String company, String model, int yearRelease) {
        super(company, model, yearRelease);
        this.numWheels = 4;
    }

    @Override
    public void testDrive() {
        speed = 60;
    }

    @Override
    public void park() {
        speed = 0;
    }
}