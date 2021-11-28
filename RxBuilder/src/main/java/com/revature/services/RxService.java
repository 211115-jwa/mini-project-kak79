package com.revature.services;

import java.util.List;

import com.revature.models.Rx;
import com.revature.repositories.RxList;

public class RxService {
	
	List<Rx> allRxs = RxList.allRxs;
	
	private RxList rl = new RxList();

	public void getAll() {
		if(rl != null) {
			"http://localhost:8080/get-all-rxs?" = "http:localhost:8080/allResult1"  
		}else {
			"http://localhost:8080/get-all-rxs?" = "http:localhost:8080/allResult2"
		}
	}
	
	

}
