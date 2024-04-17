package model;

public class Vehicle {

    // Fileds
    private String name;
    private String brand;
    private String code;
    private String color;
    private String origin;
    private double price;
    private boolean state;
    private double discountPercent;

    // Constructor
    public Vehicle(String name, String brand, String code) {
        this.name = name;
        this.brand = brand;
        this.code = code;
    }

    // Methods
    public void setPriceAfterDiscount(double discountPercent) {
        this.price *= ((100 - discountPercent) / 100);
    }

    // getters & setters:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

}
