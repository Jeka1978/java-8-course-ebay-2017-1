package day2.collectExample;

import lombok.AllArgsConstructor;

import java.util.Arrays;

/**
 * Created by Evegeny on 09/02/2017.
 */
public enum Grade {
    JUNIOR(0,14000),MIDDLE(14001,21000),SENIOR(21001,30000);

    private final int min;
    private final int max;

    Grade(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public static Grade findBySalary(int salary) {
        Grade[] grades = values();
        for (Grade grade : grades) {
            if (grade.min < salary && salary < grade.max) {
                return grade;
            }
        }
        throw new RuntimeException("no such salary!!!");
    }


    public static Grade findWithoutIf(int salary) {
        return Arrays.stream(values()).filter(grade -> grade.min < salary && salary < grade.max).findFirst().get();
    }

}




























