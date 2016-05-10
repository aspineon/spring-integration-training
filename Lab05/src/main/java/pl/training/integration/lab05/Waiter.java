package pl.training.integration.lab05;

import pl.training.integration.lab05.model.Coffee;

import java.util.List;

public class Waiter {

    public List<Coffee> serve(List<Coffee> coffees) {
        System.out.println("Serving: " + coffees);
        return coffees;
    }

}
