package com.lti.bus.service;
import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.bus.model.Booking;
import com.lti.bus.model.Bus;
import com.lti.bus.model.Feedback;
import com.lti.bus.model.Passenger;
import com.lti.bus.model.Payment;
import com.lti.bus.model.UserDetails;
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
public class UserService {
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

	public Payment findPayment(String paymentId) {
		return paymentRepo.getById(paymentId);
	}

	public boolean addPayment(Payment payment) {
		paymentRepo.save(payment);
		return true;

	}

	public boolean updatePayment(Payment payment) {
		paymentRepo.save(payment);
		return true;
	}
	
	public boolean delPayment(String id) {
		paymentRepo.deleteById(id);
		return true;
	}

	public Feedback findFeedback(String feedbackId) {
		return feedbackRepo.getById(feedbackId);
	}

	public boolean addFeedback(Feedback feedback) {
		feedbackRepo.save(feedback);
		return true;

	}

	public boolean updateFeedback(Feedback feedback) {
		feedbackRepo.save(feedback);
		return true;
	}

	public boolean delFeedback(String id) {
		feedbackRepo.deleteById(id);
		return true;
	}



	public Passenger findPassenger(String passengerId) {
		return passengerRepo.getById(passengerId);
	}

	public boolean addPassenger(Passenger passenger) {
		passengerRepo.save(passenger);
		return true;

	}

	public boolean updatePassenger(Passenger passenger) {
		passengerRepo.save(passenger);
		return true;
	}

	public boolean deletePassenger(String passengerId) {
		passengerRepo.deleteById(passengerId);
		System.out.println("delete");
		return true;
	}

	public UserDetails findUserDetails(String userId) {
		return userdetailsRepo.getById(userId);
	}

	public boolean addUserDetails(UserDetails userdetails) {
		userdetailsRepo.save(userdetails);
		return true;

	}

	public boolean updateUserDetails(UserDetails userdetails) {
		userdetailsRepo.save(userdetails);
		return true;
	}

	public boolean deleteUserDetails(String id) {
		userdetailsRepo.deleteById(id);
		return true;
	}

	public UserDetails findUserDetailsByMailId(String mailId) {
		return userdetailsRepo.findUserDetailsByMailId(mailId);
	}



	public List<Booking> findByBusIdBookings(String busId) {
		return bookingRepo.findByBusIdBookings(busId);
	}

	public List<Booking> findByEmailIdBookings(String mailId) {
		System.out.println(mailId);
		return bookingRepo.findByEmailIdBookings(mailId);
	}

	public boolean updateUserDetailsv(UserDetails userDetails) {
		UserDetails newb = userdetailsRepo.findById(userDetails.getUserId()).get();
		newb = userDetails;
		userdetailsRepo.save(newb);
		return true;
	}



	public Bus findByBusIdBuses(String busId) {
		return bookingRepo.findBusIdBookings(busId);
	}

}