package lambdas.functionalInterface;

import java.util.function.Supplier;

/**
 * Created by olexandra on 3/24/16.
 */
public class MySupplier {
    public String useSupplier() {
        return Thread.currentThread().getStackTrace()[1].getMethodName();
    }

    public Supplier<String> useSupplierFunc() {
        System.out.println("---------------------------------------------------------------");
//        Stream.of(Thread.currentThread().getStackTrace()).forEach(m -> System.out.println(m.getMethodName()));
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        return () -> Thread.currentThread().getStackTrace()[1].getMethodName();
    }
}
