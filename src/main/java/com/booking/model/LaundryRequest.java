package com.booking.model;

import java.util.Date;

public class LaundryRequest {

	private int requestID;
	private Date orderDate;
	private Date deliveryDate;
	private int numberOfPants;
	private int numberOfShirts;
	private int numberofCoats;
	private int miscellenousCount;
	private Long costOfOrderPlaced;
	private boolean status;//TRUE-completed, FALSE-incomplete service
	public LaundryRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LaundryRequest(int requestID, Date orderDate, Date deliveryDate, int numberOfPants, int numberOfShirts,
			int numberofCoats, int miscellenousCount, Long costOfOrderPlaced, boolean status) {
		super();
		this.requestID = requestID;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.numberOfPants = numberOfPants;
		this.numberOfShirts = numberOfShirts;
		this.numberofCoats = numberofCoats;
		this.miscellenousCount = miscellenousCount;
		this.costOfOrderPlaced = costOfOrderPlaced;
		this.status = status;
	}
	public int getRequestID() {
		return requestID;
	}
	public void setRequestID(int requestID) {
		this.requestID = requestID;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public int getNumberOfPants() {
		return numberOfPants;
	}
	public void setNumberOfPants(int numberOfPants) {
		this.numberOfPants = numberOfPants;
	}
	public int getNumberOfShirts() {
		return numberOfShirts;
	}
	public void setNumberOfShirts(int numberOfShirts) {
		this.numberOfShirts = numberOfShirts;
	}
	public int getNumberofCoats() {
		return numberofCoats;
	}
	public void setNumberofCoats(int numberofCoats) {
		this.numberofCoats = numberofCoats;
	}
	public int getMiscellenousCount() {
		return miscellenousCount;
	}
	public void setMiscellenousCount(int miscellenousCount) {
		this.miscellenousCount = miscellenousCount;
	}
	public Long getCostOfOrderPlaced() {
		return costOfOrderPlaced;
	}
	public void setCostOfOrderPlaced(Long costOfOrderPlaced) {
		this.costOfOrderPlaced = costOfOrderPlaced;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "LaundryRequest [requestID=" + requestID + ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate
				+ ", numberOfPants=" + numberOfPants + ", numberOfShirts=" + numberOfShirts + ", numberofCoats="
				+ numberofCoats + ", miscellenousCount=" + miscellenousCount + ", costOfOrderPlaced="
				+ costOfOrderPlaced + ", status=" + status + "]";
	}
	
	
	
	
}
