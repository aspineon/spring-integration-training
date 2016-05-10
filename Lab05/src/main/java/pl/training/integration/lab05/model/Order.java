package pl.training.integration.lab05.model;

import java.util.List;

public class Order {

    private List<OrderItem> orderItems;

    public Order() {
    }

    public Order(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        return orderItems != null ? orderItems.equals(order.orderItems) : order.orderItems == null;

    }

    @Override
    public int hashCode() {
        return orderItems != null ? orderItems.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderItems=" + orderItems +
                '}';
    }

}
