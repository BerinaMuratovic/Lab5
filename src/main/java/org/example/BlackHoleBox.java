package org.example;

public class BlackHoleBox extends Box {
    public BlackHoleBox() {
        super(Double.MAX_VALUE);
    }

    @Override
    public void add(Thing thing) {

    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}