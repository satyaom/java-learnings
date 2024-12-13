package learning.core_concepts.streamapi;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class StreamApi {

    public static void api() {

        //Sorting by marks
        Map<String, Integer> mp = new HashMap<>();
        mp.put("add", 8);
        mp.put("bob", 10);
        mp.put("turn", 100);

        class Employee {
            Integer salary;
            String name;
            Employee(int s, String n) {
                this.salary = s;
                this.name = n;
            }

            String getName() {
                return this.name;
            }

            Integer getSalary() {
                return this.salary;
            }

            public int compareTo(Employee o) {
                if(this.salary > o.salary) return 1;
                else if(this.salary < o.salary) return -1;
                return 0;
            }
        }

        List<Employee> ep = new ArrayList<>();
        ep.add(new Employee(23, "df"));
        ep.add(new Employee(34, "dfd"));
        ep.add(new Employee(34, "dfd"));

        List<Map.Entry<String, Integer>> ce = mp.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());

        Set<Object> ee2 = ep.stream()
                .sorted(Employee::compareTo)
                .map(Employee::getSalary)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(ee2);

        Set<List<Object>> ee1 = ep.stream()
                .sorted(Employee::compareTo)
                .map(e -> {
                    List<Object> emp = new ArrayList<>();
                    emp.add(e.salary);
                    emp.add(e.name);
                    return emp;
                })
                .collect(Collectors.toSet()); //Hashset not maintains order
        System.out.println(ee1);

        //Can convert to custom type
        Set<List<Object>> ee = ep.stream()
                .sorted(Employee::compareTo)
                .map(e -> {
                    List<Object> emp = new ArrayList<>();
                    emp.add(e.salary);
                    emp.add(e.name);
                    return emp;
                })
                .collect(Collectors.toCollection(LinkedHashSet::new)); //LinkedHashSet maintains order
        System.out.println(ee);

        List<List<Integer>> mat = new ArrayList<>();
        mat.add(Arrays.asList(1, 2, 3));
        mat.add(Arrays.asList(4, 5, 6));
        mat.add(Arrays.asList(6, 8, 9));
        List<Integer> ar = mat.stream().
                flatMap(Collection::stream).
                filter(a -> a > 5).
                distinct().
                skip(1).
                limit(2).
                toList();
        Optional<Integer> i = ar.stream().reduce((a, b) -> a*b);
        boolean t = ar.stream().noneMatch(a -> a > 8);
        boolean y = ar.stream().anyMatch(a -> a > 8);
        Optional<Integer> o = ar.stream().filter(a-> a>8).findAny();
        System.out.println(o);
        System.out.println(t);
        System.out.println(i);
    }
}
