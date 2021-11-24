package com.revature.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.revature.models.Rx;
import com.revature.repositories.RxDao;

public class RxTests {
	
	List<Rx> allRxs = new ArrayList<>();
	Rx rx1 = new Rx(1, "Topomax", 30, "200 mg", "bid");
	Rx rx2 = new Rx(2, "Cymbalta", 30, "90 mg", "qd");
	Rx rx3 = new Rx(3, "Adderall", 30, "25 mg", "am");
	Rx rx4 = new Rx(4, "Latuda", 30, "60 mg", "am");
	
	public RxTests() {
		super();
		allRxs.add(rx1);
		allRxs.add(rx2);
		allRxs.add(rx3);
		allRxs.add(rx4);
	}
	
	private RxDao rd = new ArrayList<>(Arrays.asList(new Rx(rd1, null, 0, null, null))); // needs to be an ArrayList<>() of type Rx?
	
	
	this.user1 = new ArrayList<>(Arrays.asList(new User(user1,empty, empty)));

}
