class Motorcycle extends Vehicle {
    public Motorcycle(String company, String model, int yearRelease) {
        super(company, model, yearRelease);
        this.numWheels = 2;
    }

    @Override
    public void testDrive() {
        speed = 75;
    }

    @Override
    public void park() {
        speed = 0;
    }
}