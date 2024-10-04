package learning.lld.strategy_pattern.strategy;

public class SportDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Sport Drive capability");
    }
}
