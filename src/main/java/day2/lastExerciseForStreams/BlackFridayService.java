package day2.lastExerciseForStreams;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.time.DayOfWeek.FRIDAY;

/**
 * Created by Evegeny on 09/02/2017.
 */
public class BlackFridayService {
    public static void printF13(int year1, int year2) {
        LocalDate start = LocalDate.of(year1, 1, 13);
        LocalDate end = LocalDate.of(year2, 12, 13);
        long numOfMonth = ChronoUnit.MONTHS.between(start, end);
        Map<Integer, Long> map = Stream.iterate(start, localDate -> localDate.plusMonths(1)).limit(numOfMonth).
                filter(localDate -> localDate.getDayOfWeek() == FRIDAY)
                .collect(Collectors.groupingBy(LocalDate::getYear, Collectors.counting()));
        map.entrySet().stream().sorted(Map.Entry.<Integer,Long> comparingByValue().reversed())
                .forEach(System.out::println);

    }

    public static void main(String[] args) {
        printF13(2000,2017);

    }
}
