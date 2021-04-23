package com.cg.ovms.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ovms.entities.Booking;
import com.cg.ovms.entities.Customer;
import com.cg.ovms.entities.Payment;
import com.cg.ovms.entities.Vehicle;
import com.cg.ovms.service.IAdminService;
import com.cg.ovms.entities.User;

import io.swagger.annotations.Api;

@Api(value="VehicleManagement")
@RestController
@RequestMapping(value="/VehicleManagement/Admin")
public class AdminController {
	
	@Autowired
	IAdminService adminService;
	
	@PostMapping(value="/Addbooking")
	public ResponseEntity<Object> addBooking(@RequestBody Booking booking) {
		// TODO Auto-generated method stub
		adminService.addBooking(booking);
		return new ResponseEntity<Object>("Vehicle is booked successfully",HttpStatus.OK);
	}
	
	@PostMapping(value="/Cancelbooking")
	public ResponseEntity<Object> cancelBooking(@RequestBody Booking booking) {
		// TODO Auto-generated method stub
		adminService.cancelBooking(booking);
		return new ResponseEntity<Object>("Your booking has been cancelled",HttpStatus.OK);

	}
	
	@PostMapping(value="/Updatebooking")
	public  ResponseEntity<Object> updateBooking(@RequestBody Booking booking) {
		// TODO Auto-generated method stub
		adminService.updateBooking(booking);
		return new ResponseEntity<Object>("Your booking has been updated",HttpStatus.OK);
	}
	
	@PostMapping(value="/Viewbooking")
	public Booking viewBooking(@RequestBody Booking booking) {
		// TODO Auto-generated method stub
		return adminService.viewBooking(booking);
	}
	
	@PostMapping(value="/ViewAllbooking")
	public List<Booking> viewAllBooking(@RequestBody Customer customer) {
		// TODO Auto-generated method stub
		return adminService.viewAllBooking(customer);
	}
	
	@GetMapping(value="/Viewallbookingbydate")
	public List<Booking> viewAllBookingByDate(LocalDate bookingDate) {
		// TODO Auto-generated method stub
		return adminService.viewAllBookingByDate(bookingDate);
	}
	
	@PostMapping(value="/ViewAllBookingByVehicle")
	public List<Booking> viewAllBookingByVehicle(@RequestBody Vehicle vehicle) {
		// TODO Auto-generated method stub
		return adminService.viewAllBookingByVehicle(vehicle);
	}
	
	
	
	@PostMapping(value = "/addVehicle")
	public ResponseEntity<Object> addVehicle(@RequestBody Vehicle vehicle) {
		adminService.addVehicle(vehicle);
		return new ResponseEntity<Object>("Vehicle Added.", HttpStatus.OK);
	}
	
	@PutMapping(value="/updateVehicle")
	public ResponseEntity<String> updateVehicle(@RequestBody Vehicle vehicle) {
		adminService.updateVehicle(vehicle);
		return new ResponseEntity<String>("Successfully Updated", HttpStatus.OK);
	}
	
	@GetMapping(value="/viewAllVehicles")
	public List<Vehicle> viewAllVehicles() {
		return adminService.viewAllVehicle();
	}
	
	@GetMapping(value="/viewVehiclesById/{vehicleId}")
	public Vehicle getVehicleByName(@PathVariable int vehicleId) {
		return adminService.viewVehicleById(vehicleId);
	}
	
	@GetMapping(value="/viewVehiclesByType/{type}")
	public List<Vehicle> getVehicleByType(@PathVariable String type) {
		return adminService.viewVehiclesByType(type);
	}

	@GetMapping(value="/viewVehicleByCategory/{category}")
	public List<Vehicle> getVehicleByCategory(@PathVariable String category) {
		return adminService.viewVehiclesByCategory(category);
	}
	
	@GetMapping(value="/viewVehicleByLocation/{location}")
	public List<Vehicle> getVehicleByLocation(@PathVariable String location) {
		return adminService.viewVehiclesByLocation(location);
	}
	
	@DeleteMapping(value="/removeVehicleById/{vehicleId}")
	public ResponseEntity<String> removeVehicleById(@PathVariable int vehicleId) {
		adminService.removeVehicleById(vehicleId);
		return new ResponseEntity<String>("Successfully Deleted", HttpStatus.OK);
	}
	
	
	@PostMapping(value = "/addPayment")
	public ResponseEntity<Object> addPayment(@RequestBody Payment payment) {
		adminService.addPayment(payment);
		return new ResponseEntity<Object>("Payment Added.", HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/cancelPayment")
	public ResponseEntity<Object> cancelPayment(@RequestBody Payment payment) {
		adminService.cancelPayment(payment);
		return new ResponseEntity<Object>("Payment Cancelled.", HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/cancelPaymentById/{paymentId}")
	public ResponseEntity<Object> cancelPaymentById(@PathVariable int paymentId) {
		adminService.cancelPaymentById(paymentId);
		return new ResponseEntity<Object>("Payment Cancelled.", HttpStatus.OK);
	}
	
	@GetMapping(value = "/viewAllPayments")
	public List<Booking> viewAllPayments() {
		return adminService.viewAllPayments();
	}
	
	@GetMapping(value = "/viewPaymentByBooking")
	public Payment viewPaymentByBooking(@RequestBody Booking booking) {
		return adminService.viewPaymentByBooking(booking);
	}
	
	@GetMapping(value = "/viewAllPaymentsByVehicle")
	public List<Payment> viewAllPaymentsByVehicle(@RequestBody Vehicle vehicle) {
		return adminService.viewAllPaymentsByVehicle(vehicle);
	}
	
	
	@PostMapping(value="/addUser")
	public ResponseEntity<Object> addUser(@RequestBody User user)
	{
		adminService.addUser(user);
		return new ResponseEntity<Object>("added",HttpStatus.OK);
	}
	
	@DeleteMapping(value="/deleteById/{id}")
	public ResponseEntity<Object> deleteById(@RequestBody User user)
	{
		 adminService.removeUser(user);
		 return new ResponseEntity<Object>("deleted",HttpStatus.OK);
	}
	
	@PostMapping(value="/validateUser")
	public ResponseEntity<Object> validateUser(@RequestBody User user)
	{
		if(adminService.validateUser(user)==null)
		{
			return new ResponseEntity<Object>("invalid user",HttpStatus.NOT_FOUND);
		}
		else
		{
			return new ResponseEntity<Object>("user found",HttpStatus.OK);
		}
	}
}
