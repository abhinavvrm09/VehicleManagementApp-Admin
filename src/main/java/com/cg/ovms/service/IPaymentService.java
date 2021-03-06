package com.cg.ovms.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.ovms.entities.Booking;
import com.cg.ovms.entities.Payment;
import com.cg.ovms.entities.Vehicle;

@Service
public interface IPaymentService {

	public Booking addPayment(Payment payment);
	public Booking cancelPayment(Payment p);
	public Booking viewPayment(Booking b);
	public List<Booking> viewAllPayments();
	public double calculateMonthlyRevenue(LocalDate d1,LocalDate d2);
	public double calculateTotalPayment(Vehicle v);
	public void cancelPaymentById(int paymentId);
	public Payment viewPaymentByBooking(Booking booking);
	public List<Payment> viewAllPaymentsByVehicle(Vehicle vehicle);
}
