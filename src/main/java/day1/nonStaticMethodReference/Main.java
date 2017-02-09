package day1.nonStaticMethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Evegeny on 08/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person(22), new Person(12));
        Stream<Person> personStream = persons.parallelStream().filter(Person::isAdult).sequential();
        personStream.forEach(person -> person.setAge(100));

        personStream.unordered().forEach(System.out::println);

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
        IntStream intStream = IntStream.of(1, 2, 3);

        System.out.println("*************");
        System.out.println(persons);
    }
}
