package danielandromain.bookingdemo.Controllers;

import danielandromain.bookingdemo.models.HotelBooking;
import danielandromain.bookingdemo.models.Interfaces.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {
    private BookingRepository bookingRepository;

    @Autowired
    public DatabaseSeeder(BookingRepository bookingRepository){
        this.bookingRepository = bookingRepository;
    }
    @Override
    public void run(String... args) throws Exception {

        List<HotelBooking>bookings = new ArrayList<>();

        bookings.add(new HotelBooking("Queens", 200.50, 6));
        bookings.add(new HotelBooking("Caesars place",750, 2));

        bookingRepository.saveAll(bookings);
    }
}
