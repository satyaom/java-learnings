package learning;

import learning.interface_learning.Car;
import learning.interface_learning.Vehicle;
import learning.static_and_final_with_inheritance.Parent;
import learning.super_and_this.ChildClass;
import learning.static_and_final_with_inheritance.Child;

class Test {
  public static void main(String[] args) {
//    interface_learning();
//    static_and_final_with_inheritance();
//    super_and_this();
  }

  static void interface_learning() {
    Vehicle v = new Car();
    v.engine();
    v.message();
    System.out.println(v.t);
  }

  static void static_and_final_with_inheritance() {
    Child ch = new Child();
    System.out.println(ch.tt);
    ch.say();
    // parent can hold child instance
    Parent c = new Child();
    c.say();
  }

  static void super_and_this() {
    ChildClass ch = new ChildClass("hey", 35);
    System.out.println(ch.age +" "+ ch.name);
    ch.superPrintInfo();

    ChildClass ch1 = new ChildClass();
    System.out.println(ch1.age +" "+ ch1.name);
  }
}