package kt.springboot.currency.calculation.service.bean;

import java.math.BigDecimal;

public class CurrencyCalculation {
	private Long Id;
	private String from;
	private String to;
	private BigDecimal quantity;
	private BigDecimal conversionMultiple;
	private BigDecimal calculatedAmount;
	private int port;

	public String getFrom() {
		return from;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public BigDecimal getCalculatedAmount() {
		return calculatedAmount;
	}

	public void setCalculatedAmount(BigDecimal calculatedAmount) {
		this.calculatedAmount = calculatedAmount;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public CurrencyCalculation(String from, String to, BigDecimal quantity) {
		super();
		this.from = from;
		this.to = to;
		this.quantity = quantity;
	}

	public CurrencyCalculation() {
		super();
	}

	public CurrencyCalculation(Long Id,String from, String to, BigDecimal quantity, BigDecimal conversionMultiple,
			BigDecimal calculatedAmount,int port) {
		super();
		this.Id=Id;
		this.from = from;
		this.to = to;
		this.quantity = quantity;
		this.conversionMultiple = conversionMultiple;
		this.calculatedAmount = calculatedAmount;
		this.port=port;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
