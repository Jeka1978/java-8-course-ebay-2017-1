package day2.riddle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Evegeny on 09/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("Arnold", "Silvester", "Chuck Norris", "Bruc"));
        String remove = "Chuck Norris";

        strings.removeIf(s -> s.equals(remove));

        System.out.println(strings);
    }
}
