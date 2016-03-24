package lambdas.functionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Created by olexandra on 3/24/16.
 */
public class MyPredicate {

    //////////////Predicates////////////////
    //always returns boolean but takes anything
    public Predicate<Integer> isGreaterThan2Func() {
        return a -> a > 2;
    }

    public boolean isGreaterThan2(Integer a) {
        return a > 2;
    }

    //always returns boolean but takes anything
    public BiPredicate<Integer, Integer> isGreaterThanFunc() {
        return (a, b) -> a > b;
    }

    public boolean isGreaterThan(Integer a, Integer b) {
        return a > b;
    }
}
