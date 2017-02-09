package day1.lombokExamples;

import lombok.experimental.Delegate;

import java.util.List;

/**
 * Created by Evegeny on 08/02/2017.
 */
public class Manager {
    @Delegate
    private Employee employee;


    private List<Employee> employees;
}
