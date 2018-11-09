package main;
import realEstateCoord.*;
public class dbapp {
    public static void main(String[] args) {

        manageReObjects Management = new manageReObjects();
        Management.writeAndReadtoDB();

    }

}
