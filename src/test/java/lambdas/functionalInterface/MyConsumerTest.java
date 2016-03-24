package lambdas.functionalInterface;

import org.testng.annotations.Test;

import java.util.stream.Stream;

/**
 * Created by olexandra on 3/24/16.
 */
public class MyConsumerTest {

    MyConsumer consumer = new MyConsumer();

    @Test
    public void useConsumerTest() {
        consumer.useConsumer("Hello ;)");
    }

    @Test
    public void useConsumerFuncTest() {
        consumer.useConsumerFunc().accept("Hello ;)");
    }

    @Test
    public void consumerStream() {
        Stream.of(1,6).forEach(consumer.useConsumerFunc().andThen(l -> System.out.print("\n")));
    }
}