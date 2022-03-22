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
public class SeatBookJPAController {
	@Autowired
	SeatBookService seatService;
	@Autowired
	BookService bookService;
	@Autowired
	UserService userService;
	@Autowired
	BusService busService;

	@GetMapping("/busbyri/{routeid}")
	public List<Bus> busByRouteId(@PathVariable(value = "routeid") String rid) {
		return seatService.findBusByRouteId(rid);
	}


	@GetMapping("/walletinfo/{mailid}")
	public Double getWalletInfo(@PathVariable(value = "mailid") String mailId) {
		return seatService.getWalletInfo(mailId);
	}


	@GetMapping("/seatbybus/{pr}")
	public List<Seats> seatsbybusid(@PathVariable(value = "pr")String pr) {
		System.out.println(pr);
		return seatService.findByBusId(pr);
	}

	@GetMapping("/busByIdAnjan/{busId}")
	public Bus busById(@PathVariable(value = "busId")String busId) {
		return seatService.busByBusId(busId);
	}


	@GetMapping("/busbyr/{busid}/{date}")
	public List<Bus> busByRouteIdandDate(@PathVariable(value = "busid") String prid, @PathVariable(value = "date") String date) throws ParseException {
		Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
		System.out.println("First " + date);
		System.out.println("Second " + d1);


		return seatService.findBusByRouteIdandDate(prid, d1);
	}

	@GetMapping("/passengerByBooking/{bookingId}")
	public Passenger getPassengerByBookingId(@PathVariable(value = "bookingId")String bookingId) {
		return seatService.findByBookingIdPassenger(bookingId);

	}

	@DeleteMapping("/DeleteBookingDetails/{bookingId}")
	public void  deletebookingdetails(@PathVariable(value = "bookingId")String bookingId) {
		seatService.deletebookingdetails(bookingId);
	}

	@GetMapping("/seats/{seatId}")
	public Seats seatsRecordBySeatId(@PathVariable(value = "seatId")String seatId) {
		return seatService.seatsRecordBySeatId(seatId);
	}


	@PutMapping("/seatsMadhu")
	public boolean updateSeatsRecordBySeatId(@RequestBody Seats seats) {
		return seatService.updateSeatsRecordBySeatId(seats);

	}



	@GetMapping("/bus/{busid}")
	public Bus getBusById(@PathVariable(value = "busid")String busid) {
		return seatService.findBus(busid);
	}
	@GetMapping("/routes/{routeid}")
	public Routes getRouteById(@PathVariable(value = "routeid")String routeid) {
		return seatService.findRoute(routeid);
	}
	@DeleteMapping("/routes/{routeid}")
	public boolean deleteRoute(@PathVariable(value = "routeid")String routeid) {
		return seatService.deleteRoutebyId(routeid);
	}
	@DeleteMapping("/bus/{busid}")
	public boolean deleteBus(@PathVariable(value = "busid")String busid) {
		return seatService.deleteBusbyId(busid);
	}
	@PostMapping("/seats")
	public boolean addSeatstoBus(@RequestBody Seats seats) {
		return seatService.addSeats(seats);
	}
	@GetMapping("/getbookingsbylimit/{dateOfBooking1}/{dateOfBooking2}")
	public List<Booking> findBookingsBydates(@PathVariable(value = "dateOfBooking1")String date1, @PathVariable(value = "dateOfBooking2")String date2) throws ParseException {
		Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse(date1);
		Date d2 = new SimpleDateFormat("yyyy-MM-dd").parse(date2);
		System.out.println("First " + d1);
		System.out.println("Second" + d2);
		return seatService.findBookingsBydates(d1, d2);
	}

	@GetMapping("/getonlyuserdetails")
	public List<UserDetails> findOnlyUserDetails() {

		return seatService.findOnlyUserDetails("user");
	}
	@GetMapping("/bookingHistory")
	public List<Booking> getBookingHistory() {
		return seatService.getBookingHistory();
	}
	@GetMapping("/passengerHistory")
	public List<Passenger> getPassengerHistory() {
		return seatService.getallPassengerHistory();
	}
	@GetMapping("/customerFeedbacks")
	public List<Feedback> getBusFeedback() {
		return seatService.getallbusFeedback();
	}
	@DeleteMapping("/deleteallseats/{busId}")
	public void deleteAllSeats(@PathVariable(value = "busId")String busId) {
		seatService.deleteAllSeats(busId);
	}

}