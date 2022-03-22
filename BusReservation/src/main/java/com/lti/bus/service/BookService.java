package com.lti.bus.service;
import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.bus.model.Booking;
import com.lti.bus.model.Seats;
import com.lti.bus.repository.BookingRepository;
import com.lti.bus.repository.BusRepository;
import com.lti.bus.repository.FeedbackRepository;
import com.lti.bus.repository.PassengerRepository;
import com.lti.bus.repository.PaymentRepository;
import com.lti.bus.repository.RouteRepository;
import com.lti.bus.repository.SeatsRepo;
import com.lti.bus.repository.UserDetailsRepository;

@Service
@Transactional
public class BookService {
	@Autowired
	BookingRepository bookingRepo;
	@Autowired
	SeatsRepo seatsRepo;
	@Autowired
	FeedbackRepository feedbackRepo;

	@Autowired
	PaymentRepository paymentRepo;

	@Autowired
	PassengerRepository passengerRepo;

	@Autowired
	UserDetailsRepository userdetailsRepo;

	@Autowired
	BusRepository busRepo;
	@Autowired
	RouteRepository routeRepo;

	public List<Booking> getBooking() {
		return bookingRepo.findAll();
	}
	public Booking findBooking(String bookingId) {
		return bookingRepo.getById(bookingId);
	}

	public boolean addBooking(Booking booking) {
		bookingRepo.save(booking);
		return true;

	}

	public boolean updateBooking(Booking booking) {
		bookingRepo.save(booking);
		return true;
	}


	public boolean delBooking(String id) {
		bookingRepo.deleteById(id);
		return true;
	}


	public List<Seats> findSeats() {
		List<Seats> ls = seatsRepo.findAll();
		return ls;

	}

	public boolean updateSeats(Seats seats) {
		seatsRepo.save(seats);
		return true;
	}


	public boolean delSeats(String id) {
		seatsRepo.deleteById(id);
		return true;
	}

}