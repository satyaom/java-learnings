package learning.core_concepts.regex.static_and_final_with_inheritance;

public class Child extends Parent {

    // Hiding parent tt variable
    public static int tt = 99;


    // Method hiding
    @Override
    public void say() {
        System.out.println("child");
    }
}
