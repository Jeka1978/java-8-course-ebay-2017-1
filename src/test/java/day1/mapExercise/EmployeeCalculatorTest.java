package day1.mapExercise;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Evegeny on 08/02/2017.
 */
public class EmployeeCalculatorTest {
    @Test
    public void totalSalary() throws Exception {
        List<Employee> employees = Arrays.asList(new Employee(1000), new Employee(2000), new Employee(500));
        EmployeeCalculator employeeCalculator = new EmployeeCalculator();
        Assert.assertEquals(3500,employeeCalculator.totalSalary(employees));

    }

}