package com.cg.ovms.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.ovms.entities.Booking;
import com.cg.ovms.entities.Customer;
import com.cg.ovms.entities.Payment;
import com.cg.ovms.entities.User;
import com.cg.ovms.entities.Vehicle;
import com.cg.ovms.repository.IAdminRepository;

public class AdminService implements IAdminService{

	@Autowired
	IAdminRepository adminRepository;

	@Override
	public Booking addBooking(Booking booking) {
		// TODO Auto-generated method stub
		return adminRepository.addBooking(booking);
	}

	@Override
	public Booking cancelBooking(Booking b) {
		// TODO Auto-generated method stub
		return adminRepository.cancelBooking(b);
	}

	@Override
	public Booking updateBooking(Booking b) {
		// TODO Auto-generated method stub
		return adminRepository.cancelBooking(b);
	}

	@Override
	public Booking viewBooking(Booking b) {
		// TODO Auto-generated method stub
		return adminRepository.updateBooking(b);
	}

	@Override
	public List<Booking> viewAllBooking(Customer customer) {
		// TODO Auto-generated method stub
		return adminRepository.viewAllBooking(customer);
		
	}

	@Override
	public List<Booking> viewAllBookingByDate(LocalDate bookingDate) {
		// TODO Auto-generated method stub
		return adminRepository.viewAllBookingByDate(bookingDate);
	}

	@Override
	public List<Booking> viewAllBookingByVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return adminRepository.viewAllBookingByVehicle(vehicle);
	}

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return adminRepository.addCustomer(customer);
	}

	@Override
	public void removeCustomer(Customer customer) {
		// TODO Auto-generated method stub
		  adminRepository.removeCustomer(customer);
	}

	@Override
	public Customer viewCustomer(Customer c) {
		// TODO Auto-generated method stub
	 return adminRepository.viewCustomer(c);
	}

	@Override
	public Customer updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		return adminRepository.updateCustomer(c);
	}


	@Override
	public Booking addPayment(Payment payment) {
		// TODO Auto-generated method stub
		return adminRepository.addPayment(payment);
	}

	@Override
	public Booking cancelPayment(Payment p) {
		// TODO Auto-generated method stub
		return adminRepository.cancelPayment(p);
	}

	@Override
	public Booking viewPayment(Booking b) {
		// TODO Auto-generated method stub
		return adminRepository.viewPayment(b);
	}

	@Override
	public List<Booking> viewAllPayments() {
		// TODO Auto-generated method stub
		return adminRepository.viewAllPayments();
	}

	@Override
	public double calculateMonthlyRevenue(LocalDate d1, LocalDate d2) {
		// TODO Auto-generated method stub
		return adminRepository.calculateMonthlyRevenue(d1, d2);
	}

	@Override
	public double calculateTotalPayment(Vehicle v) {
		// TODO Auto-generated method stub
		return adminRepository.calculateTotalPayment(v);
	}

	@Override
	public Vehicle addVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return adminRepository.addVehicle(vehicle);
	}

	@Override
	public void removeVehicleById(int vehicleId) {
		// TODO Auto-generated method stub
		adminRepository.removeVehicleById(vehicleId);
	}

	@Override
	public Vehicle updateVehicle(Vehicle v) {
		// TODO Auto-generated method stub
		return adminRepository.updateVehicle(v);
	}

	@Override
	public Vehicle viewVehicleById(int id) {
		// TODO Auto-generated method stub
		return adminRepository.viewVehicleById(id);
	}

	@Override
	public List<Vehicle> viewVehiclesByType(String type) {
		// TODO Auto-generated method stub
		return adminRepository.viewVehiclesByType(type);
	}

	@Override
	public List<Vehicle> viewVehiclesByCategory(String category) {
		// TODO Auto-generated method stub
		return adminRepository.viewVehiclesByCategory(category);
	}

	@Override
	public List<Vehicle> viewVehiclesByLocation(String location) {
		// TODO Auto-generated method stub
		return adminRepository.viewVehiclesByLocation(location);
	}

	@Override
	public List<Vehicle> viewAllVehicle() {
		// TODO Auto-generated method stub
		return adminRepository.viewAllVehicle();
	}

	@Override
	public void cancelPaymentById(int paymentId) {
		// TODO Auto-generated method stub
		adminRepository.cancelPaymentById(paymentId);
	}

	@Override
	public User validateUser(User user) {
		// TODO Auto-generated method stub
		return adminRepository.validateUser(user);
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return adminRepository.addUser(user);
	}

	@Override
	public User removeUser(User user) {
		// TODO Auto-generated method stub
		return adminRepository.removeUser(user);
	}

	@Override
	public User signOut(User user) {
		// TODO Auto-generated method stub
		return adminRepository.signOut(user);
	}

	@Override
	public Payment viewPaymentByBooking(Booking booking) {
		// TODO Auto-generated method stub
		return adminRepository.viewPaymentByBooking(booking);
	}

	@Override
	public List<Payment> viewAllPaymentsByVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return adminRepository.viewAllPaymentsByVehicle(vehicle);
	}
	
	
}
