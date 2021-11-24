package com.revature.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.revature.models.Rx;
import com.revature.repositories.RxDao;
import com.revature.repositories.RxList;

public class RxTests {
	
	List<Rx> allRxs = RxList.allRxs;
	
	private RxDao rd = new RxList();
	
	@BeforeEach
	public void setup() {
		rd = new RxList();
	}
	
	@Test
	public void getAllRx() {
		List<Rx> expected = new ArrayList<>();
		expected = allRxs;
		List<Rx> actual = rd.getAll();
		assertEquals(expected,actual);
	}
	
	@Test
	public void getValidRxId() {
		
	}
	
	
	
}
