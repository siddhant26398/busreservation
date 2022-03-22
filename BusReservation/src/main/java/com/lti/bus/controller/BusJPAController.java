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
public class BusJPAController {
	@Autowired
	SeatBookService seatService;
	@Autowired
	BookService bookService;
	@Autowired
	UserService userService;
	@Autowired
	BusService busService;
	@GetMapping("/bus")
	public List<Bus> getAllBus() {
		return seatService.getBuses();
	}
	@PostMapping("/bus")
	public boolean addBus(@RequestBody Bus bus) {
		return busService.addBus(bus);
	}

	@PutMapping("/bus")
	public boolean updateBus(@RequestBody Bus bus) {
		return busService.updateBus(bus);
	}
	@DeleteMapping("/bus")
	public boolean deleteBus(@RequestBody Bus bus) {
		return busService.deleteBus(bus);
	}


	@GetMapping("/routes")
	public List<Routes> getAllRoutes() {
		return seatService.getRoutes();
	}
	@PostMapping("/routes")
	public boolean addRoute(@RequestBody Routes route) {
		return busService.addRoutes(route);
	}
	@PutMapping("/routes")
	public boolean updateRoute(@RequestBody Routes route) {
		return busService.updateRoutes(route);
	}
	@DeleteMapping("/routes")
	public boolean deleteRoute(@RequestBody Routes route) {
		return busService.deleteRoutes(route);
	}
}