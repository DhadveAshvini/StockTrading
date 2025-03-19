package org.com.trad.controller;

import java.util.List;

import org.com.trad.model.TradeDetails;
import org.com.trad.repository.TradeDetailsRepository;
import org.com.trad.service.TradeDetailsService;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
@CrossOrigin("http://localhost:3000")
public class TradeDetailsController {
	@Autowired
	private TradeDetailsService tradeDetailsService;

	

	@GetMapping("/getalltrad")
	public List<TradeDetails> getAllTradeDetails() {
		return tradeDetailsService.getAllTradeDetails();
	}

	@PostMapping("/create-trad")
	public ResponseEntity<TradeDetails> createTradeDetails(@RequestBody TradeDetails tradeDetails) {
		return new ResponseEntity<TradeDetails>(tradeDetailsService.saveTradeDetails(tradeDetails), HttpStatus.OK);
	}

	@GetMapping("/getTradeById/{id}")
	public ResponseEntity<TradeDetails> getTradeById(@PathVariable Long id) {

		return new ResponseEntity<TradeDetails>(tradeDetailsService.getTradeDetailsById(id), HttpStatus.OK);

	}

	@PutMapping("/update/tradeDetails/{id}")
	public ResponseEntity<TradeDetails> updateTradeDetails(@RequestBody TradeDetails tradeDetails,
			@PathVariable Long id) {

		return new ResponseEntity<TradeDetails>(tradeDetailsService.updateTradeDetails(tradeDetails, id),
				HttpStatus.OK);

	}

	@DeleteMapping("/deleteTradeDetails/{id}")
	public ResponseEntity<String> deleteTradeDetails(@PathVariable Long id) {
		tradeDetailsService.deleteTradeDetails(id);
		return new ResponseEntity<String>("Trade deleted successfully!.", HttpStatus.OK);
	}

}
