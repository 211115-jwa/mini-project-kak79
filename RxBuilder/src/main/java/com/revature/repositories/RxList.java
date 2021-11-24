package com.revature.repositories;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Rx;

public class RxList implements RxDao {
	
	public static List<Rx> allRxs = new ArrayList<>();
	Rx rx1 = new Rx(1, "Topomax", 30, "200 mg", "bid");
	Rx rx2 = new Rx(2, "Cymbalta", 30, "90 mg", "qd");
	Rx rx3 = new Rx(3, "Adderall", 30, "25 mg", "am");
	Rx rx4 = new Rx(4, "Latuda", 30, "60 mg", "am");
	
	public RxList() {
		super();
		allRxs.add(rx1);
		allRxs.add(rx2);
		allRxs.add(rx3);
		allRxs.add(rx4);
	}
		
	@Override
	public List<Rx> getAll() {
		return RxList.allRxs;
	}

	@Override
	public int getRxId(String name, List<Rx> allRxs) {
		int id = -1;
	    for (Rx rx : allRxs) {
	        if (rx.getName().equals(name)) {
	            id = rx.getId();
	            return id;
	        }
	    }
	    System.out.println(id);
	    return id;
	}

	@Override
	public Rx addNewRx(Rx rx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteRx(int rxId) {
		// TODO Auto-generated method stub
		return false;
	}

}
