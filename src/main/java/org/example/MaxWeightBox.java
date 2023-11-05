package org.example;
import java.util.ArrayList;
import java.util.List;
public  class MaxWeightBox extends Box {
    private int maxWeight=0;

    public MaxWeightBox(int maxWeight) {
        super(maxWeight);

    }
    @Override
    public void add(Thing thing) {
        if (thing.getWeight() <= getMaxWeight() && maxWeight + thing.getWeight() <= getMaxWeight()) {
            add(thing);
        }}
    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}

