package com.lti.bus.service;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.bus.model.Bus;
import com.lti.bus.model.Routes;
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
public class BusService {
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

	public List<Bus> getBus() {

		return busRepo.findAll();
	}



	public boolean addBus(Bus bus) {
		busRepo.save(bus);
		return true;
	}


	public boolean updateBus(Bus bus) {
		Bus newb = busRepo.findById(bus.getBusid()).get();
		newb = bus;
		busRepo.save(newb);
		return true;
	}


	public boolean deleteBus(Bus bus) {
		busRepo.delete(bus);
		return true;
	}

	public boolean addRoutes(Routes route) {
		routeRepo.save(route);
		return true;
	}


	public boolean updateRoutes(Routes route) {
		Routes newr = routeRepo.findById(route.getRouteid()).get();
		newr = route;
		routeRepo.save(route);
		return true;
	}


	public boolean deleteRoutes(Routes route) {
		routeRepo.delete(route);
		return true;
	}

}