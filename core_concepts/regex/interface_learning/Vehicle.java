package learning.core_concepts.regex.interface_learning;

public interface Vehicle {
    // Variable only can be public static final
    int t = 3;

    // Introduced in java 9, can be static
    private void interUser() {
        System.out.println("for inter user");
    }

    // Support given from java 8, not necessary to override
    default void message() {
        System.out.println("Welcome to shop");
    }

    // Implicitly methods are public here
    void engine();
}
