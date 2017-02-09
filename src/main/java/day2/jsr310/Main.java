package day2.jsr310;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Created by Evegeny on 09/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime myBirthday = LocalDateTime.of(1978, 10, 3, 10, 0, 0);
        long between = ChronoUnit.HOURS.between(myBirthday, now);
        System.out.println("between = " + between);
    }
}
