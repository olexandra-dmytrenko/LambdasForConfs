package lambdas.functionalInterface;

import org.testng.annotations.Test;

import java.util.stream.Stream;

/**
 * Created by olexandra on 3/25/16.
 */
public class MySupplierTest {

    MySupplier supplier = new MySupplier();

    @Test
    public void testUseSupplier() throws Exception {
        String actual = supplier.useSupplier();
        System.out.println(actual);
    }

    @Test
    public void testUseSupplierFunc() throws Exception {
        String actual = supplier.useSupplierFunc().get();
        System.out.println(actual);
    }

    @Test
    public void testUseSupplierStream() {
        Stream.of("1 ").forEach(n -> System.out.println(n + supplier.useSupplierFunc()));
    }
}