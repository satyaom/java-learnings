package learning.interface_learning;

public class Car implements Vehicle {

    // t is already bind with Vehicle class as final, cannot be reinitialized
    public static int t = 36;

    @Override
    public void engine() {
        System.out.println("Vehicle");
    }
}
