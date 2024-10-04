package learning.lld.strategy_pattern;

import learning.lld.strategy_pattern.strategy.SportDriveStrategy;

public class SportVehicle extends Vehicle {

    // Just passing the instance of strategy can set
    public SportVehicle() {
        super(new SportDriveStrategy());
    }
}
