package day2.reduceExample;

import day1.mapExercise.Employee;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Evegeny on 09/02/2017.
 */
public class EmplService {
    public List<String> getUppercaseNamesSortedByLength(List<Employee> employees) {
        employees.stream().map(Employee::getName).filter(s -> s.equals(s.toUpperCase()))
                .sorted((s1, s2) -> s1.length()-s2.length()).peek(System.out::println).count();
        return null;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("JEKA123"), new Employee("IGOR2"), new Employee("AMIR"), new Employee("Inbal"));
        new EmplService().getUppercaseNamesSortedByLength(employees);
    }
}
