package day1;

import java.util.List;

/**
 * Created by Evegeny on 08/02/2017.
 */
public class DuplicateService {
    public <T> int countDuplicates(T t, List<T> list, Equalator<T> equalator) {
        int couunter=0;
        for (T t1 : list) {
            if (equalator.equals(t,t1)) {
                couunter++;
            }
        }
        return couunter;
    }
}
