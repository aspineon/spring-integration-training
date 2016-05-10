package pl.training.integration.lab03;

import java.util.concurrent.atomic.AtomicLong;

public class IdGenerator {

    private AtomicLong counter = new AtomicLong();

    public long getNext() {
        return counter.incrementAndGet();
    }

}
