package org.example;

public  class OneThingBox extends Box {
    private boolean hasThing;

    public OneThingBox(double maxWeight) {
        super(maxWeight);
        this.hasThing = false;

    }

    @Override
    public void add(Thing thing) {
        if (!hasThing) {
            add(thing);
            hasThing = true;
        }
    }
    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
