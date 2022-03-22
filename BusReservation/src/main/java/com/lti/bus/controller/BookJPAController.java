package com.lti.bus.layer5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.bus.model.Booking;
import com.lti.bus.model.Bus;
import com.lti.bus.model.Feedback;
import com.lti.bus.model.Passenger;
import com.lti.bus.model.Payment;
import com.lti.bus.model.Routes;
import com.lti.bus.model.Seats;
import com.lti.bus.model.UserDetails;
import com.lti.bus.service.BookService;
import com.lti.bus.service.BusService;
import com.lti.bus.service.SeatBookService;
import com.lti.bus.service.UserService;

import oracle.jdbc.proxy.annotation.Post;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/bookingRest/api")
public class BookJPAController {

	@Autowired
	SeatBookService seatService;
	@Autowired
	BookService bookService;
	@Autowired
	UserService userService;
	@Autowired
	BusService busService;

	@GetMapping("/booking")
	public List<Booking> getBookings() {
		return bookService.getBooking();
	}
	@PostMapping("/booking")
	public boolean addBoooking(@RequestBody Booking booking  ) {
		return bookService.addBooking(booking);
	}

	@PutMapping("/booking")
	public boolean updateBooking(@RequestBody Booking booking) {
		return bookService.updateBooking(booking);
	}


	@DeleteMapping("/booking")
	public boolean deleteBooking (@RequestBody String booking) {
		return bookService.delBooking(booking);
	}

	@GetMapping("/seats")
	public List<Seats> getSeats() {
		return bookService.findSeats();
	}

	@PutMapping("/seats")
	public boolean updateSeats(@RequestBody Seats seats) {
		return bookService.updateSeats(seats);
	}


	@DeleteMapping("/seats")
	public boolean deleteSeats (@RequestBody String seats) {
		return bookService.delSeats(seats);
	}

}