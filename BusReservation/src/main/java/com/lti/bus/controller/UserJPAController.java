package com.lti.bus.layer5;
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
import com.lti.bus.model.UserDetails;
import com.lti.bus.service.BookService;
import com.lti.bus.service.BusService;
import com.lti.bus.service.SeatBookService;
import com.lti.bus.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/bookingRest/api")
public class UserJPAController {
	@Autowired
	SeatBookService seatService;
	@Autowired
	BookService bookService;
	@Autowired
	UserService userService;
	@Autowired
	BusService busService;
	@GetMapping("/payment")
	public Payment getPayment() {
		return userService.findPayment("4001");
	}
	@PostMapping("/payment")
	public boolean addPayment(@RequestBody Payment payment) {
		return userService.addPayment(payment);
	}

	@PutMapping("/payment")
	public boolean updatePayment(@RequestBody Payment payment) {
		return userService.updatePayment(payment);
	}


	@DeleteMapping("/payment")
	public boolean deletePayment(@RequestBody String payment) {
		return userService.delPayment(payment);
	}

	@GetMapping("/feedback")
	public Feedback getFeedback() {
		return userService.findFeedback("5001");
	}
	@PostMapping("/feedback")
	public boolean addFeedback(@RequestBody Feedback feedback) {
		return userService.addFeedback(feedback);
	}

	@PutMapping("/feedback")
	public boolean updateFeedback(@RequestBody Feedback feedback) {
		return userService.updateFeedback(feedback);
	}

	@DeleteMapping("/feedback")
	public boolean deleteFeedback(@RequestBody String feedback) {
		return userService.delFeedback(feedback);
	}

	@GetMapping("/passenger")
	public Passenger getPassenger() {
		return userService.findPassenger("5001");
	}



	@PostMapping("/passenger")
	public boolean addPassenger(@RequestBody Passenger passenger ) {
		return userService.addPassenger(passenger);
	}

	@PutMapping("/passenger")
	public boolean updatePassenger(@RequestBody Passenger passenger) {
		return userService.updatePassenger(passenger);
	}

	@DeleteMapping("/passenger")
	public boolean deletePassenger(@RequestBody String passengerId) {
		return userService.deletePassenger(passengerId);
	}

	@GetMapping("/userdetails")
	public UserDetails getUserDetails() {
		return userService.findUserDetails("4");
	}
	@PostMapping("/userdetails")
	public boolean addUserDetails(@RequestBody UserDetails userdetails) {
		return userService.addUserDetails(userdetails);
	}

	@GetMapping("/userloginbymid/{mailId}")
	public UserDetails getUserDetailsByMailId(@PathVariable(value = "mailId") String mailId) {
		return userService.findUserDetailsByMailId(mailId);
	}

	@PutMapping("/userdetails")
	public boolean updateUserDetails(@RequestBody UserDetails userdetails) {
		return userService.updateUserDetails(userdetails);
	}
	@DeleteMapping("/userdetails")
	public boolean deleteUserDetails(@RequestBody String userId) {
		return userService.deleteUserDetails(userId);
	}

	@GetMapping("/bookingByEmail/{emailId}")
	public List<Booking> getBookingsByEmailIdBookings(@PathVariable(value = "emailId") String emailId) {
		return userService.findByEmailIdBookings(emailId);
	}

	@GetMapping("/busByBusId/{busId}")
	public Bus findByBusIdBuses(@PathVariable(value = "busId") String busId) {
		return userService.findByBusIdBuses(busId);

	}

	@GetMapping("/userdetails/{userid}")
	public UserDetails getUserDetails(@PathVariable(value = "userid" ) String userid) {
		return userService.findUserDetails(userid);
	}

}