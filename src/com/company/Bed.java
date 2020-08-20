package com.company;

public class Bed {
    private String colour;
    private boolean mattress;

    public Bed(String colour, boolean mattress) {
        this.colour = colour;
        this.mattress = mattress;
    }

    public String getColour() {
        return colour;
    }

    public boolean isMattress() {
        return mattress;
    }
}
