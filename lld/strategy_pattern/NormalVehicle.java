package learning.lld.strategy_pattern;

import learning.lld.strategy_pattern.strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle {
    public NormalVehicle() {
        super(new NormalDriveStrategy());
    }
}
