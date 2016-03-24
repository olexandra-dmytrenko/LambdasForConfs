package lambdas.functionalInterface;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.testng.Assert.*;

/**
 * Created by olexandra on 3/24/16.
 */
public class MyPredicateTest {
    MyPredicate p = new MyPredicate();
    List<Integer> values = Arrays.asList(1, 2, 5, 4, 6, 5, 4, 3, 8);

    @Test
    public void testIsGreaterThan2Func() throws Exception {
        boolean actual = p.isGreaterThan2Func().test(4);
        assertTrue(actual);
    }

    @Test
    public void testIsGreaterThan2FuncArray() throws Exception {
        List<Integer> actual = values.stream().filter(p.isGreaterThan2Func()).collect(Collectors.toList());
        assertEquals(actual, Arrays.asList(5, 4, 6, 5, 4, 3, 8));
    }

    @Test
    public void testIsGreaterThan2() throws Exception {
        boolean actual = p.isGreaterThan2(4);
        assertTrue(actual);
    }

    @Test
    public void testIsGreaterThan2Array() throws Exception {
        List<Integer> actual = values.stream().filter(v -> p.isGreaterThan2(v)).collect(Collectors.toList());
        assertEquals(actual, Arrays.asList(5, 4, 6, 5, 4, 3, 8));
    }

    @Test
    public void testIsGreaterThanFunc() throws Exception {
        boolean actual = p.isGreaterThanFunc().test(4, 8);
        assertFalse(actual);
    }

    @Test
    public void testIsGreaterThan() throws Exception {
        boolean actual = p.isGreaterThan(4, 8);
        assertFalse(actual);
    }
}