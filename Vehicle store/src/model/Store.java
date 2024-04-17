package model;

import java.util.ArrayList;

public class Store {

    private static ArrayList<Car> cars;
    private static ArrayList<Motorcycle> motorcycles;
    private static ArrayList<Bike> bikes;

    static {
        cars = new ArrayList<>();
        motorcycles = new ArrayList<>();
        bikes = new ArrayList<>();
    }

    // Methods
    public static void addCar(Car car) {
        cars.add(car);
    }

    public static void addMotor(Motorcycle motorcycle) {
        motorcycles.add(motorcycle);
    }

    public static void addBike(Bike bike) {
        bikes.add(bike);
    }

    public static void removeCar(Car car) {
        cars.remove(car);
    }

    public static void removeMotorcycle(Motorcycle motorcycle) {
        motorcycles.remove(motorcycle);
    }

    public static void removeBike(Bike bike) {
        bikes.remove(bike);
    }

    public static Car getCar(String carCode) {
        if (cars.size() == 0)
            return null;
        for (Car car : cars) {
            if (car.getCode().equals(carCode))
                return car;
        }
        return null;
    }

    public static Motorcycle getMotorcycle(String motorCode) {
        if (motorcycles.size() == 0)
            return null;
        for (Motorcycle motorcycle : motorcycles) {
            if (motorcycle.getCode().equals(motorCode))
                return motorcycle;
        }
        return null;
    }

    public static Bike getBike(String bikeCode) {
        if (bikes.size() == 0)
            return null;
        for (Bike bike : bikes) {
            if (bike.getCode().equals(bikeCode))
                return bike;
        }
        return null;
    }

    public static ArrayList<Car> getCarsByColor(String color) {
        if (cars.size() == 0)
            return null;
        ArrayList<Car> carsWithSelectedColor = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor() != null) {
                if (car.getColor().equals(color))
                    carsWithSelectedColor.add(car);
            }
        }
        if (carsWithSelectedColor.size() == 0)
            return null;
        return carsWithSelectedColor;
    }

    public static ArrayList<Motorcycle> getMotorsByColor(String color) {
        if (motorcycles.size() == 0)
            return null;
        ArrayList<Motorcycle> motorsWithSelectedColor = new ArrayList<>();
        for (Motorcycle motorcycle : motorcycles) {
            if (motorcycle.getColor() != null) {
                if (motorcycle.getColor().equals(color))
                    motorsWithSelectedColor.add(motorcycle);
            }
        }
        if (motorsWithSelectedColor.size() == 0)
            return null;
        return motorsWithSelectedColor;
    }

    public static ArrayList<Bike> getBikesByType(String bikeType) {
        if (bikes.size() == 0)
            return null;
        ArrayList<Bike> bikesWithSelectedType = new ArrayList<>();
        for (Bike bike : bikes) {
            if (bike.getBikeType() != null) {
                if (bike.getBikeType().equals(bikeType))
                    bikesWithSelectedType.add(bike);
            }
        }
        if (bikesWithSelectedType.size() == 0)
            return null;
        return bikesWithSelectedType;
    }

    public static ArrayList<Car> getCarsByOrigin(String origin) {
        if (cars.size() == 0)
            return null;
        ArrayList<Car> carsWithSelectedOrigin = new ArrayList<>();
        for (Car car : cars) {
            if (car.getOrigin() != null) {
                if (car.getOrigin().equals(origin))
                    carsWithSelectedOrigin.add(car);
            }
        }
        if (carsWithSelectedOrigin.size() == 0)
            return null;
        return carsWithSelectedOrigin;
    }

    public static ArrayList<Motorcycle> getMotorsByOrigin(String origin) {
        if (motorcycles.size() == 0)
            return null;
        ArrayList<Motorcycle> motorsWithSelectedOrigin = new ArrayList<>();
        for (Motorcycle motorcycle : motorcycles) {
            if (motorcycle.getOrigin() != null) {
                if (motorcycle.getOrigin().equals(origin))
                    motorsWithSelectedOrigin.add(motorcycle);
            }
        }
        if (motorsWithSelectedOrigin.size() == 0)
            return null;
        return motorsWithSelectedOrigin;
    }

    public static ArrayList<Bike> getBikeByOrigin(String origin) {
        if (bikes.size() == 0)
            return null;
        ArrayList<Bike> bikesWithSelectedOrigin = new ArrayList<>();
        for (Bike bike : bikes) {
            if (bike.getOrigin() != null) {
                if (bike.getOrigin().equals(origin))
                    bikesWithSelectedOrigin.add(bike);
            }
        }
        if (bikesWithSelectedOrigin.size() == 0)
            return null;
        return bikesWithSelectedOrigin;
    }

    public static Car leastCarPrice() {
        if (cars.size() == 0)
            return null;
        double leastPrice = Double.POSITIVE_INFINITY;
        String leastPriceCodeCar = "0";
        for (Car car : cars) {
            if (car.getPrice() < leastPrice) {
                leastPrice = car.getPrice();
                leastPriceCodeCar = car.getCode();
            }
        }
        return Store.getCar(leastPriceCodeCar);
    }

    public static Motorcycle leastMotorPrice() {
        if (motorcycles.size() == 0)
            return null;
        double leastPrice = Double.POSITIVE_INFINITY;
        String leastPriceCodeMotor = "0";
        for (Motorcycle motorcycle : motorcycles) {
            if (motorcycle.getPrice() < leastPrice) {
                leastPrice = motorcycle.getPrice();
                leastPriceCodeMotor = motorcycle.getCode();
            }
        }
        return Store.getMotorcycle(leastPriceCodeMotor);
    }

    public static Bike leastBikePrice() {
        if (bikes.size() == 0)
            return null;
        double leastPrice = Double.POSITIVE_INFINITY;
        String leastPriceCodeBike = "0";
        for (Bike bike : bikes) {
            if (bike.getPrice() < leastPrice) {
                leastPrice = bike.getPrice();
                leastPriceCodeBike = bike.getCode();
            }
        }
        return Store.getBike(leastPriceCodeBike);
    }

    // getters
    public static ArrayList<Car> getCars() {
        return cars;
    }

    public static ArrayList<Motorcycle> getMotorcycles() {
        return motorcycles;
    }

    public static ArrayList<Bike> getBikes() {
        return bikes;
    }
}
