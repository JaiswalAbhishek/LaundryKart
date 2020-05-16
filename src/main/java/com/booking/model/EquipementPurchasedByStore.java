package com.booking.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EquipementPurchasedByStore {

	private Map<Integer,Integer> listOfEquipementPurchasedByStore = new HashMap<Integer, Integer>();

	public EquipementPurchasedByStore() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EquipementPurchasedByStore(Map<Integer, Integer> listOfEquipementPurchasedByStore) {
		super();
		this.listOfEquipementPurchasedByStore = listOfEquipementPurchasedByStore;
	}

	public Map<Integer, Integer> getListOfEquipementPurchasedByStore() {
		return listOfEquipementPurchasedByStore;
	}

	public void setListOfEquipementPurchasedByStore(Map<Integer, Integer> listOfEquipementPurchasedByStore) {
		this.listOfEquipementPurchasedByStore = listOfEquipementPurchasedByStore;
	}

	@Override
	public String toString() {
		return "EquipementPurchasedByStore [listOfEquipementPurchasedByStore=" + listOfEquipementPurchasedByStore + "]";
	}
	
	
}
