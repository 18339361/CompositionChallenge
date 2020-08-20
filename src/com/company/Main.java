package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions wallDimensions= new Dimensions(2.0, 3.5);
        Wall wall= new Wall("blue", wallDimensions);

        Door door= new Door("oak");

        Dimensions wardrobeDimensions= new Dimensions(2.0, 1.5);
        Wardrobe wardrobe= new Wardrobe(wardrobeDimensions, "oak", 6);

        Bed bed= new Bed("white", true);

        Floor floor= new Floor("brown", "solid wood");

        Room pranchalRoom = new Room(wall, door, wardrobe, bed, floor);
        pranchalRoom.describeRoom();
    }
}
