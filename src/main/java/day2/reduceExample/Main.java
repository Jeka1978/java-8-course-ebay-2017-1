package day2.reduceExample;

import day1.mapExercise.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by Evegeny on 09/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("Jeka"), new Employee("Igor"), new Employee("Amir"), new Employee("Inbal"));
        Optional<String> longNameOptional = employees.stream().map(Employee::getName).reduce((s, s2) -> s + "," + s2);
        if (longNameOptional.isPresent()) {
            System.out.println(longNameOptional.get());
        }
    }
}
