package lambdas.functionalInterface;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

/**
 * Created by olexandra on 3/24/16.
 */
public class MyFunctionTest {
    List<Integer> values = Arrays.asList(1, 2, 5, 4, 6, 5, 4, 3, 8);
    MyFunction f = new MyFunction();

    @Test
    public void testMultiplyFuncBy2() throws Exception {
        int actual = f.multiplyFuncBy2().apply(5);
        assertEquals(actual, 10);
    }

    @Test
    public void testMultiplyFuncBy2Array() throws Exception {
        List<Integer> actual = values.stream().map(f.multiplyFuncBy2()).skip(2).limit(2).collect(Collectors.toList());
        assertEquals(actual, Arrays.asList(10, 8));
    }

    @Test
    public void testMultiplyBy2() throws Exception {
        int actual = f.multiplyBy2(5);
        assertEquals(actual, 10);
    }

    @Test
    public void testMultiplyFuncByArray() throws Exception {
        List<Integer> actual = values.stream().map(v -> f.multiplyFuncBy().apply(v, 3)).skip(2).limit(2).collect(Collectors.toList());
        assertEquals(actual, Arrays.asList(15, 12));
    }

    @Test
    public void testMultiplyFuncBy() throws Exception {
        int actual = f.multiplyFuncBy().apply(5, 3);
        assertEquals(actual, 15);
    }

    @Test
    public void testMultiplyBy() throws Exception {
        int actual = f.multiplyBy(5, 3);
        assertEquals(actual, 15);
    }

    @Test
    public void testProcess() throws Exception {

    }
}