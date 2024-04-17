package model;

public class Bike extends Vehicle {

    // Additional fileds:
    private String bikeType;
    private double bikeWeight;
    private double wheelSize;

    // Constructor
    public Bike(String bikeName, String bikeBrand, String bikeCode, String bikeType) {
        super(bikeName, bikeBrand, bikeCode);
        this.bikeType = bikeType;
    }

    // getters & setters:
    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public double getBikeWeight() {
        return bikeWeight;
    }

    public void setBikeWeight(double bikeWeight) {
        this.bikeWeight = bikeWeight;
    }

    public double getWheelSize() {
        return wheelSize;
    }

    public void setBikeWheelSize(double wheelSize) {
        this.wheelSize = wheelSize;
    }

}
