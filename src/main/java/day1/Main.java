package day1;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Evegeny on 08/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Scala", "Groovy","JAVA","java");
        strings.forEach(System.out::println);
        DuplicateService duplicateService = new DuplicateService();
        int counter = duplicateService.countDuplicates("java", strings, (String t1, String t2) -> t1.equalsIgnoreCase(t2));
        System.out.println("counter = " + counter);


        for (int i = 0; i < strings.size(); i++) {    //java 5
            String s = strings.get(i);
            System.out.println("s = " + s);
        }

        for (String string : strings) {
            System.out.println(string);   //java
        }

        strings.forEach(System.out::println);    //java 8


    }
}
