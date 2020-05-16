package com.booking.model;

import java.util.HashMap;
import java.util.Map;

public class RequestRecordedOnPayment {
	//Map<RequestID,paymentID>
	Map<Integer, Integer> PaymentForGivenRequest = new HashMap<Integer, Integer>();

	public RequestRecordedOnPayment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RequestRecordedOnPayment(Map<Integer, Integer> paymentForGivenRequest) {
		super();
		PaymentForGivenRequest = paymentForGivenRequest;
	}

	public Map<Integer, Integer> getPaymentForGivenRequest() {
		return PaymentForGivenRequest;
	}

	public void setPaymentForGivenRequest(Map<Integer, Integer> paymentForGivenRequest) {
		PaymentForGivenRequest = paymentForGivenRequest;
	}

	@Override
	public String toString() {
		return "RequestRecordedOnPayment [PaymentForGivenRequest=" + PaymentForGivenRequest + "]";
	}
	
	
}
