package org.com.trad.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "trade_details")
public class TradeDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Temporal(TemporalType.DATE)
	private Date tradeDate;

	@Column(name = "stock_name")
	private String stockName;

	@Column(name = "listing_price")
	private BigDecimal listingPrice;

	private int quantity;

	private String type;

	@Column(name = "price_per_unit")
	private BigDecimal pricePerUnit;

	public TradeDetails(Long id, Date tradeDate, String stockName, BigDecimal listingPrice, int quantity, String type,
			BigDecimal pricePerUnit) {
		super();
		this.id = id;
		this.tradeDate = tradeDate;
		this.stockName = stockName;
		this.listingPrice = listingPrice;
		this.quantity = quantity;
		this.type = type;
		this.pricePerUnit = pricePerUnit;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public TradeDetails() {
		super();

	}

	@Override
	public String toString() {
		return "TradeDetails [id=" + id + ", tradeDate=" + tradeDate + ", stockName=" + stockName + ", listingPrice="
				+ listingPrice + ", quantity=" + quantity + ", type=" + type + ", pricePerUnit=" + pricePerUnit + "]";
	}

	public Date getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public BigDecimal getListingPrice() {
		return listingPrice;
	}

	public void setListingPrice(BigDecimal listingPrice) {
		this.listingPrice = listingPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(BigDecimal pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

}
