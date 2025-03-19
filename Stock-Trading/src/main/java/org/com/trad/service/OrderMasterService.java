package org.com.trad.service;

import java.util.Date;

import java.util.List;

import org.com.trad.model.OrderMaster;

import org.com.trad.repository.OrderMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderMasterService {
	
	
	@Autowired
	private  OrderMasterRepository orderMasterRepository;
	
	public List<OrderMaster> getAllOrderDetails() {
		return orderMasterRepository.findAll();
	}

	public OrderMaster saveOrderDetails(OrderMaster orderDetails) {
		
		return orderMasterRepository.save(orderDetails);}
	/*



	
	
	public List<OrderMaster> getAllOrderDetails() {
		return orderMasterRepository.findAll();
	}

	public OrderMaster saveOrderDetails(OrderMaster orderDetails) {
		
		return orderMasterRepository.save(orderDetails);
	}*/
	/*
	//@Transactional
	public OrderMaster createOrder(OrderMaster orderMaster) {
		// Check if the TradeDetails is already present in the database
		TradeDetails tradeDetails = orderMaster.getTradeDetails();
		if (tradeDetails != null && tradeDetails.getId() == null) {
			// If TradeDetails is not yet saved, save it first
			tradeDetails = tradeDetailsRepository.save(tradeDetails);
			orderMaster.setTradeDetails(tradeDetails); // Update the reference with the saved instance
		}

		// Save the OrderMaster
		return orderMasterRepository.save(orderMaster);
	}

	public List<OrderMaster> getAllOrders() {
		return orderMasterRepository.findAll();
	}
*/
}