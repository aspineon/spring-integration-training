package pl.training.integration.lab05;

import pl.training.integration.lab05.model.Coffee;
import pl.training.integration.lab05.model.OrderItem;

import java.util.Random;

public class Barista {

    private static final int MAX_PREPARE_TIME = 2000;

    private Random random = new Random();

    public Coffee prepare(OrderItem orderItem) {
        try {
            Thread.sleep(random.nextInt(MAX_PREPARE_TIME));
            Coffee coffee = new Coffee(orderItem.getType(), orderItem.isIced());
            System.out.printf("Coffee %s is ready...\n", coffee);
            return coffee;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
