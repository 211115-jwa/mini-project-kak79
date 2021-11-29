package com.revature.services;

import java.util.List;

import com.revature.models.Rx;
import com.revature.repositories.RxList;

public class RxService {
	
	List<Rx> allRxs = RxList.allRxs;
	
	RxList rl = new RxList();

	public void getAll() {
		String y = "http://localhost:8080/get-all-rxs?";
		if(rl != null) {
			y = "http:localhost:8080/allResult1"; 
		}else {
			y = "http:localhost:8080/allResult2";
		}
	}
	
	

}
