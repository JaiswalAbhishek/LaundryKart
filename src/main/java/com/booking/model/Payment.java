package com.booking.model;

import java.util.Date;

public class Payment {

	private int paymentID;
	private String firstPaymentMode;
	private long firstPaymentModeAmount;
	private String secondPaymentMode;
	private Long secondPaymentModeAmount;
	private Date paymentDate;
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(int paymentID, String firstPaymentMode, long firstPaymentModeAmount, String secondPaymentMode,
			Long secondPaymentModeAmount, Date paymentDate) {
		super();
		this.paymentID = paymentID;
		this.firstPaymentMode = firstPaymentMode;
		this.firstPaymentModeAmount = firstPaymentModeAmount;
		this.secondPaymentMode = secondPaymentMode;
		this.secondPaymentModeAmount = secondPaymentModeAmount;
		this.paymentDate = paymentDate;
	}
	public int getPaymentID() {
		return paymentID;
	}
	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}
	public String getFirstPaymentMode() {
		return firstPaymentMode;
	}
	public void setFirstPaymentMode(String firstPaymentMode) {
		this.firstPaymentMode = firstPaymentMode;
	}
	public long getFirstPaymentModeAmount() {
		return firstPaymentModeAmount;
	}
	public void setFirstPaymentModeAmount(long firstPaymentModeAmount) {
		this.firstPaymentModeAmount = firstPaymentModeAmount;
	}
	public String getSecondPaymentMode() {
		return secondPaymentMode;
	}
	public void setSecondPaymentMode(String secondPaymentMode) {
		this.secondPaymentMode = secondPaymentMode;
	}
	public Long getSecondPaymentModeAmount() {
		return secondPaymentModeAmount;
	}
	public void setSecondPaymentModeAmount(Long secondPaymentModeAmount) {
		this.secondPaymentModeAmount = secondPaymentModeAmount;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	@Override
	public String toString() {
		return "Payment [paymentID=" + paymentID + ", firstPaymentMode=" + firstPaymentMode
				+ ", firstPaymentModeAmount=" + firstPaymentModeAmount + ", secondPaymentMode=" + secondPaymentMode
				+ ", secondPaymentModeAmount=" + secondPaymentModeAmount + ", paymentDate=" + paymentDate + "]";
	}
	
	
}
