package view.Massages;

public enum MenuMassages {

    SUCCESS("not importatn"),
    CAR_EXISTS("Car with this code already exists!"),
    MOTOR_EXISTS("Motorcycle with this code already exists!"),
    BIKE_EXISTS("Bike with this code already exists!"),
    CAR_ADDED("Car was added successfully!"),
    MOTOR_ADDED("Motorcycle was added successfully!"),
    BIKE_ADDED("Bike was added successfully!"),
    CAR_DOES_NOT_EXIST("No cars exist with the given code!"),
    MOTOR_DOES_NOT_EXIST("No motorcycles exist with the given code!"),
    BIKE_DOES_NOT_EXIST("No bikes exist with the given code!"),
    INVALID_CAR_STRENGHT("CarStrength is invalid!"),
    INVALID_MOTOR_STRENGHT("MotorcycleStrength is invalid!"),
    INVALID_WHEEL_SIZE("WheelSize is invalid!"),
    INVALID_DISCOUNT("Input for discount is invalid!"),
    CAR_DOES_NOT_EXIST_BY_COLOR("No cars found with the given color!"),
    CAR_DOES_NOT_EXIST_BY_ORIGIN("No cars found with the given origin!"),
    MOTOR_DOES_NOT_EXIST_BY_COLOR("No motorcycles found with the given color!"),
    MOTOR_DOES_NOT_EXIST_BY_ORIGIN("No motorcycles found with the given origin!"),
    BIKE_DOES_NOT_EXIST_BY_TYPE("No bikes found with the given type!"),
    BIKE_DOES_NOT_EXIST_BY_ORIGIN("No bikes found with the given origin!"),
    CAR_COLOR_IS("CarColor is"),
    MOTOR_COLOR_IS("MotorcycleColor is"),
    BIKE_COLOR_IS("BikeColor is"),
    CAR_ORIGIN_IS("CarOrigin is"),
    MOTOR_ORIGIN_IS("MotorcycleOrigin is"),
    BIKE_ORIGIN_IS("BikeOrigin is"),
    CAR_STRENGTH_IS("CarStrength is"),
    MOTOR_STRENGTH_IS("MotorcycleStrength is"),
    CAR_SPEED_IS("CarSpeed is"),
    MOTOR_SPEED_IS("MotorcycleSpeed is"),
    BIKE_WEGHT_IS("BikeWeight is"),
    BIKE_WHEELSIZE_IS("WheelSize is"),
    CAR_PRICE_IS("CarPrice is"),
    MOTOR_PRICE_IS("MotorcyclePrice is"),
    BIKE_PRICE_IS("BikePrice is"),
    INVALID_INPUT("Input is invalid!"),
    CAR_STATE_IS("CarState is"),
    MOTOR_STATE_IS("MotorcycleState is"),
    BIKE_STATE_IS("BikeState is"),
    CAR_PRICE_AFTER_DISCOUNT("New carPrice is"),
    MOTOR_PRICE_AFTER_DISCOUNT("New motorcyclePrice is"),
    BIKE_PRICE_AFTER_DISCOUNT("New bikePrice is");

    public String output;

    // Constructor
    MenuMassages(String output) {
        this.output = output;
    }
}
