package model;

public class Car extends Vehicle {

    // Addotional variables
    private double carStrength;
    private double carSpeed;

    // Constructor
    public Car(String carName, String carBrand, String carCode) {
        super(carName, carBrand, carCode);
    }

    // getters & setters:
    public double getCarStrength() {
        return carStrength;
    }

    public void setCarStrength(double carStrength) {
        this.carStrength = carStrength;
    }

    public double getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(double carSpeed) {
        this.carSpeed = carSpeed;
    }

}
