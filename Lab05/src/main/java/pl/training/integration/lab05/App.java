package pl.training.integration.lab05;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.training.integration.lab05.model.CoffeeType;
import pl.training.integration.lab05.model.Order;
import pl.training.integration.lab05.model.OrderItem;

import java.util.ArrayList;
import java.util.List;

public class App {

    private static final int SLEEP_TIME = 20_000;

    public static void main(String[] args) throws InterruptedException {
        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml", "integration.xml")) {
            List<OrderItem> firstOrderItems = new ArrayList<>();
            List<OrderItem> secondOrderItems = new ArrayList<>();
            firstOrderItems.add(new OrderItem(CoffeeType.AMERICANO, false));
            secondOrderItems.add(new OrderItem(CoffeeType.ESPRESSO, false));
            firstOrderItems.add(new OrderItem(CoffeeType.LATE, true));
            secondOrderItems.add(new OrderItem(CoffeeType.MOCHA, true));

            Cafe cafe = applicationContext.getBean(Cafe.class);
            cafe.placeOrder(new Order(firstOrderItems));
            cafe.placeOrder(new Order(secondOrderItems));
            Thread.sleep(SLEEP_TIME);
        }
    }

}
