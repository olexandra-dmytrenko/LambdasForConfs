package lambdas.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by olexandra on 3/24/16.
 */
public class MyFunction {

    /////////////////Functions///////////////////
    public Function<Integer, Integer> multiplyFuncBy2() {
        return (a) -> a * 2;
    }

    public Integer multiplyBy2(Integer a) {
        return a * 2;
    }

    public BiFunction<Integer, Integer, Integer> multiplyFuncBy() {
        return (a, b) -> a * b;
    }

    public Integer multiplyBy(Integer a, Integer b) {
        return a * b;
    }
}
