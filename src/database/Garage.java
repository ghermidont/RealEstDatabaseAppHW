package database;

import java.io.*;

public class Garage implements RealEstateInterface {

private String location; //Location (city, street, number)
private Float price; // Price/Offer (currency, amount)
private Float area;
private Integer room_count;
private Float height;

public Garage(String location, Float price, Float area, Float height) {
        this.location = location;
        this.price = price;
        this.setArea(area);
        this.height = height;
}

// ** GETTERS and SETTERS ** //

////////////// PRICE ////////////////
public Float getPrice() {
        return price;
        }

public void setPrice(Float price) {
        //HW price???
        this.price = price;
        }


//////////// AREA ////////////////
public Float getArea() {
        return area;
        }

public void setArea(Float area) {
        if(area>=10){
        this.area = area;
        }else{
        System.err.println("ERROR, wrong area value(>=10m2");
        }
}


//////////// ROOM COUNT ////////////////
public Integer getRoom_count() {
        return room_count;
        }

public void setRoom_count(Integer room_count) {
        if(room_count>=1){
        this.room_count = room_count;
        }else{
        System.err.println("ERROR, wrong area value.");
        }
        }


//////////// LOCATION ////////////////
public String getLocation() {
        return location;
        }

public void setLocation(String location) {
        this.location = location;
        }


//////////// HEIGHT ////////////////
public Float getHeight() {
        return height;
    }

public void setHeight(Float height) {
        this.height = height;
    }


///////////// ** WRITE & READ from FIle ** /////////////

@Override
public void toFile(){

         try {
        BufferedWriter bw = new BufferedWriter(new FileWriter(("Garage.txt")));
        bw.write(String.format("" +
                "*** GARAGE DESCRIPTION ***\n" +
                "The garage is situated in %s.\n"+
                "The market price is $ %.2f USD.\n"+
                "It has an area of %.1f sqm.\n"+
                "It's height is %.2f meters." ,location, price, area, height));
        bw.close();
        } catch (IOException e) {
        System.err.println("CANNOT SAVE FILE!");
        }

}

@Override
public void fromFile() {
        BufferedReader br = null;
        try{
                br=new BufferedReader(new FileReader("Garage.txt"));
                String line;
                while((line = br.readLine())!=null){
                        System.out.println(line);
                }
                System.out.println("\n");
        } catch (IOException e) {
                e.printStackTrace();

        }
}

////////////  DISPLAY CLASS ///////////

        @Override
        public String toString() {
                return "Garage:\n" +
                        "location: " + location + "\n" +
                        "price: $ " + price + " USD\n" +
                        "area: " + area + "\n" +
                        "height: " + height + "\n";
        }

}
