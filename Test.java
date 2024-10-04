package learning;

import learning.core_concepts.regex.interface_learning.Car;
import learning.core_concepts.regex.interface_learning.Vehicle;
import learning.core_concepts.regex.static_and_final_with_inheritance.Parent;
import learning.core_concepts.regex.super_and_this.ChildClass;
import learning.core_concepts.regex.static_and_final_with_inheritance.Child;
import learning.lld.observer_pattern.observable.IphoneObservableImpl;
import learning.lld.observer_pattern.observable.StockObservable;
import learning.lld.observer_pattern.observer.EmailAlertObserver;
import learning.lld.observer_pattern.observer.MobileAlertObserver;
import learning.lld.observer_pattern.observer.NotificationAlertObserver;
import learning.lld.strategy_pattern.NormalVehicle;
import learning.lld.strategy_pattern.OffRoadVehicle;

import static learning.core_concepts.regex.RegexMatcher.wrapLink;

class Test {
  public static void main(String[] args) {
//    lldObserverPattern();
//    lldStrategyPattern();
//    regex();
//    interface_learning();
//    static_and_final_with_inheritance();
//    super_and_this();
  }

  static void lldObserverPattern() {
    StockObservable iphoneObserver = new IphoneObservableImpl();

    NotificationAlertObserver n1 = new EmailAlertObserver("xyz@gmail.com", iphoneObserver);
    NotificationAlertObserver n2 = new MobileAlertObserver("yo123", iphoneObserver);

    iphoneObserver.add(n1);
    iphoneObserver.add(n2);

    iphoneObserver.setStockCount(10);

  }

  static void lldStrategyPattern() {
    OffRoadVehicle ov = new OffRoadVehicle();
    ov.drive();

    NormalVehicle nv = new NormalVehicle();
    nv.drive();
  }

  static void regex() {
    String body = "<p>Hi Team</p>\n" +
            "\n" +
            "<p>https://www.google.com/</p>\n" +
            "\n" +
            "<p><a href=\"https://www.google.com/\">google.com</a></p>\n";
    String outputText = wrapLink(body);
    System.out.println(outputText);
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