package org.com.trad.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_master")
public class OrderMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	@Column(name = "SATUS")
	private String status;


	@Override
	public String toString() {
		return "OrderMaster [id=" + id + ", status=" + status + ", stockName=" + stockName + ", pricePerUnit="
				+ pricePerUnit + ", quantity=" + quantity + ", type=" + type + "]";
	}

	public OrderMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderMaster(Long id, String status, String stockName, BigDecimal pricePerUnit, int quantity, String type) {
		super();
		this.id = id;
		this.status = status;
		this.stockName = stockName;
		this.pricePerUnit = pricePerUnit;
		this.quantity = quantity;
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public BigDecimal getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(BigDecimal pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "stock_name")
	private String stockName;

	@Column(name = "PerUnit_Price")
	private BigDecimal pricePerUnit;

	private int quantity;

	private String type;

}
