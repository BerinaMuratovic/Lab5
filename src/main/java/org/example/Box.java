package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public abstract class Box {
    private double maxWeight;
    private List<ToBeStored> items;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public abstract void add(Thing thing);
    public void add(Collection<Thing> things){
        for(Thing thing : things){
            add(thing);
        }
    }
    public abstract boolean isInTheBox(Thing thing);


    public double totalWeight() {
        double total = 0;
        for (ToBeStored item : items) {
            total += item.weight();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " things, total weight " + totalWeight() + " kg";
    }
}