package com.cg.ovms.repository;

import com.cg.ovms.service.IAdminService;
import com.cg.ovms.service.IBookingService;
import com.cg.ovms.service.ICustomerService;
import com.cg.ovms.service.IPaymentService;
import com.cg.ovms.service.IVehicleService;

public interface IAdminRepository
		extends IBookingService, ICustomerService, IPaymentService, IVehicleService, IAdminService {

}
