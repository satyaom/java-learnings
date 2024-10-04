package learning.core_concepts.regex.super_and_this;

public class SuperClass {
    public String name;
    public Integer age;

    // Required for child class to initialize instance
    public SuperClass() {}

    // if you explicitly declare constructor then
    // compiler won't generate the default constructor
    SuperClass(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void superPrintInfo() {
        System.out.println(name + " " + age);
    }
}
