package com.revature.repositories;

import java.util.List;

import com.revature.models.Rx;

public interface RxDao {
	
	List<Rx> getAll();
	
	int getRxId(String name, List<Rx> allRxs);
	
	Rx addNewRx(Rx rx);
	
	boolean deleteRx(int rxId);

}
