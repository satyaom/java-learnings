package learning.lld.strategy_pattern.strategy;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Normal dive capability");
    }
}
