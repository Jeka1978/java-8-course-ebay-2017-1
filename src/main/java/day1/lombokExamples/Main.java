package day1.lombokExamples;

/**
 * Created by Evegeny on 08/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        Employee employee =
                Employee.builder().name("Amir").bonus(1000).salary(30000).beer("GoldStar")
                        .beer("Shendi").build();
        System.out.println(employee);
        employee.setName("Jeka");
        employee.setName("Jeka");


    }
}
