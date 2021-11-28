package com.revature.controllers;

import java.util.HashMap;
import java.util.Map;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.revature.models.Rx;
import com.revature.repositories.RxList;
import com.revature.services.RxService;

import io.javalin.apibuilder.CrudHandler;
import io.javalin.http.Context;

public class RxController {

	RxService rs = new RxService();	


	public void getAll() {
/*
 * 		called in Driver
 * 		RxController rc.getAll()
 * 		
 * 		call RxService.getAll()
 * 		in RxService.getAll
 * 		use control statement to say if there is data to display show page a if not page b
 */
		rs.getAll();
	}


	public void getOne() {
	   
		
	}


	public void create() {

	}

	

	public void update() {

	}
	
	

	public void delete() {

		
	}
	

}
