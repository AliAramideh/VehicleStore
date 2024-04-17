package model;

public class Motorcycle extends Vehicle {

    // Additional fileds:
    private double motorStrength;
    private double motorSpeed;

    // Constructor
    public Motorcycle(String motorName, String motorBrand, String motorCode) {
        super(motorName, motorBrand, motorCode);
    }

    // getters and settesr
    public double getMotorcycleStrength() {
        return motorStrength;
    }

    public void setMotorcycleStrength(double motorcycleStrength) {
        this.motorStrength = motorcycleStrength;
    }

    public double getMotorcycleSpeed() {
        return motorSpeed;
    }

    public void setMotorcycleSpeed(double motorcycleSpeed) {
        this.motorSpeed = motorcycleSpeed;
    }
}
