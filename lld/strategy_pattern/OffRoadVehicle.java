package learning.lld.strategy_pattern;

import learning.lld.strategy_pattern.strategy.SportDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        super(new SportDriveStrategy());
    }
}
