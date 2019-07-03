package danielandromain.bookingdemo.models;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private String name;
    private List<HotelBooking> bookings;

    public Hotel(String name) {
        this.name = name;
        bookings = new ArrayList<>();
    }

    public boolean add(HotelBooking hotelBooking){
       return bookings.add(hotelBooking);
    }

    public boolean remove(HotelBooking hotelBooking){
        return bookings.remove(hotelBooking);
    }
}
