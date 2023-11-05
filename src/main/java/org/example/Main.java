package org.example;


public class Main {
    public static void main(String[] args) {
        Box box1 = new MaxWeightBox(10);
        Box box2 = new OneThingBox(10.0);
        Box box3 = new BlackHoleBox();

// Upcasting
        Thing thing = new Thing("Item", 5);
        box1.add(thing);
        box2.add(thing);
        box3.add(thing);

// Downcasting with instanceof
        if (box1 instanceof MaxWeightBox) {
            MaxWeightBox maxWeightBox = (MaxWeightBox) box1;

        }

        if (box2 instanceof OneThingBox) {
            OneThingBox oneThingBox = (OneThingBox) box2;

        }

        if (box3 instanceof BlackHoleBox) {
            BlackHoleBox blackHoleBox = (BlackHoleBox) box3;

        }
        }
    }
