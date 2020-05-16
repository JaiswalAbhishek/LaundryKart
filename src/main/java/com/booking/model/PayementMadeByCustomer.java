package com.booking.model;

import java.util.HashMap;
import java.util.Map;

public class PayementMadeByCustomer {
	//Map<CustomerId,Payment>
	private Map<String,Payment> paymentDoneByUser = new HashMap<String,Payment>();

	public PayementMadeByCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PayementMadeByCustomer(Map<String, Payment> paymentDoneByUser) {
		super();
		this.paymentDoneByUser = paymentDoneByUser;
	}

	public Map<String, Payment> getPaymentDoneByUser() {
		return paymentDoneByUser;
	}

	public void setPaymentDoneByUser(Map<String, Payment> paymentDoneByUser) {
		this.paymentDoneByUser = paymentDoneByUser;
	}

	@Override
	public String toString() {
		return "CustomerPayment [paymentDoneByUser=" + paymentDoneByUser + "]";
	}
	
	
	
}
