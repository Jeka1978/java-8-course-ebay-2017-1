package day1.mapExercise;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Evegeny on 08/02/2017.
 */
public class EmployeeCalculator {
    public int totalSalary(List<Employee> employees) {


        return employees.parallelStream().mapToInt(Employee::getSalary).peek(System.out::println).sum();
    }
}
