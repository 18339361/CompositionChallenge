package com.company;

public class Wall {
    private String colour;
    private Dimensions dimensions;

    public Wall(String colour, Dimensions dimensions) {
        this.colour = colour;
        this.dimensions = dimensions;
    }

    public String getColour() {
        return colour;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
