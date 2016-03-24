package lambdas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.IntStream;

/**
 * Created by olexandra on 3/23/16.
 */
public class Factorial {
    public static Logger log = LoggerFactory.getLogger(Factorial.class);

    public static int factorialOf(int number) {
        if (number >= 0)
            return IntStream.rangeClosed(2, number)
                    //   .peek(currentN -> log.info("Current processed number is {}", currentN))
                    .reduce(1, (accumulatedResult, currentNumber) -> accumulatedResult * currentNumber);
        else throw new IllegalArgumentException("Factorial can be counted only of not negative numbers.");
    }

    public static int factorialThroughCycleOf(int number) {
        if (number >= 0) {
            int factorial = 1;
            for (int currentNumber = 2; currentNumber <= number; currentNumber++) {
                factorial = factorial * currentNumber;
            }
            return factorial;
        } else throw new IllegalArgumentException("Factorial can be counted only of not negative numbers.");
    }

    public static int factorialThroughRecursionOf(int number) {
        if (number > 0) return number * factorialThroughRecursionOf(number - 1);
        if (number == 0) return 1;
        else throw new IllegalArgumentException("Factorial can be counted only of not negative numbers.");
    }
}
