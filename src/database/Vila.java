package database;

import java.io.*;

public class Vila implements RealEstateInterface{

    private String location;
    private Float price;
    private Float area;
    private Integer room_count;
    private Integer level_number;

    public Vila(String location, Float price, Float area, Integer room_count, Integer level_number) {
        this.location = location;
        this.price = price;
        this.setArea(area);
        this.room_count = room_count;
        this.level_number = level_number;
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


    //////////// LEVELS ////////////////
    public Integer getLevel_number() {
        return level_number;
    }

    public void setLevel_number(Integer level_number) {
        this.level_number = level_number;
    }

///////////// ** WRITE & READ from FIle ** /////////////

    @Override
    public void toFile(){

        String room = (room_count==1)?"room":"rooms";

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(("Vila.txt")));
            bw.write(String.format(
                    "*** VILA DESCRIPTION ***\n" +
                            "The vila is situated in %s.\n"+
                            "The market price is $ %.2f USD.\n"+
                            "It has an area of %.1f sqm.\n"+
                            "It has %d %s.\n" +
                            "It has %d levels." ,location, price, area, room_count, room, level_number));
            bw.close();
        } catch (IOException e) {
            System.err.println("CANNOT SAVE FILE!");
        }

    }

    @Override
    public void fromFile() {
        BufferedReader br = null;
        try{
            br=new BufferedReader(new FileReader("Vila.txt"));
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
        return "Vila:\n" +
                "location: " + location + "\n" +
                "price: $ " + price + "USD\n" +
                "area: " + area + "\n" +
                "rooms: " + room_count + "\n" +
                "levels: " + level_number + "\n";
    }
}
