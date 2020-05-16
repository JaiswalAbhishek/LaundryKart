package com.booking.dao;

import java.util.List;

import com.booking.model.StoreDetails;

public interface StoreDetailDAO {//CRUD

	public StoreDetails createNewStore(StoreDetails storeDetails);
	public StoreDetails getStoreByID(int storeID);
	public List<StoreDetails> getAllStoreDetails();
	public StoreDetails updateStoreByID(int storeID);
	public StoreDetails updateStoreByObject(StoreDetails storeDetails);
	public boolean deleteAllStoreDetails();
	public StoreDetails deleteStoreByName(String StoreName);
	
	
	


}
