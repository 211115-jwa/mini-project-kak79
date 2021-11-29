package com.revature.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.revature.exceptions.NoRxsExistingException;
import com.revature.models.Rx;
import com.revature.repositories.RxDao;
import com.revature.repositories.RxList;

public class RxTests {
	
	private RxDao rd = new RxList();
	
	@BeforeEach
	public void setup() {
		rd = new RxList();
	}
	
	@Test
	public void getNoRxs() throws NoRxsExistingException{
		assertThrows(NoRxsExistingException.class, () -> rd.getAll(),
				"Expected getAll() to throw, but it didn't");
	}
	
	@Test
	public void getAllRx() throws NoRxsExistingException{
		List<Rx> expected = new ArrayList<>();
		expected = allRxs;
		List<Rx> actual = rd.getAll();
		assertEquals(expected,actual);
	}
	
	@Test
	public void getValidRxId() {
		
	}
	
	
	
}
