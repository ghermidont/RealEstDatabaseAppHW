package realEstateCoord;
import database.*;

public class manageReObjects {

    public void writeAndReadtoDB() {

        Apartment my_apartment = new Apartment("Republic of Moldova, Chișinău, bd. Negruzzi, 1", 100_0000F, 200F, 8);
        Vila my_vila = new Vila( "5 Bradford Ave., Endicott, NY 13760", 10_000.0F, 450.0F,1, 2);
        Garage my_garage = new Garage(" VII. Budapest Síp u. 18, IV/24", 5_000.0F, 25.0F,  2.7F);

        my_apartment.toFile();
        my_vila.toFile();
        my_garage.toFile();

        my_apartment.fromFile();
        my_vila.fromFile();
        my_garage.fromFile();

    }
}
