package lambdas;

import java.util.stream.IntStream;

/**
 * Created by olexandra on 3/22/16.
 */
public class PrimeNumber {

    /**
     * Imperative - how we do it
     * is mutable
     */

    public boolean isPrimeImperative(int number) {
        if (number < 0) {
            return false;
        }
        for (int curNumb = 2; curNumb <= number / 2; curNumb++) {
            if (number % curNumb == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Declarative - what we do
     * is immutable
     */
    public boolean isPrimeDeclarative(final int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(curNumb -> number % curNumb == 0);
    }

    /**
     * Declarative - what we do
     * is immutable
     */
    public boolean isPrimeDeclarativeNegativeNumbCheck(final int number) {
        return number >= 0 && IntStream.rangeClosed(2, number / 2).noneMatch(curNumb -> number % curNumb == 0);
    }
}
