package day1.flatMapExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Evegeny on 08/02/2017.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("c:\\temp\\yest.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        Stream<String> lines = reader.lines();
        Stream<String> words = lines.map(String::toLowerCase).flatMap(line -> Arrays.stream(line.split("[^A-Za-z]+")));
        long count = words.filter(word -> word.equals("yesterday")).count();
        System.out.println("count = " + count);
    }
}
