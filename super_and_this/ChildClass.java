package learning.super_and_this;
public class ChildClass extends SuperClass{
    public String name;
    public Integer age;

    public ChildClass() {
        // So that instance can be initialized without parameter
        this("Default", 455);
    }

    public ChildClass(String name, Integer age) {
        super("Super", 100000);
        /* this keyword important here to differentiate between
        instance object and local variable */
        this.name = name;
        this.age = age;
    }
}
