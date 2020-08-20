package com.company;

public class Wardrobe {
    private Dimensions dimensions;
    private String type;
    private int sections;

    public Wardrobe(Dimensions dimensions, String type, int sections) {
        this.dimensions = dimensions;
        this.type = type;
        this.sections = sections;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getType() {
        return type;
    }

    public int getSections() {
        return sections;
    }
}
