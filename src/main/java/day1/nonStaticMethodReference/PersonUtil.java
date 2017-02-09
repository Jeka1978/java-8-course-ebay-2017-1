package day1.nonStaticMethodReference;

/**
 * Created by Evegeny on 08/02/2017.
 */
public class PersonUtil {
    public boolean isAdult(Person person) {
        return person.getAge() > 18;
    }
}
