package com.booking.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RequestReceivedByStore {
	//Map<StoreId,List<LaundryList>>
	private Map<Integer, List<LaundryRequest>> ListOfRequestReceivedByEachStore = new HashMap<Integer, List<LaundryRequest>>();

	public RequestReceivedByStore() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RequestReceivedByStore(Map<Integer, List<LaundryRequest>> listOfRequestReceivedByEachStore) {
		super();
		ListOfRequestReceivedByEachStore = listOfRequestReceivedByEachStore;
	}

	public Map<Integer, List<LaundryRequest>> getListOfRequestReceivedByEachStore() {
		return ListOfRequestReceivedByEachStore;
	}

	public void setListOfRequestReceivedByEachStore(Map<Integer, List<LaundryRequest>> listOfRequestReceivedByEachStore) {
		ListOfRequestReceivedByEachStore = listOfRequestReceivedByEachStore;
	}

	@Override
	public String toString() {
		return "RequestReceivedByStore [ListOfRequestReceivedByEachStore=" + ListOfRequestReceivedByEachStore + "]";
	}
	
	
	
}
