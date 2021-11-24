package com.revature.repositories;

import java.util.List;

import com.revature.models.Rx;

public interface RxDao {
	
	List<Rx> getAll();
	
	int getRxId(Rx rx);
	
	Rx addNewRx(Rx rx);
	
	boolean deleteRx(int rxId);

}
