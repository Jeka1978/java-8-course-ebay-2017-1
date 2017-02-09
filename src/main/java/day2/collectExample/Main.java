package day2.collectExample;

import day1.mapExercise.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Evegeny on 09/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Jeka",1000), new Employee("Igor",2000),
                new Employee("Amir",40000), new Employee("Jeka",3000));
        Map<String, Integer> map =
                employees.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary,
                        (integer, integer2) -> integer+integer2));

        System.out.println(map);
    }
}
