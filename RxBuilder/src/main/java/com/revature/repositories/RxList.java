package com.revature.repositories;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Rx;

public class RxList implements RxDao {

		
	@Override
	public List<Rx> getAll() {
		return RxList.allRxs;
	}

	@Override
	public Rx getRxId(String name, List<Rx> allRxs) {
		
	    return null;
	}

	@Override
	public Rx addNewRx(List<Rx> rx) {

// 		employee.setId(iterator);
// 		// adding the new employee to the array
// 		tempArray[iterator] = employee;
// 		/*
// 		 * assign the newly created array to employees
// 		 */
// 		employees = tempArray;
// 		System.out.println(employees);
// 		return iterator;
		Rx[] tempArr =  rx.toArray();
		Rx[] tempAr1 = new Rx[tempArr.length +1];
		
		int tempSize = 0;
		for(; tempSize < tempArr.length; tempSize ++) {
			tempAr1[tempSize] = tempArr[tempSize];
		}
		
		
		
		
		return null;
	}

	@Override
	public boolean deleteRx(int rxId) {
		// TODO Auto-generated method stub
		return false;
	}

}
