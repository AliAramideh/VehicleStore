package view.Commands;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum MenuCommands {

    END("\\s*end\\s*"),
    // addCar <CarName> <CarBrand> <CarCode>
    ADD_CAR("\\s*addCar\\s+(?<carName>\\w+)\\s+(?<carBrand>\\w+)\\s+(?<carCode>\\w+)\\s*"),
    // addMotorcycle <MotorcycleName> <MotorcycleBrand> <MotorcycleCode>
    ADD_MOTOR("\\s*addMotorcycle\\s+(?<motorName>\\w+)\\s+(?<motorBrand>\\w+)\\s+(?<motorCode>\\w+)\\s*"),
    // addBike <BikeName> <BikeBrand> <BikeCode> <BikeType>
    ADD_BIKE("\\s*addBike\\s+(?<bikeName>\\w+)\\s+(?<bikeBrand>\\w+)\\s+(?<bikeCode>\\w+)\\s+(?<bikeType>\\w+)\\s*"),
    // SetCarColor <CarCode> <CarColor>
    SET_CAR_COLOR("\\s*SetCarColor\\s+(?<carCode>\\w+)\\s+(?<carColor>\\w+)\\s*"),
    // SetMotorcycleColor <MotorcycleCode> <MotorcycleColor>
    SET_MOTOR_COLOR("\\s*SetMotorcycleColor\\s+(?<motorCode>\\w+)\\s+(?<motorColor>\\w+)\\s*"),
    // SetBikeColor <BikeCode> <BikeColor>
    SET_BIKE_COLOR("\\s*SetBikeColor\\s+(?<bikeCode>\\w+)\\s+(?<bikeColor>\\w+)\\s*"),
    // SetCarOrigin <CarCode> <CarOrigin>
    SET_CAR_ORIGIN("\\s*SetCarOrigin\\s+(?<carCode>\\w+)\\s+(?<carOrigin>\\w+)\\s*"),
    // SetMotorcycleOrigin <MotorcycleCode> <MotorcycleOrigin>
    SET_MOTOR_ORIGIN("\\s*SetMotorcycleOrigin\\s+(?<motorCode>\\w+)\\s+(?<motorOrigin>\\w+)\\s*"),
    // SetBikeOrigin <BikeCode> <BikeOrigin>
    SET_BIKE_ORIGIN("\\s*SetBikeOrigin\\s+(?<bikeCode>\\w+)\\s+(?<bikeOrigin>\\w+)\\s*"),
    // SetCarStrength <CarCode> <CarStrength>
    SET_CAR_STRENGTH("\\s*SetCarStrength\\s+(?<carCode>\\w+)\\s+(?<carStrength>[\\d.]+)\\s*"),
    // SetMotorcycleStrength <MotorcycleCode> <MotorcycleStrength>
    SET_MOTOR_STRENGTH("\\s*SetMotorcycleStrength\\s+(?<motorCode>\\w+)\\s+(?<motorStrength>[\\d.]+)\\s*"),
    // SetCarSpeed <CarCode> <CarSpeed>
    SET_CAR_SPEED("\\s*SetCarSpeed\\s+(?<carCode>\\w+)\\s+(?<carSpeed>[\\d.]+)\\s*"),
    // SetMotorcycleSpeed <MotorcycleCode> <MotorcycleSpeed>
    SET_MOTOR_SPEED("\\s*SetMotorcycleSpeed\\s+(?<motorCode>\\w+)\\s+(?<motorSpeed>[\\w.]+)\\s*"),
    // SetBikeWeight <BikeCode> <BikeWeight>
    SET_BIKE_WEIGHT("\\s*SetBikeWeight\\s+(?<bikeCode>\\w+)\\s+(?<bikeWeight>[\\d.]+)\\s*"),
    // SetWheelSize <BikeCode> <WheelSize>
    SET_BIKE_WHEELSIZE("\\s*SetWheelSize\\s+(?<bikeCode>\\w+)\\s+(?<bikeWheelSize>[\\w.]+)\\s*"),
    // SetCarPrice <CarCode> <CarPrice>
    SET_CAR_PRICE("\\s*SetCarPrice\\s+(?<carCode>\\w+)\\s+(?<carPrice>[\\w.]+)\\s*"),
    // SetMotorcyclePrice <MotorcycleCode> <MotorcyclePrice>
    SET_MOTOR_PRICE("\\s*SetMotorcyclePrice\\s+(?<motorCode>\\w+)\\s+(?<motorPrice>[\\w.]+)\\s*"),
    // SetBikePrice <BikeCode> <BikePrice>
    SET_BIKE_PRICE("\\s*SetBikePrice\\s+(?<bikeCode>\\w+)\\s+(?<bikePrice>[\\w.]+)\\s*"),
    // SetCarState <CarCode> <CarState>
    SET_CAR_STATE("\\s*SetCarState\\s+(?<carCode>\\w+)\\s+(?<carState>(sold)|(unsold))\\s*"),
    SET_MOTOR_STATE("\\s*SetMotorcycleState\\s+(?<motorCode>\\w+)\\s+(?<motorState>(sold)|(unsold))\\s*"),
    SET_BIKE_STATE("\\s*SetBikeState\\s+(?<bikeCode>\\w+)\\s+(?<bikeState>(sold)|(unsold))\\s*"),
    // CompareCars <CarCode1> <CarCode2>
    COMPARE_CARS("\\s*CompareCars\\s+(?<carCode1>\\w+)\\s+(?<carCode2>\\w+)\\s*"),
    COMPARE_MOTORCYCLES("\\s*CompareMotorcycles\\s+(?<motorCode1>\\w+)\\s+(?<motorCode2>\\w+)\\s*"),
    COMPARE_BIKES("\\s*CompareBikes\\s+(?<bikeCode1>\\w+)\\s+(?<bikeCode2>\\w+)\\s*"),
    // SetCarDiscount <CarCode> <Discountpercent>
    SET_CAR_DISCOUNT("\\s*SetCarDiscount\\s+(?<carCode>\\w+)\\s+(?<discountPercent>[\\w.]+)\\s*"),
    SET_MOTOR_DISCOUNT("\\s*SetMotorcycleDiscount\\s+(?<motorCode>\\w+)\\s+(?<discountPercent>[\\w.]+)\\s*"),
    SET_BIKE_DISCOUNT("\\s*SetBikeDiscount\\s+(?<bikeCode>\\w+)\\s+(?<discountPercent>[\\w.]+)\\s*"),
    // SearchCars Color <CarColor>
    SEARCH_CARS_BY_COLOR("\\s*SearchCars\\s+Color\\s+(?<color>\\w+)\\s*"),
    SEARCH_MOTORS_BY_COLOR("\\s*SearchMotorcycles\\s+Color\\s+(?<color>\\w+)\\s*"),
    // SearchBikes Type <BikeType>
    SEARCH_BIKES_BY_TYPE("\\s*SearchBikes\\s+Type\\s+(?<bikeType>\\w+)\\s*"),
    // SearchCars Origin <CarOrigin>
    SEARCH_CARS_BY_ORIGIN("\\s*SearchCars\\s+Origin\\s+(?<origin>\\w+)\\s*"),
    SEARCH_MOTORS_BY_ORIGIN("\\s*SearchMotorcycles\\s+Origin\\s+(?<origin>\\w+)\\s*"),
    SEARCH_BIKES_BY_ORIGIN("\\s*SearchBikes\\s+Origin\\s+(?<origin>\\w+)\\s*"),
    // LeastMotorcyclePrice
    LEAST_CAR_PRICE("\\s*LeastCarPrice\\s*"),
    LEAST_MOTOR_PRICE("\\s*LeastMotorcyclePrice\\s*"),
    LEAST_BIKE_PRICE("\\s*LeastBikePrice\\s*"),
    // Show MotorcycleProperties <MotorcycleCode>
    CAR_PROPERTIES("\\s*Show\\s+CarProperties\\s+(?<code>\\w+)\\s*"),
    MOTOR_PROPERTIES("\\s*Show\\s+MotorcycleProperties\\s+(?<code>\\w+)\\s*"),
    BIKE_PROPERTIES("\\s*Show\\s+BikeProperties\\s+(?<code>\\w+)\\s*");

    public String regex;

    // Constructor
    MenuCommands(String regex) {
        this.regex = regex;
    }

    public static Matcher getMatcher(String input, MenuCommands desiredCommand) {
        Matcher matcher = Pattern.compile(desiredCommand.regex).matcher(input);
        if (matcher.matches())
            return matcher;
        return null;
    }
}
