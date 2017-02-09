package day1.nonStaticMethodReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by Evegeny on 08/02/2017.
 */
@AllArgsConstructor
@ToString
public class Person {
    @Getter
    @Setter
    private int age;

    public boolean isAdult(){
        return age > 18;
    }
}
