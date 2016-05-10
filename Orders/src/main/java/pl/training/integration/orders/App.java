package pl.training.integration.orders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.training.integration.lab05.model.CoffeeType;
import pl.training.integration.lab05.model.Order;
import pl.training.integration.lab05.model.OrderItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@EnableAutoConfiguration
public class App {

    private static final int MAX_ITEMS_IN_ORDER = 10;

    private Random random = new Random();
    private CoffeeType[] coffeeTypes = CoffeeType.values();

    @RequestMapping("api/orders")
    public Order getNextOrder() {
        return new Order(createOrderItems());
    }

    private int getNumberOfItems() {
        return random.nextInt(MAX_ITEMS_IN_ORDER) + 1;
    }

    private CoffeeType getCoffeeType() {
        return coffeeTypes[random.nextInt(coffeeTypes.length)];
    }

    private OrderItem createOrderItem() {
        boolean iced = random.nextBoolean();
        return new OrderItem(getCoffeeType(), iced);
    }

    private List<OrderItem> createOrderItems() {
        int numberOfItems = getNumberOfItems();
        List<OrderItem> orderItems = new ArrayList<>(numberOfItems);
        for (int i = 1; i <= numberOfItems; i++) {
            orderItems.add(createOrderItem());
        }
        return orderItems;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }

}
