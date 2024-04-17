package controller;

import model.Bike;
import model.Car;
import model.Motorcycle;
import model.Store;
import model.TypeOfVehicles;
import view.Massages.MenuMassages;

public class ProgramController {

    public static MenuMassages checkAddCar(String carName, String carBrand, String carCode) {
        if (Store.getCar(carCode) != null)
            return MenuMassages.CAR_EXISTS;
        Car car = new Car(carName, carBrand, carCode);
        Store.addCar(car);
        return MenuMassages.CAR_ADDED;
    }

    public static MenuMassages checkAddMotorcycle(String motorName, String motorBrand, String motorCode) {
        if (Store.getMotorcycle(motorCode) != null)
            return MenuMassages.MOTOR_EXISTS;
        Motorcycle motorcycle = new Motorcycle(motorName, motorBrand, motorCode);
        Store.addMotor(motorcycle);
        return MenuMassages.MOTOR_ADDED;
    }

    public static MenuMassages checkAddBike(String bikeName, String bikeBrand, String bikeCode, String bikeType) {
        if (Store.getBike(bikeCode) != null)
            return MenuMassages.BIKE_EXISTS;
        Bike bike = new Bike(bikeName, bikeBrand, bikeCode, bikeType);
        Store.addBike(bike);
        return MenuMassages.BIKE_ADDED;
    }

    public static MenuMassages checkSetColor(String code, String color, TypeOfVehicles typeOfVehicle) {
        switch (typeOfVehicle) {
            case CAR:
                if (Store.getCar(code) == null)
                    return MenuMassages.CAR_DOES_NOT_EXIST;
                Car car = Store.getCar(code);
                car.setColor(color);
                return MenuMassages.CAR_COLOR_IS;
            case MOTOR:
                if (Store.getMotorcycle(code) == null)
                    return MenuMassages.MOTOR_DOES_NOT_EXIST;
                Motorcycle motorcycle = Store.getMotorcycle(code);
                motorcycle.setColor(color);
                return MenuMassages.MOTOR_COLOR_IS;
            case BIKE:
                if (Store.getBike(code) == null)
                    return MenuMassages.BIKE_DOES_NOT_EXIST;
                Bike bike = Store.getBike(code);
                bike.setColor(color);
                return MenuMassages.BIKE_COLOR_IS;
            default:
                return null;
        }
    }

    public static MenuMassages checkSetOrigin(String code, String origin, TypeOfVehicles typeOfVehicle) {
        switch (typeOfVehicle) {
            case CAR:
                if (Store.getCar(code) == null)
                    return MenuMassages.CAR_DOES_NOT_EXIST;
                Car car = Store.getCar(code);
                car.setOrigin(origin);
                return MenuMassages.CAR_ORIGIN_IS;
            case MOTOR:
                if (Store.getMotorcycle(code) == null)
                    return MenuMassages.MOTOR_DOES_NOT_EXIST;
                Motorcycle motorcycle = Store.getMotorcycle(code);
                motorcycle.setOrigin(origin);
                return MenuMassages.MOTOR_ORIGIN_IS;
            default:
                if (Store.getBike(code) == null)
                    return MenuMassages.BIKE_DOES_NOT_EXIST;
                Bike bike = Store.getBike(code);
                bike.setOrigin(origin);
                return MenuMassages.BIKE_ORIGIN_IS;
        }
    }

    public static MenuMassages checkSetStrength(String code, double strength, TypeOfVehicles typeOfVehicle) {
        switch (typeOfVehicle) {
            case CAR:
                if (Store.getCar(code) == null)
                    return MenuMassages.CAR_DOES_NOT_EXIST;
                else if ((strength > 500) || (strength < 100))
                    return MenuMassages.INVALID_CAR_STRENGHT;
                Car car = Store.getCar(code);
                car.setCarStrength(strength);
                return MenuMassages.CAR_STRENGTH_IS;

            default:
                if (Store.getMotorcycle(code) == null)
                    return MenuMassages.MOTOR_DOES_NOT_EXIST;
                else if ((strength > 100) || (strength < 50))
                    return MenuMassages.INVALID_MOTOR_STRENGHT;
                Motorcycle motorcycle = Store.getMotorcycle(code);
                motorcycle.setMotorcycleStrength(strength);
                return MenuMassages.MOTOR_STRENGTH_IS;
        }
    }

    public static MenuMassages checkSetSpeed(String code, double speed, TypeOfVehicles typeOfVehicle) {
        switch (typeOfVehicle) {
            case CAR:
                if (Store.getCar(code) == null)
                    return MenuMassages.CAR_DOES_NOT_EXIST;
                else {
                    Car car = Store.getCar(code);
                    car.setCarSpeed(speed);
                    return MenuMassages.CAR_SPEED_IS;
                }

            default:
                if (Store.getMotorcycle(code) == null)
                    return MenuMassages.MOTOR_DOES_NOT_EXIST;
                else {
                    Motorcycle motorcycle = Store.getMotorcycle(code);
                    motorcycle.setMotorcycleSpeed(speed);
                    return MenuMassages.MOTOR_SPEED_IS;
                }
        }
    }

    public static MenuMassages checkSetWeight(String bikeCode, double bikeWeight) {
        if (Store.getBike(bikeCode) == null)
            return MenuMassages.BIKE_DOES_NOT_EXIST;
        Bike bike = Store.getBike(bikeCode);
        bike.setBikeWeight(bikeWeight);
        return MenuMassages.BIKE_WEGHT_IS;
    }

    public static MenuMassages checkSetWheelsize(String bikeCode, double bikeWheelSize) {
        if (Store.getBike(bikeCode) == null)
            return MenuMassages.BIKE_DOES_NOT_EXIST;
        if ((bikeWheelSize < 12) || (bikeWheelSize > 29))
            return MenuMassages.INVALID_WHEEL_SIZE;
        Bike bike = Store.getBike(bikeCode);
        bike.setBikeWheelSize(bikeWheelSize);
        return MenuMassages.BIKE_WHEELSIZE_IS;
    }

    public static MenuMassages checkSetPrice(String code, double price, TypeOfVehicles typeOfVehicle) {
        switch (typeOfVehicle) {
            case CAR:
                if (Store.getCar(code) == null)
                    return MenuMassages.CAR_DOES_NOT_EXIST;
                Car car = Store.getCar(code);
                car.setPrice(price);
                return MenuMassages.CAR_PRICE_IS;

            case MOTOR:
                if (Store.getMotorcycle(code) == null)
                    return MenuMassages.MOTOR_DOES_NOT_EXIST;
                Motorcycle motorcycle = Store.getMotorcycle(code);
                motorcycle.setPrice(price);
                return MenuMassages.MOTOR_PRICE_IS;

            default:
                if (Store.getBike(code) == null)
                    return MenuMassages.BIKE_DOES_NOT_EXIST;
                Bike bike = Store.getBike(code);
                bike.setPrice(price);
                return MenuMassages.BIKE_PRICE_IS;
        }
    }

    public static MenuMassages checkSetState(String code, boolean state, TypeOfVehicles typeOfVehicle) {
        switch (typeOfVehicle) {
            case CAR:
                if (Store.getCar(code) == null)
                    return MenuMassages.CAR_DOES_NOT_EXIST;
                Car car = Store.getCar(code);
                car.setState(state);
                if (state)
                    Store.removeCar(car);
                return MenuMassages.CAR_STATE_IS;
            case MOTOR:
                if (Store.getMotorcycle(code) == null)
                    return MenuMassages.MOTOR_DOES_NOT_EXIST;
                Motorcycle motorcycle = Store.getMotorcycle(code);
                motorcycle.setState(state);
                if (state)
                    Store.removeMotorcycle(motorcycle);
                return MenuMassages.MOTOR_STATE_IS;

            default:
                if (Store.getBike(code) == null)
                    return MenuMassages.BIKE_DOES_NOT_EXIST;
                Bike bike = Store.getBike(code);
                bike.setState(state);
                if (state)
                    Store.removeBike(bike);
                return MenuMassages.BIKE_STATE_IS;
        }
    }

    public static boolean checkComparVehicles(String code1, String code2, TypeOfVehicles typeOfVehicle) {
        // return false if car by code1 or code 2 does not exist.
        switch (typeOfVehicle) {
            case CAR:
                if ((Store.getCar(code1) == null) || (Store.getCar(code2) == null))
                    return false;
                return true;

            case MOTOR:
                if ((Store.getMotorcycle(code1) == null) || (Store.getMotorcycle(code2) == null))
                    return false;
                return true;

            case BIKE:
                if ((Store.getBike(code1) == null) || (Store.getBike(code2) == null))
                    return false;
                return true;

            default:
                return false;
        }
    }

    public static boolean checkTypesOfComparedBikes(Bike bike1, Bike bike2) {
        if (bike1.getBikeType().equals(bike2.getBikeType()))
            return true;
        return false;
    }

    public static Car compareCar(Car car1, Car car2, String compareByThis) {
        if (compareByThis.equals("speed")) {
            if (car1.getCarSpeed() > car2.getCarSpeed())
                return car1;
            else
                return car2;
        } else if (compareByThis.equals("strength")) {
            if (car1.getCarStrength() > car2.getCarStrength())
                return car1;
            else
                return car2;
        } else if (compareByThis.equals("price")) {
            if (car1.getPrice() < car2.getPrice())
                return car1;
            else
                return car2;
        } else
            return null;
    }

    public static Motorcycle compareMotorcycles(Motorcycle motorcycle1, Motorcycle motorcycle2, String compareByThis) {
        if (compareByThis.equals("speed")) {
            if (motorcycle1.getMotorcycleSpeed() > motorcycle2.getMotorcycleSpeed())
                return motorcycle1;
            else
                return motorcycle2;
        } else if (compareByThis.equals("strength")) {
            if (motorcycle1.getMotorcycleStrength() > motorcycle2.getMotorcycleStrength())
                return motorcycle1;
            else
                return motorcycle2;
        } else if (compareByThis.equals("price")) {
            if (motorcycle1.getPrice() < motorcycle2.getPrice())
                return motorcycle1;
            else
                return motorcycle2;
        } else
            return null;
    }

    public static Bike comparBikes(Bike bike1, Bike bike2, String compareByThis) {
        if (compareByThis.equals("weight")) {
            if (bike1.getBikeWeight() > bike2.getBikeWeight())
                return bike1;
            return bike2;
        } else if (compareByThis.equals("price")) {
            if (bike1.getPrice() < bike2.getPrice())
                return bike1;
            return bike2;
        } else
            return null;
    }

    public static MenuMassages checkSetVehicleDiscount(String code, double discountPercent,
            TypeOfVehicles typeOfVehicle) {
        switch (typeOfVehicle) {
            case CAR:
                if (Store.getCar(code) == null)
                    return MenuMassages.CAR_DOES_NOT_EXIST;
                if ((discountPercent < 5) || (discountPercent > 15))
                    return MenuMassages.INVALID_DISCOUNT;
                Car car = Store.getCar(code);
                car.setDiscountPercent(discountPercent);
                car.setPriceAfterDiscount(discountPercent);
                return MenuMassages.CAR_PRICE_AFTER_DISCOUNT;
            case MOTOR:
                if (Store.getMotorcycle(code) == null)
                    return MenuMassages.MOTOR_DOES_NOT_EXIST;
                if ((discountPercent < 5) || (discountPercent > 15))
                    return MenuMassages.INVALID_DISCOUNT;
                Motorcycle motorcycle = Store.getMotorcycle(code);
                motorcycle.setDiscountPercent(discountPercent);
                motorcycle.setPriceAfterDiscount(discountPercent);
                return MenuMassages.MOTOR_PRICE_AFTER_DISCOUNT;
            default:
                if (Store.getBike(code) == null)
                    return MenuMassages.BIKE_DOES_NOT_EXIST;
                if ((discountPercent < 5) || (discountPercent > 15))
                    return MenuMassages.INVALID_DISCOUNT;
                Bike bike = Store.getBike(code);
                bike.setDiscountPercent(discountPercent);
                bike.setPriceAfterDiscount(discountPercent);
                return MenuMassages.BIKE_PRICE_AFTER_DISCOUNT;
        }
    }

    public static boolean checkCodeIsInStore(String code, TypeOfVehicles typeOfVehicle) {
        switch (typeOfVehicle) {
            case CAR:
                if (Store.getCar(code) == null)
                    return false;
                return true;
            case MOTOR:
                if (Store.getMotorcycle(code) == null)
                    return false;
                return true;
            default:
                if (Store.getBike(code) == null)
                    return false;
                return true;
        }
    }

}
