package day1.mapExercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Evegeny on 08/02/2017.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    private String name;
    private int salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int salary) {
        this.salary = salary;
    }
}

