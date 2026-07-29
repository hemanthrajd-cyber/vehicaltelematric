package model;

public class VehicleData {
    // 1. Attributes (The data we want to store)
    private int speed;
    private int temperature;

    // 2. Constructor (How we build a new data box)
    public VehicleData(int speed, int temperature) {
        this.speed = speed;
        this.temperature = temperature;
    }

    // 3. Getter Methods (How other classes safely read the data)
    public int getSpeed() {
        return speed;
    }

    public int getTemperature() {
        return temperature;
    }
}