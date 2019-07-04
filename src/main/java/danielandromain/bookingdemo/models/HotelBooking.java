package danielandromain.bookingdemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * <h1>Hotel Booking.</h1>
 * <p>Has a hotelName, price per night and a number of nights</p>
 */
@Entity
public class HotelBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String hotelName;
    private double pricePerNight;
    private int nbOfNights;

    public HotelBooking(String hotelName, double pricePerNight, int nbOfNights) {
        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.nbOfNights = nbOfNights;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public int getNbOfNights() {
        return nbOfNights;
    }

    public void setNbOfNights(int nbOfNights) {
        this.nbOfNights = nbOfNights;
    }

    public double getTotalPrice(){
        return pricePerNight * nbOfNights;
    }
}
