package org.com.trad.service;

import java.util.List;

import java.util.Optional;

import org.com.trad.exception.ResourceNotFoundException;
import org.com.trad.model.TradeDetails;
import org.com.trad.repository.TradeDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class TradeDetailsService {
	@Autowired
	private TradeDetailsRepository tradeDetailsRepository;

	public List<TradeDetails> getAllTradeDetails() {
		return tradeDetailsRepository.findAll();
	}

	public TradeDetails saveTradeDetails(TradeDetails tradeDetails) {
		// TradeDetails tradeDetails=new TradeDetails();
		tradeDetails.setTradeDate(new Date());
		return tradeDetailsRepository.save(tradeDetails);
	}

	public TradeDetails getTradeDetailsById(Long id) {

		return tradeDetailsRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("TradeDetails", "id", id));
	}

	public TradeDetails updateTradeDetails(TradeDetails tradeDetails, Long id) {

		// we need to check whether employee with given id is exist in DB or not

		TradeDetails existingTradeDeatils = tradeDetailsRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("TradeDetails", "id", id));

		existingTradeDeatils.setListingPrice(tradeDetails.getListingPrice());
		existingTradeDeatils.setPricePerUnit(tradeDetails.getPricePerUnit());
		existingTradeDeatils.setStockName(tradeDetails.getStockName());
		existingTradeDeatils.setQuantity(tradeDetails.getQuantity());

		existingTradeDeatils.setTradeDate(tradeDetails.getTradeDate());

		existingTradeDeatils.setType(tradeDetails.getType());
		tradeDetailsRepository.save(existingTradeDeatils);

		return existingTradeDeatils;
	}

	public void deleteTradeDetails(Long id) {
		tradeDetailsRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("TradeDetails", "id", id));
		tradeDetailsRepository.deleteById(id);
	}

}
