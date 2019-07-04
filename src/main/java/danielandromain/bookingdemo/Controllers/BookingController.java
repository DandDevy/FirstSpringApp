package danielandromain.bookingdemo.Controllers;

import danielandromain.bookingdemo.models.HotelBooking;
import danielandromain.bookingdemo.models.Interfaces.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    private BookingRepository bookingRepository;

    @Autowired
    public BookingController(BookingRepository repository) {
        bookingRepository = repository;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<HotelBooking> getAll(){
        return bookingRepository.findAll();
    }

    @RequestMapping(value = "/affordable/{price}", method = RequestMethod.GET)
    public List<HotelBooking> getAffordable(@PathVariable double price){
        return bookingRepository.findByPricePerNightLessThan(price);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<HotelBooking> create(@RequestBody HotelBooking hotelBooking){

        bookingRepository.save(hotelBooking);

        return bookingRepository.findAll();
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public List<HotelBooking> remove(@PathVariable long id){

        bookingRepository.deleteById(id);

        return bookingRepository.findAll();
    }
}
