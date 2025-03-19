package org.com.trad.controller;

import java.util.List;

import org.com.trad.model.OrderMaster;
import org.com.trad.model.TradeDetails;
import org.com.trad.service.OrderMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
@CrossOrigin("http://localhost:3000")
public class OrderMasterController {

	private final OrderMasterService orderMasterService;

	public OrderMasterController(OrderMasterService orderMasterService) {
		this.orderMasterService = orderMasterService;
	}

	@GetMapping("/getall-order")
	public ResponseEntity<List<OrderMaster>> getAllOrders() {
		try {
			List<OrderMaster> orders = orderMasterService.getAllOrderDetails();
			return new ResponseEntity<>(orders, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/create-order")
	public ResponseEntity<OrderMaster> createOrder(@RequestBody OrderMaster orderMaster) {
		try {
			OrderMaster createdOrder = orderMasterService.saveOrderDetails(orderMaster);
			return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
}
