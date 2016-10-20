/**
 * Created by Viraj on 10/16/2016.
 */
public class House {
    private int id;
    private String address;
    private int rent;
    private String landlord;

    public House() {}

    public House(String address, int rent, String landlord) {
        this.address = address;
        this.rent = rent;
        this.landlord = landlord;
    }

    public String getLandlord() {
        return landlord;
    }

    public void setLandlord(String landlord) {
        this.landlord = landlord;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
