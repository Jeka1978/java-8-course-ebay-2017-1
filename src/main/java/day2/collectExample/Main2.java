package day2.collectExample;

import day1.mapExercise.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Evegeny on 09/02/2017.
 */
public class Main2 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Jeka",1000), new Employee("Igor",23000),
                new Employee("Amir",22000), new Employee("Jeka",17000));



        Map<Grade, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(
                emp -> Grade.findWithoutIf(emp.getSalary())));
        System.out.println(map);

    }
}
