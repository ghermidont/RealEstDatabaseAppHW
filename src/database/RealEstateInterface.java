package database;

import java.io.IOException;

public interface RealEstateInterface {


    Float getPrice();

    void setPrice(Float price);

    /////////////////////

    Float getArea();

    void setArea(Float area);

    ////////////////////

    String getLocation();

    void setLocation(String location);

    /////////////////////

    void toFile();

    void fromFile();

}
