package view;

import java.util.Scanner;
import java.util.regex.Matcher;

import view.Commands.MenuCommands;
import view.Massages.MenuMassages;

import controller.ProgramController;
import model.Bike;
import model.Car;
import model.Motorcycle;
import model.Store;
import model.TypeOfVehicles;

public class Menu {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String command = scanner.nextLine();
            Matcher matcher;

            if ((matcher = MenuCommands.getMatcher(command, MenuCommands.END)) != null)
                break;
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.ADD_CAR)) != null)
                addCar(matcher);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.ADD_MOTOR)) != null)
                addMotor(matcher);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.ADD_BIKE)) != null)
                addBike(matcher);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.SET_CAR_COLOR)) != null)
                setVehicleColor(matcher, TypeOfVehicles.CAR);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.SET_MOTOR_COLOR)) != null)
                setVehicleColor(matcher, TypeOfVehicles.MOTOR);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.SET_BIKE_COLOR)) != null)
                setVehicleColor(matcher, TypeOfVehicles.BIKE);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.SET_CAR_ORIGIN)) != null)
                setVehicleOrigin(matcher, TypeOfVehicles.CAR);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.SET_MOTOR_ORIGIN)) != null)
                setVehicleOrigin(matcher, TypeOfVehicles.MOTOR);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.SET_BIKE_ORIGIN)) != null)
                setVehicleOrigin(matcher, TypeOfVehicles.BIKE);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.SET_CAR_STRENGTH)) != null)
                setVehicleStrength(matcher, TypeOfVehicles.CAR);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.SET_MOTOR_STRENGTH)) != null)
                setVehicleStrength(matcher, TypeOfVehicles.MOTOR);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.SET_CAR_SPEED)) != null)
                setVehicleSpeed(matcher, TypeOfVehicles.CAR);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.SET_MOTOR_SPEED)) != null)
                setVehicleSpeed(matcher, TypeOfVehicles.MOTOR);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.SET_BIKE_WEIGHT)) != null)
                setBikeWeight(matcher);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.SET_BIKE_WHEELSIZE)) != null)
                setBikeWheelsize(matcher);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.SET_CAR_PRICE)) != null)
                setVehiclePrice(matcher, TypeOfVehicles.CAR);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.SET_MOTOR_PRICE)) != null)
                setVehiclePrice(matcher, TypeOfVehicles.MOTOR);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.SET_BIKE_PRICE)) != null)
                setVehiclePrice(matcher, TypeOfVehicles.BIKE);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.SET_CAR_STATE)) != null)
                setVehicleState(matcher, TypeOfVehicles.CAR);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.SET_MOTOR_STATE)) != null)
                setVehicleState(matcher, TypeOfVehicles.MOTOR);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.SET_BIKE_STATE)) != null)
                setVehicleState(matcher, TypeOfVehicles.BIKE);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.COMPARE_CARS)) != null)
                compareVehicles(matcher, TypeOfVehicles.CAR);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.COMPARE_MOTORCYCLES)) != null)
                compareVehicles(matcher, TypeOfVehicles.MOTOR);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.COMPARE_BIKES)) != null)
                compareVehicles(matcher, TypeOfVehicles.BIKE);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.SET_CAR_DISCOUNT)) != null)
                setVehicleDiscount(matcher, TypeOfVehicles.CAR);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.SET_MOTOR_DISCOUNT)) != null)
                setVehicleDiscount(matcher, TypeOfVehicles.MOTOR);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.SET_BIKE_DISCOUNT)) != null)
                setVehicleDiscount(matcher, TypeOfVehicles.BIKE);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.SEARCH_CARS_BY_COLOR)) != null)
                searchVehiclesByColor(matcher, TypeOfVehicles.CAR);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.SEARCH_MOTORS_BY_COLOR)) != null)
                searchVehiclesByColor(matcher, TypeOfVehicles.MOTOR);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.SEARCH_BIKES_BY_TYPE)) != null)
                searchBikesByType(matcher);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.SEARCH_CARS_BY_ORIGIN)) != null)
                searchVehiclesByOrigin(matcher, TypeOfVehicles.CAR);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.SEARCH_MOTORS_BY_ORIGIN)) != null)
                searchVehiclesByOrigin(matcher, TypeOfVehicles.MOTOR);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.SEARCH_BIKES_BY_ORIGIN)) != null)
                searchVehiclesByOrigin(matcher, TypeOfVehicles.BIKE);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.CAR_PROPERTIES)) != null)
                showVehicle(matcher, TypeOfVehicles.CAR);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.MOTOR_PROPERTIES)) != null)
                showVehicle(matcher, TypeOfVehicles.MOTOR);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.BIKE_PROPERTIES)) != null)
                showVehicle(matcher, TypeOfVehicles.BIKE);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.LEAST_CAR_PRICE)) != null)
                showVehicleWithLeastPrice(matcher, TypeOfVehicles.CAR);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.LEAST_MOTOR_PRICE)) != null)
                showVehicleWithLeastPrice(matcher, TypeOfVehicles.MOTOR);
            else if ((matcher = MenuCommands.getMatcher(command, MenuCommands.LEAST_BIKE_PRICE)) != null)
                showVehicleWithLeastPrice(matcher, TypeOfVehicles.BIKE);
            else
                System.out.println(MenuMassages.INVALID_INPUT.output);
        }
    }

    // Methods
    // addCar <CarName> <CarBrand> <CarCode>
    public static void addCar(Matcher matcher) {
        String carName = matcher.group("carName");
        String carBrand = matcher.group("carBrand");
        String carCode = matcher.group("carCode");
        MenuMassages massage = ProgramController.checkAddCar(carName, carBrand, carCode);
        System.out.println(massage.output);
    }

    public static void addMotor(Matcher matcher) {
        String motorName = matcher.group("motorName");
        String motorBrand = matcher.group("motorBrand");
        String motorCode = matcher.group("motorCode");
        MenuMassages massage = ProgramController.checkAddMotorcycle(motorName, motorBrand, motorCode);
        System.out.println(massage.output);
    }

    public static void addBike(Matcher matcher) {
        String bikeName = matcher.group("bikeName");
        String bikeBrand = matcher.group("bikeBrand");
        String bikeCode = matcher.group("bikeCode");
        String bikeType = matcher.group("bikeType");
        MenuMassages massage = ProgramController.checkAddBike(bikeName, bikeBrand, bikeCode, bikeType);
        System.out.println(massage.output);
    }

    public static void setVehicleColor(Matcher matcher, TypeOfVehicles typeOfVehicle) {
        String code;
        String color;
        MenuMassages massage;
        switch (typeOfVehicle) {
            case CAR:
                code = matcher.group("carCode");
                color = matcher.group("carColor");
                massage = ProgramController.checkSetColor(code, color, typeOfVehicle);
                if (massage.output.equals(MenuMassages.CAR_DOES_NOT_EXIST.output))
                    System.out.println(massage.output);
                else
                    System.out.println(massage.output + " " + color + "!");
                break;
            case MOTOR:
                code = matcher.group("motorCode");
                color = matcher.group("motorColor");
                massage = ProgramController.checkSetColor(code, color, typeOfVehicle);
                if (massage.output.equals(MenuMassages.MOTOR_DOES_NOT_EXIST.output))
                    System.out.println(massage.output);
                else
                    System.out.println(massage.output + " " + color + "!");
                break;
            default:
                code = matcher.group("bikeCode");
                color = matcher.group("bikeColor");
                massage = ProgramController.checkSetColor(code, color, typeOfVehicle);
                if (massage.output.equals(MenuMassages.BIKE_DOES_NOT_EXIST.output))
                    System.out.println(massage.output);
                else
                    System.out.println(massage.output + " " + color + "!");
                break;
        }
    }

    // SetCarOrigin <CarCode> <CarOrigin>
    public static void setVehicleOrigin(Matcher matcher, TypeOfVehicles typeOfVehicles) {
        String code;
        String origin;
        MenuMassages massage;
        switch (typeOfVehicles) {
            case CAR:
                code = matcher.group("carCode");
                origin = matcher.group("carOrigin");
                massage = ProgramController.checkSetOrigin(code, origin, typeOfVehicles);
                if (massage.output.equals(MenuMassages.CAR_DOES_NOT_EXIST.output))
                    System.out.println(massage.output);
                else
                    System.out.println(massage.output + " " + origin + "!");
                break;
            case MOTOR:
                code = matcher.group("motorCode");
                origin = matcher.group("motorOrigin");
                massage = ProgramController.checkSetOrigin(code, origin, typeOfVehicles);
                if (massage.output.equals(MenuMassages.MOTOR_DOES_NOT_EXIST.output))
                    System.out.println(massage.output);
                else
                    System.out.println(massage.output + " " + origin + "!");
                break;
            default:
                code = matcher.group("bikeCode");
                origin = matcher.group("bikeOrigin");
                massage = ProgramController.checkSetOrigin(code, origin, typeOfVehicles);
                if (massage.output.equals(MenuMassages.BIKE_DOES_NOT_EXIST.output))
                    System.out.println(massage.output);
                else
                    System.out.println(massage.output + " " + origin + "!");
                break;
        }
    }

    // SetCarStrength <CarCode> <CarStrength>
    public static void setVehicleStrength(Matcher matcher, TypeOfVehicles typeOfVehicle) {
        String code;
        String stringStrength;
        double strength;
        MenuMassages massage;
        switch (typeOfVehicle) {
            case CAR:
                code = matcher.group("carCode");
                stringStrength = matcher.group("carStrength");
                strength = Double.parseDouble(stringStrength);
                massage = ProgramController.checkSetStrength(code, strength, typeOfVehicle);
                if (massage.output.equals(MenuMassages.CAR_DOES_NOT_EXIST.output))
                    System.out.println(massage.output);
                else if (massage.output.equals(MenuMassages.INVALID_CAR_STRENGHT.output))
                    System.out.println(massage.output);
                else
                    System.out.println(massage.output + " " + strength + " hp!");
                break;
            default:
                code = matcher.group("motorCode");
                stringStrength = matcher.group("motorStrength");
                strength = Double.parseDouble(stringStrength);
                massage = ProgramController.checkSetStrength(code, strength, typeOfVehicle);
                if (massage.output.equals(MenuMassages.MOTOR_DOES_NOT_EXIST.output))
                    System.out.println(massage.output);
                else if (massage.output.equals(MenuMassages.INVALID_MOTOR_STRENGHT.output))
                    System.out.println(massage.output);
                else
                    System.out.println(massage.output + " " + strength + " hp!");
                break;
        }
    }

    // SetCarSpeed <CarCode> <CarSpeed>
    public static void setVehicleSpeed(Matcher matcher, TypeOfVehicles typeOfVehicle) {
        String code;
        String stringSpeed;
        double speed;
        MenuMassages massage;
        switch (typeOfVehicle) {
            case CAR:
                code = matcher.group("carCode");
                stringSpeed = matcher.group("carSpeed");
                speed = Double.parseDouble(stringSpeed);
                massage = ProgramController.checkSetSpeed(code, speed, TypeOfVehicles.CAR);
                if (massage.output.equals(MenuMassages.CAR_DOES_NOT_EXIST.output))
                    System.out.println(massage.output);
                else
                    System.out.println(massage.output + " " + speed + "!");
                break;

            default:
                code = matcher.group("motorCode");
                stringSpeed = matcher.group("motorSpeed");
                speed = Double.parseDouble(stringSpeed);
                massage = ProgramController.checkSetSpeed(code, speed, TypeOfVehicles.MOTOR);
                if (massage.output.equals(MenuMassages.MOTOR_DOES_NOT_EXIST.output))
                    System.out.println(massage.output);
                else
                    System.out.println(massage.output + " " + speed + "!");
                break;
        }
    }

    // SetBikeWeight <BikeCode> <BikeWeight>
    public static void setBikeWeight(Matcher matcher) {
        String bikeCode = matcher.group("bikeCode");
        String stringweight = matcher.group("bikeWeight");
        double bikeWeight = Double.parseDouble(stringweight);
        MenuMassages massage = ProgramController.checkSetWeight(bikeCode, bikeWeight);
        if (massage.output.equals(MenuMassages.BIKE_DOES_NOT_EXIST.output))
            System.out.println(massage.output);
        else
            System.out.println(massage.output + " " + bikeWeight + "!");
    }

    public static void setBikeWheelsize(Matcher matcher) {
        String bikeCode = matcher.group("bikeCode");
        String stringWheelsize = matcher.group("bikeWheelSize");
        double bikeWheelsize = Double.parseDouble(stringWheelsize);
        MenuMassages massage = ProgramController.checkSetWheelsize(bikeCode, bikeWheelsize);
        if (massage.output.equals(MenuMassages.BIKE_DOES_NOT_EXIST.output))
            System.out.println(massage.output);
        else if (massage.output.equals(MenuMassages.INVALID_WHEEL_SIZE.output))
            System.out.println(massage.output);
        else
            System.out.println(massage.output + " " + bikeWheelsize + " inches!");
    }

    // SetCarPrice <CarCode> <CarPrice>
    public static void setVehiclePrice(Matcher matcher, TypeOfVehicles typeOfVehicle) {
        String code;
        String stringPrice;
        double price;
        int integerPrice;
        MenuMassages massage;
        switch (typeOfVehicle) {
            case CAR:
                code = matcher.group("carCode");
                stringPrice = matcher.group("carPrice");
                price = Double.parseDouble(stringPrice);
                integerPrice = (int) price;
                massage = ProgramController.checkSetPrice(code, price, typeOfVehicle);
                if (massage.output.equals(MenuMassages.CAR_DOES_NOT_EXIST.output))
                    System.out.println(massage.output);
                else
                    System.out.println(massage.output + " " + integerPrice + "$!");
                break;

            case MOTOR:
                code = matcher.group("motorCode");
                stringPrice = matcher.group("motorPrice");
                price = Double.parseDouble(stringPrice);
                integerPrice = (int) price;
                massage = ProgramController.checkSetPrice(code, price, typeOfVehicle);
                if (massage.output.equals(MenuMassages.MOTOR_DOES_NOT_EXIST.output))
                    System.out.println(massage.output);
                else
                    System.out.println(massage.output + " " + integerPrice + "$!");
                break;

            default:
                code = matcher.group("bikeCode");
                stringPrice = matcher.group("bikePrice");
                price = Double.parseDouble(stringPrice);
                integerPrice = (int) price;
                massage = ProgramController.checkSetPrice(code, price, typeOfVehicle);
                if (massage.output.equals(MenuMassages.BIKE_DOES_NOT_EXIST.output))
                    System.out.println(massage.output);
                else
                    System.out.println(massage.output + " " + integerPrice + "$!");
                break;
        }
    }

    // SetCarState <CarCode> <CarState>
    public static void setVehicleState(Matcher matcher, TypeOfVehicles typeOfVehicle) {
        String code;
        String stringState;
        boolean state; // true -> sold | false -> unsold
        MenuMassages massage;
        switch (typeOfVehicle) {
            case CAR:
                code = matcher.group("carCode");
                stringState = matcher.group("carState");
                state = convertStateToBoolean(stringState);
                massage = ProgramController.checkSetState(code, state, typeOfVehicle);
                if (massage.output.equals(MenuMassages.CAR_DOES_NOT_EXIST.output))
                    System.out.println(massage.output);
                else
                    System.out.println(massage.output + " " + stringState + "!");
                break;

            case MOTOR:
                code = matcher.group("motorCode");
                stringState = matcher.group("motorState");
                state = convertStateToBoolean(stringState);
                massage = ProgramController.checkSetState(code, state, typeOfVehicle);
                if (massage.output.equals(MenuMassages.MOTOR_DOES_NOT_EXIST.output))
                    System.out.println(massage.output);
                else
                    System.out.println(massage.output + " " + stringState + "!");
                break;

            default:
                code = matcher.group("bikeCode");
                stringState = matcher.group("bikeState");
                state = convertStateToBoolean(stringState);
                massage = ProgramController.checkSetState(code, state, typeOfVehicle);
                if (massage.output.equals(MenuMassages.BIKE_DOES_NOT_EXIST.output))
                    System.out.println(massage.output);
                else
                    System.out.println(massage.output + " " + stringState + "!");
                break;
        }
    }

    private static boolean convertStateToBoolean(String stringState) {
        if (stringState.equals("sold"))
            return true;
        else
            return false;
    }

    // CompareCars <CarCode1> <CarCode2>
    public static void compareVehicles(Matcher matcher, TypeOfVehicles typeOfVehicle) {
        String code1, code2;
        switch (typeOfVehicle) {
            case CAR:
                code1 = matcher.group("carCode1");
                code2 = matcher.group("carCode2");
                if (!ProgramController.checkComparVehicles(code1, code2, typeOfVehicle)) {
                    System.out.println(MenuMassages.INVALID_INPUT.output);
                    return;
                }
                Car bestCarBySpeed = ProgramController.compareCar(Store.getCar(code1), Store.getCar(code2), "speed");
                Car bestCarByStrength = ProgramController.compareCar(Store.getCar(code1), Store.getCar(code2),
                        "strength");
                Car bestCarByPrice = ProgramController.compareCar(Store.getCar(code1), Store.getCar(code2), "price");
                System.out.println("CarSpeed: " + bestCarBySpeed.getCode());
                System.out.println("CarStrength: " + bestCarByStrength.getCode());
                System.out.println("CarPrice: " + bestCarByPrice.getCode());
                break;

            case MOTOR:
                code1 = matcher.group("motorCode1");
                code2 = matcher.group("motorCode2");
                if (!ProgramController.checkComparVehicles(code1, code2, typeOfVehicle)) {
                    System.out.println(MenuMassages.INVALID_INPUT.output);
                    return;
                }
                Motorcycle bestMotorBySpeed = ProgramController.compareMotorcycles(Store.getMotorcycle(code1),
                        Store.getMotorcycle(code2), "speed");
                Motorcycle bestMotorByStrength = ProgramController.compareMotorcycles(Store.getMotorcycle(code1),
                        Store.getMotorcycle(code2), "strength");
                Motorcycle bestMotorByPrice = ProgramController.compareMotorcycles(Store.getMotorcycle(code1),
                        Store.getMotorcycle(code2), "price");
                System.out.println("MotorcycleSpeed: " + bestMotorBySpeed.getCode());
                System.out.println("MotorcycleStrength: " + bestMotorByStrength.getCode());
                System.out.println("MotorcyclePrice: " + bestMotorByPrice.getCode());
                break;

            default:
                code1 = matcher.group("bikeCode1");
                code2 = matcher.group("bikeCode2");
                if (!ProgramController.checkComparVehicles(code1, code2, typeOfVehicle)) {
                    System.out.println(MenuMassages.INVALID_INPUT.output);
                    return;
                }
                if (!ProgramController.checkTypesOfComparedBikes(Store.getBike(code1), Store.getBike(code2))) {
                    System.out.println("Types should be the same!");
                    return;
                }
                Bike bestBikeByWeight = ProgramController.comparBikes(Store.getBike(code1), Store.getBike(code2),
                        "weight");
                Bike bestBikeByPrice = ProgramController.comparBikes(Store.getBike(code1), Store.getBike(code2),
                        "price");
                System.out.println("BikeWeight: " + bestBikeByWeight.getCode());
                System.out.println("BikePrice: " + bestBikeByPrice.getCode());
                break;
        }
    }

    // SetCarDiscount <CarCode> <Discountpercent>
    public static void setVehicleDiscount(Matcher matcher, TypeOfVehicles typeOfVehicle) {
        String code;
        String stringDiscountPercent = matcher.group("discountPercent");
        double discountPercent = Double.parseDouble(stringDiscountPercent);
        MenuMassages massage;
        switch (typeOfVehicle) {
            case CAR:
                code = matcher.group("carCode");
                massage = ProgramController.checkSetVehicleDiscount(code, discountPercent, typeOfVehicle);
                if (massage.output.equals(MenuMassages.CAR_DOES_NOT_EXIST.output))
                    System.out.println(massage.output);
                else if (massage.output.equals(MenuMassages.INVALID_DISCOUNT.output))
                    System.out.println(massage.output);
                else
                    System.out.println(massage.output + " " + (int) Store.getCar(code).getPrice() + "$!");
                break;
            case MOTOR:
                code = matcher.group("motorCode");
                massage = ProgramController.checkSetVehicleDiscount(code, discountPercent, typeOfVehicle);
                if (massage.output.equals(MenuMassages.MOTOR_DOES_NOT_EXIST.output))
                    System.out.println(massage.output);
                else if (massage.output.equals(MenuMassages.INVALID_DISCOUNT.output))
                    System.out.println(massage.output);
                else
                    System.out.println(massage.output + " " + (int) Store.getMotorcycle(code).getPrice() + "$!");
                break;
            default:
                code = matcher.group("bikeCode");
                massage = ProgramController.checkSetVehicleDiscount(code, discountPercent, typeOfVehicle);
                if (massage.output.equals(MenuMassages.BIKE_DOES_NOT_EXIST.output))
                    System.out.println(massage.output);
                else if (massage.output.equals(MenuMassages.INVALID_DISCOUNT.output))
                    System.out.println(massage.output);
                else
                    System.out.println(massage.output + " " + (int) Store.getBike(code).getPrice() + "$!");
                break;
        }
    }

    // SearchCars Color <CarColor>
    public static void searchVehiclesByColor(Matcher matcher, TypeOfVehicles typeOfVehicle) {
        String color = matcher.group("color");
        switch (typeOfVehicle) {
            case CAR:
                if (Store.getCarsByColor(color) == null)
                    System.out.println(MenuMassages.CAR_DOES_NOT_EXIST_BY_COLOR.output);
                else {
                    for (Car car : Store.getCarsByColor(color)) {
                        System.out.println(car.getName() + " " + car.getCode());
                    }
                }
                break;

            default:
                if (Store.getMotorsByColor(color) == null)
                    System.out.println(MenuMassages.MOTOR_DOES_NOT_EXIST_BY_COLOR.output);
                else {
                    for (Motorcycle motorcycle : Store.getMotorsByColor(color)) {
                        System.out.println(motorcycle.getName() + " " + motorcycle.getCode());
                    }
                }
                break;
        }
    }

    public static void searchBikesByType(Matcher matcher) {
        String bikeType = matcher.group("bikeType");
        if (Store.getBikesByType(bikeType) == null)
            System.out.println(MenuMassages.BIKE_DOES_NOT_EXIST_BY_TYPE.output);
        else {
            for (Bike bike : Store.getBikesByType(bikeType)) {
                System.out.println(bike.getName() + " " + bike.getCode());
            }
        }
    }

    public static void searchVehiclesByOrigin(Matcher matcher, TypeOfVehicles typeOfVehicle) {
        String origin = matcher.group("origin");
        switch (typeOfVehicle) {
            case CAR:
                if (Store.getCarsByOrigin(origin) == null)
                    System.out.println(MenuMassages.CAR_DOES_NOT_EXIST_BY_ORIGIN.output);
                else {
                    for (Car car : Store.getCarsByOrigin(origin)) {
                        System.out.println(car.getName() + " " + car.getCode());
                    }
                }
                break;
            case MOTOR:
                if (Store.getMotorsByOrigin(origin) == null)
                    System.out.println(MenuMassages.MOTOR_DOES_NOT_EXIST_BY_ORIGIN.output);
                else {
                    for (Motorcycle motorcycle : Store.getMotorsByOrigin(origin)) {
                        System.out.println(motorcycle.getName() + " " + motorcycle.getCode());
                    }
                }
                break;
            default:
                if (Store.getBikeByOrigin(origin) == null)
                    System.out.println(MenuMassages.BIKE_DOES_NOT_EXIST_BY_ORIGIN.output);
                else {
                    for (Bike bike : Store.getBikeByOrigin(origin)) {
                        System.out.println(bike.getName() + " " + bike.getCode());
                    }
                }
                break;
        }
    }

    public static void showVehicle(Matcher matcher, TypeOfVehicles typeOfVehicle) {
        String code = matcher.group("code");
        switch (typeOfVehicle) {
            case CAR:
                if (!ProgramController.checkCodeIsInStore(code, typeOfVehicle))
                    System.out.println(MenuMassages.CAR_DOES_NOT_EXIST.output);
                else {
                    Car car = Store.getCar(code);
                    System.out.println("CarBrand: " + car.getBrand());
                    System.out.println("CarName: " + car.getName());
                    System.out.println("CarColor: " + car.getColor());
                    System.out.println("CarOrigin: " + car.getOrigin());
                }
                break;
            case MOTOR:
                if (!ProgramController.checkCodeIsInStore(code, typeOfVehicle))
                    System.out.println(MenuMassages.MOTOR_DOES_NOT_EXIST.output);
                else {
                    Motorcycle motorcycle = Store.getMotorcycle(code);
                    System.out.println("MotorcycleBrand: " + motorcycle.getBrand());
                    System.out.println("MotorcycleName: " + motorcycle.getName());
                    System.out.println("MotorcycleColor: " + motorcycle.getColor());
                    System.out.println("MotorcycleOrigin: " + motorcycle.getOrigin());
                }
                break;
            default:
                if (!ProgramController.checkCodeIsInStore(code, typeOfVehicle))
                    System.out.println(MenuMassages.BIKE_DOES_NOT_EXIST.output);
                else {
                    Bike bike = Store.getBike(code);
                    System.out.println("BikeBrand: " + bike.getBrand());
                    System.out.println("BikeName: " + bike.getName());
                    System.out.println("BikeColor: " + bike.getColor());
                    System.out.println("BikeOrigin: " + bike.getOrigin());
                }
                break;
        }
    }

    public static String parse(double num) {
        if ((int) num == num)
            return Integer.toString((int) num);
        return String.valueOf(num);
    }

    public static void showVehicleWithLeastPrice(Matcher matcher, TypeOfVehicles typeOfVehicle) {
        switch (typeOfVehicle) {
            case CAR:
                Car carWithLeastPrice = Store.leastCarPrice();
                System.out.println(carWithLeastPrice.getName() + " " + carWithLeastPrice.getCode() + " "
                        + (int) carWithLeastPrice.getPrice());
                break;
            case MOTOR:
                Motorcycle motorWithLeastPrice = Store.leastMotorPrice();
                System.out.println(motorWithLeastPrice.getName() + " " + motorWithLeastPrice.getCode() + " "
                        + (int) motorWithLeastPrice.getPrice());
                break;
            default:
                Bike bikeWithLeastPrice = Store.leastBikePrice();
                System.out.println(bikeWithLeastPrice.getName() + " " + bikeWithLeastPrice.getCode() + " "
                        + (int) bikeWithLeastPrice.getPrice());
                break;
        }
    }
}
