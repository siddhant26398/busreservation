package com.lti.bus;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.bus.model.Booking;
import com.lti.bus.model.Bus;
import com.lti.bus.model.Passenger;
import com.lti.bus.model.Routes;
import com.lti.bus.model.Seats;
import com.lti.bus.model.UserDetails;
import com.lti.bus.repository.BookingRepository;
import com.lti.bus.repository.BusRepository;
import com.lti.bus.repository.PassengerRepository;
import com.lti.bus.repository.RouteRepository;
import com.lti.bus.repository.SeatsRepo;
import com.lti.bus.repository.UserDetailsRepository;

@SpringBootTest
class BusReservationApplicationTests {

	@Autowired
	BusRepository busrepo;

	@Autowired
	UserDetailsRepository userRepo;

	@Autowired
	RouteRepository rtrepo;

	@Autowired
	SeatsRepo seatRepo;

	@Autowired
	PassengerRepository passRepo;


	@Autowired
	BookingRepository bookrepo;
	@Test

	void contextLoads() {
	}

//	
//	@Test
//	public void findBusByRouteIdTest(){
//		List<Bus> buslist=busrepo.findBusByRouteId("1");
//		for(Bus b:buslist) {
//			System.out.println(b.getBusid());
//			System.out.println(b.getBusname());
//			System.out.println(b.getBustype());
//			System.out.println(b.getDeparturetime());
//			System.out.println(b.getArrivaltime());
//			System.out.println(b.getFare());
//			System.out.println("----------");
//		}
//		
//	}
//	
//	@Test 
//	public void findBusByRouteIdandDateTest(){
//		Date date1 = null;
//		try {
//			date1 = new SimpleDateFormat("dd/MM/yyyy"). parse("04-Oct-2021");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		List<Bus> buslist=busrepo.findBusByRouteIdandDate("3",date1);
//		for(Bus b:buslist) {
//			System.out.println(b.getBusid());
//			System.out.println(b.getBusname());
//			System.out.println(b.getBustype());
//			System.out.println(b.getDeparturetime());
//			System.out.println(b.getArrivaltime());
//			System.out.println(b.getFare());
//			System.out.println("----------");
//		} 
//	}
//	
//	@Test
//	public void getallbusesTest(){
//		List<Bus> buslist=busrepo.getallbuses();
//		for(Bus b:buslist) {
//			System.out.println(b.getBusid());
//			System.out.println(b.getBusname());
//			System.out.println(b.getBustype());
//			System.out.println(b.getDeparturetime());
//			System.out.println(b.getArrivaltime());
//			System.out.println(b.getFare());
//			System.out.println("----------");
//		} 
//	}
//	
//
//	
//	public void findUserDetailsByMailIdTest() {
//		
//		UserDetails ud=userRepo.findUserDetailsByMailId("abc@gmail.com");
//		System.out.println("User first name :"+ud.getFirstName());
//		System.out.println("User Last name :"+ud.getLastName());
//		
//	}
//	public void getWalletInfoTest() {
//		double d=userRepo.getWalletInfo("abc@gmail.com");
//		System.out.println("Wallet info :"+ d);
//		
//	}
//	public void findOnlyUserDetailsTest(){
//		
//		List<UserDetails> ud = userRepo.findOnlyUserDetails("user");
//		for (UserDetails u : ud) {
//		System.out.println("User first name :"+u.getFirstName());
//		}
//	}
//
//	@Test
//	public void getALLRoutesTest() {
//		List<Routes> routelist=rtrepo.getALLRoutes();
//		for(Routes r:routelist) {
//			System.out.println("Route id: "+r.getRouteid());
//			System.out.println("Source: "+r.getSource());
//			System.out.println("Destination: "+r.getDestination());
//			System.out.println("-------------------");
//		}
//	}
//
//	@Test
//	public void findUserDetailsByMailIdTest() {
//		
//		UserDetails ud=userRepo.findUserDetailsByMailId("abc@gmail.com");
//		System.out.println("User first name :"+ud.getFirstName());
//		System.out.println("User Last name :"+ud.getLastName());
//		
//	}
//	@Test
//	public void getWalletInfoTest() {
//		double d=userRepo.getWalletInfo("abc@gmail.com");
//		System.out.println("Wallet info :"+ d);
//		
//	}
//	@Test
//	public void findOnlyUserDetailsTest(){
//		
//		List<UserDetails> ud = userRepo.findOnlyUserDetails("user");
//		for (UserDetails u : ud) {
//		System.out.println("User first name :"+u.getFirstName());
//		System.out.println("User Last name :"+u.getLastName());
//		}
//	}
//	
//----------SeatTest------------
//	
//	@Test
//	public void  seatsRecordBySeatIdTest() {
//		
//		Seats s=seatRepo.seatsRecordBySeatId("1");
//		System.out.println("availability :"+ s.getAvailability());
//		
//	}
//	@Test
//	public void findByBusIdTest() 
//	
//	{
//		List<Seats> s = seatRepo.findByBusId("1");
//		for (Seats u : s) {
//		System.out.println("availability :"+ u.getAvailability());
//		
//		}
//	}
//		
//		@Test
//		public void deleteAllSeatsTest() {
//			
//		seatRepo.deleteAllSeats("1");
//			System.out.println("Deleted");
//		}
//	@Test
//	public void findByBookingIdPassengerTest() {
//
//		Passenger p = passRepo.findByBookingIdPassenger("1");
//		System.out.println("Passenger name:" + p.getPassengerName());
//		System.out.println("Passenger Age:" + p.getPassAge());
//
//	}
//
//	@Test
//	public void getPassengerHistoryTest() {
//
//		List<Passenger> p = passRepo.getPassengerHistory();
//		for (Passenger o : p) {
//			System.out.println("Passenger name:" + o.getPassengerName());
//			System.out.println("Passenger Age:" + o.getPassAge());
//
//		}
//
//	}
//	
//	@Test
//	public void findByBusIdBookingsTest(){
//		
//		List<Booking> booklist=bookrepo.findByBusIdBookings("1");
//		for(Booking book:booklist) {
//			System.out.println("Booking ID: "+book.getBookingId());
//			System.out.println("Booking status: "+book.getStatus());
//			System.out.println("Booking Date: "+book.getDateOfBooking());
//			System.out.println("Travel Date: "+book.getDateOfTravek());
//			System.out.println("Email ID: "+book.getEmailId());
//			System.out.println("Phone number: "+book.getPhoneNo());
//			System.out.println("No. of tickets: "+book.getNoOfTickets());
//		}
//		
//	}
//	
//	@Test
//	public void findByEmailIdBookingsTest() {
//		List<Booking> booklist=bookrepo.findByBusIdBookings("jawwadismail@gmail.com"); //add database email id here
//		for(Booking book:booklist) {
//			System.out.println("Booking ID: "+book.getBookingId());
//			System.out.println("Booking status: "+book.getStatus());
//			System.out.println("Booking Date: "+book.getDateOfBooking());
//			System.out.println("Travel Date: "+book.getDateOfTravek());
//			System.out.println("Email ID: "+book.getEmailId());
//			System.out.println("Phone number: "+book.getPhoneNo());
//			System.out.println("No. of tickets: "+book.getNoOfTickets());
//		}
//	}
//	
//	@Test
//	public void findBusIdBookingsTest() {
//		Bus booklist=bookrepo.findBusIdBookings("1");
//		System.out.println("Bus id: "+booklist.getBusid());
//		System.out.println("Bus name: "+booklist.getBusname());
//		System.out.println("Bus type: "+booklist.getBustype());
//		System.out.println("Departure time: "+booklist.getDeparturetime());
//		System.out.println("Arrival time: "+booklist.getArrivaltime());
//		System.out.println("Available seats: "+booklist.getAvailableseats());
//		System.out.println("Distance: "+booklist.getDistance());
//	}
//	
//	@Test
//	public void updateUserFirstNameDetailsTest() {
//		UserDetails user= bookrepo.updateUserFirstNameDetails("Amey", "amey99@gmail.com");
//		System.out.println("First name: "+user.getFirstName());
//		System.out.println("Last name: "+user.getLastName());
//		System.out.println("Email ID: "+user.getMailId());
//		System.out.println("Password: "+user.getPassword());
//	}
//	
//	@Test
//	public void deletebookingdetailsTest() {
//		try {
//			bookrepo.deletebookingdetails("2");
//			System.out.println("Booking deleted...");
//		}
//		
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//	}
//	
//	@Test
//	public void findBookingsBydateTest() {
//		Date date1 = null;
//		try {
//			date1 = new SimpleDateFormat("dd/MM/yyyy"). parse("04-Oct-2021");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		Date date2=null;
//		try {
//			date2 = new SimpleDateFormat("dd/MM/yyyy"). parse("10-Oct-2021");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		List<Booking> bookdate=bookrepo.findBookingsBydates(date1, date2);
//		for(Booking book:bookdate) {
//			System.out.println("Booking ID: "+book.getBookingId());
//			System.out.println("Booking status: "+book.getStatus());
//			System.out.println("Booking Date: "+book.getDateOfBooking());
//			System.out.println("Travel Date: "+book.getDateOfTravek());
//			System.out.println("Email ID: "+book.getEmailId());
//			System.out.println("Phone number: "+book.getPhoneNo());
//			System.out.println("No. of tickets: "+book.getNoOfTickets());
//		}
//	}	
//	
//		@Test
//		public void getBookingHistoryTest() {
//			List<Booking> bookhist=bookrepo.getBookingHistory();
//			for(Booking book:bookhist) {
//				System.out.println("Booking ID: "+book.getBookingId());
//				System.out.println("Booking status: "+book.getStatus());
//				System.out.println("Booking Date: "+book.getDateOfBooking());
//				System.out.println("Travel Date: "+book.getDateOfTravek());
//				System.out.println("Email ID: "+book.getEmailId());
//				System.out.println("Phone number: "+book.getPhoneNo());
//				System.out.println("No. of tickets: "+book.getNoOfTickets());
//			}
//		}
}
