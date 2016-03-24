package lambdas.functionalInterface;

import java.util.function.Consumer;

/**
 * Created by olexandra on 3/24/16.
 */
public class MyConsumer {
    public <T> void useConsumer(T t){
        System.out.print("Consumer says: " + t);
    }

    public <T> Consumer<T> useConsumerFunc(){
        return (t) -> System.out.print("Consumer says: " + t);
    }
}
