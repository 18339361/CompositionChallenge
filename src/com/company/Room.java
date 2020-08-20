package com.company;

public class Room {
    private Wall wall;
    private Door door;
    private Wardrobe wardrobe;
    private Bed bed;
    private Floor floor;

    public Room(Wall wall, Door door, Wardrobe wardrobe, Bed bed, Floor floor) {
        this.wall = wall;
        this.door = door;
        this.wardrobe = wardrobe;
        this.bed = bed;
        this.floor = floor;
    }

    public Wall getWall() {
        return wall;
    }

    public Door getDoor() {
        return door;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Bed getBed() {
        return bed;
    }

    public Floor getFloor() {
        return floor;
    }

    public void describeRoom(){
        System.out.println("The room has " + wall.getColour() + " walls.");
    }
}
