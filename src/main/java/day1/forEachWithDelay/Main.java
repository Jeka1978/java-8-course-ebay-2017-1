package day1.forEachWithDelay;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Evegeny on 08/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Scala", "Groovy","JAVA","java");

        ListUtils.forEachWithDelay(strings,590,s-> System.out.println(s));
    }
}
