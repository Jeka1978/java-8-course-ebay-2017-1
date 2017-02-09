package day1.multipleInharitanceProblem;

/**
 * Created by Evegeny on 08/02/2017.
 */
public interface GrandFather {
    default void talk(){
        System.out.println("иди сюда");
    }
}
