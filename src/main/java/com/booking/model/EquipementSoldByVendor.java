package com.booking.model;

import java.util.HashMap;
import java.util.Map;

public class EquipementSoldByVendor {

	// Map<EquipementId,VendorID>
	private Map<Integer, Integer> listOfEquipementSoldByVendor = new HashMap<Integer, Integer>();

	public EquipementSoldByVendor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EquipementSoldByVendor(Map<Integer, Integer> listOfEquipementSoldByVendor) {
		super();
		this.listOfEquipementSoldByVendor = listOfEquipementSoldByVendor;
	}

	public Map<Integer, Integer> getListOfEquipementSoldByVendor() {
		return listOfEquipementSoldByVendor;
	}

	public void setListOfEquipementSoldByVendor(Map<Integer, Integer> listOfEquipementSoldByVendor) {
		this.listOfEquipementSoldByVendor = listOfEquipementSoldByVendor;
	}

	@Override
	public String toString() {
		return "EquipementSoldByVendor [listOfEquipementSoldByVendor=" + listOfEquipementSoldByVendor + "]";
	}
	
	
}
