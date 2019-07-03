package danielandromain.bookingdemo.models;

/**
 * <h1>Hotel Booking.</h1>
 * <p>Has a name, price per night and a number of nights</p>
 */
public class HotelBooking {
    private String name;
    private double pricePerNight;
    private int nbOfNights;

    public HotelBooking(String name, double pricePerNight, int nbOfNights) {
        this.name = name;
        this.pricePerNight = pricePerNight;
        this.nbOfNights = nbOfNights;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
