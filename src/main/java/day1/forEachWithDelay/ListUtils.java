package day1.forEachWithDelay;

import lombok.SneakyThrows;

import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Evegeny on 08/02/2017.
 */
public interface ListUtils {
    @SneakyThrows
     static <T> void forEachWithDelay(List<T> list, int delay, Consumer<T> consumer) {
         for (T t : list) {
             consumer.accept(t);
             Thread.sleep(delay);
         }
    }
}
