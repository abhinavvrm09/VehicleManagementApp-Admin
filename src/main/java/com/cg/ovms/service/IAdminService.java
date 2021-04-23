package com.cg.ovms.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.ovms.entities.Booking;
import com.cg.ovms.entities.Customer;
import com.cg.ovms.entities.Payment;
import com.cg.ovms.entities.Vehicle;

public interface IAdminService extends IBookingService, ICustomerService,IPaymentService,IUserService,IVehicleService{

//	public Booking addBooking(Booking booking);
//	public Booking cancelBooking(Booking b);
//	public Booking updateBooking(Booking b);
//	public Booking viewBooking(Booking b);
//	public List<Booking> viewAllBooking(Customer customer);
//	public List<Booking> viewAllBookingByDate
//	(LocalDate bookingDate);
//	public List<Booking> viewAllBookingByVehicle(Vehicle vehicle);
//	
//	public Customer addCustomer(Customer customer);
//	public Customer removeCustomer(Customer customer);
//	public Customer viewCustomer(Customer c);
//	public Customer updateCustomer(Customer c);
//	public List<Customer> viewAllCustomer(String vtype);
//	public List<Customer> viewAllCustomersByLocation(String location);
//	
//	
//	public Booking addPayment(Payment payment);
//	public Booking cancelPayment(Payment p);
//	public Booking viewPayment(Booking b);
//	public List<Booking> viewAllPayments(Vehicle vehicle);
//	public double calculateMonthlyRevenue(LocalDate d1,LocalDate d2);
//	public double calculateTotalPayment(Vehicle v);
//	public void cancelPaymentById(int paymentId);
//	
//	
//	public Vehicle addVehicle(Vehicle vehicle);
//	public void removeVehicleById(int vehicleId);
//	public Vehicle updateVehicle(Vehicle v);
//	public Vehicle viewVehicleById(int id);
//	public List<Vehicle> viewVehiclesByType(String type);
//	public List<Vehicle> viewVehiclesByCategory(String category);
//	public List<Vehicle> viewVehiclesByLocation(String location);
//	public List<Vehicle> viewAllVehicle();
}
