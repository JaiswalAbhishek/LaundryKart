package com.booking.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class StoreDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int storeID;
	private String storeAddress;
	private long storeContactNumberList;
	public StoreDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StoreDetails(int storeID, String storeAddress,long storeContactNumberList) {
		super();
		this.storeID = storeID;
		this.storeAddress = storeAddress;
		this.storeContactNumberList = storeContactNumberList;
	}
	public int getStoreID() {
		return storeID;
	}
	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}
	public String getStoreAddress() {
		return storeAddress;
	}
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}
	public long getStoreContactNumberList() {
		return storeContactNumberList;
	}
	public void setStoreContactNumberList(long storeContactNumberList) {
		this.storeContactNumberList = storeContactNumberList;
	}
	@Override
	public String toString() {
		return "StoreDetails [storeID=" + storeID + ", storeAddress=" + storeAddress + ", storeContactNumberList="
				+ storeContactNumberList + "]";
	}
	
}
