package lambdas;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by olexandra on 3/22/16.
 */
public class PrimeNumberTest {

    public PrimeNumber primeNumber = new PrimeNumber();

    @DataProvider(parallel = true, name = "checkNumbers")
    public Object[][] dataProviderMethod() {
        return new Object[][]{{-1, false}, {0, true}, {1, true}, {2, true}, {3, true}, {4, false}, {5, true}, {6, false}, {7, true}, {8, false}};
    }

    @Test(dataProvider = "checkNumbers")
    public void testIsPrimeImperative(int number, boolean expected) {
        boolean actual = primeNumber.isPrimeImperative(number);
        assertEquals(actual, expected);
    }

    @Test(dataProvider = "checkNumbers", enabled = false)
    public void isPrimeDeclarative(int number, boolean expected) {
        boolean actual = primeNumber.isPrimeDeclarative(number);
        assertEquals(actual, expected);
    }

    @Test(dataProvider = "checkNumbers")
    public void isPrimeDeclarativeNegative(int number, boolean expected) {
        boolean actual = primeNumber.isPrimeDeclarativeNegativeNumbCheck(number);
        assertEquals(actual, expected);
    }
}