package day1.lombokExamples;

import lombok.*;

import java.util.List;

/**
 * Created by Evegeny on 08/02/2017.
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {


    protected void doXXXXXXXXXXXX(){}


    @NonNull
    private String name;
    private int salary;
    private int bonus;
    @Singular
    private List<String> beers;

    @Singular("oneFish")
    private List<String> fish;

}
