package com.booking.model;

import java.util.HashMap;
import java.util.Map;

public class StoreManagedByManager {
	//Map<StoreId,managerID>
	private Map<Integer, Integer> ListOfStoresUnderManagers = new HashMap<Integer, Integer>();

	public StoreManagedByManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StoreManagedByManager(Map<Integer, Integer> listOfStoresUnderManagers) {
		super();
		ListOfStoresUnderManagers = listOfStoresUnderManagers;
	}

	public Map<Integer, Integer> getListOfStoresUnderManagers() {
		return ListOfStoresUnderManagers;
	}

	public void setListOfStoresUnderManagers(Map<Integer, Integer> listOfStoresUnderManagers) {
		ListOfStoresUnderManagers = listOfStoresUnderManagers;
	}

	@Override
	public String toString() {
		return "StoreManagedByManager [ListOfStoresUnderManagers=" + ListOfStoresUnderManagers + "]";
	}

}
