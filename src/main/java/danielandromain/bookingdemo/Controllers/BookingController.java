package danielandromain.bookingdemo.Controllers;

import danielandromain.bookingdemo.models.HotelBooking;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <h1>BookingController</h1>
 * <p>This is a RestController</p>
 */
@RestController
@RequestMapping(value = "/bookings")
public class BookingController {
    private List<HotelBooking> bookings;

    public BookingController() {
        bookings = new ArrayList<>();

        bookings.add(new HotelBooking("Queens", 200.50, 6));
        bookings.add(new HotelBooking("Caesars place",750, 2));
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<HotelBooking> getAll(){
        return bookings;
    }

    @RequestMapping(value = "/affordable/{price}", method = RequestMethod.GET)
    public List<HotelBooking> getAffordable(@PathVariable double price){
        return bookings.stream().filter(x -> x.getPricePerNight() <= price)
                .collect(Collectors.toList());
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<HotelBooking> create(@RequestBody HotelBooking hotelBooking){
        bookings.add(hotelBooking);

        return bookings;
    }
}
