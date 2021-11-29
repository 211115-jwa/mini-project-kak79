package com.revature.drivers;

import java.util.List;

import com.revature.controllers.RxController;
import com.revature.models.Rx;
import com.revature.repositories.RxList;

import io.javalin.Javalin;

public class Driver {
	public static void main(String[] args) {
		
		List<Rx> allRxs = RxList.allRxs;
		RxController rc = new RxController();
		
		
		
		Javalin app = Javalin.create().start(8080);

        app.get("/getAll", ctx -> {
        	
        	String text = "";
        	
        	for(Rx rx : allRxs) {
        		if (rx != null) {
        			text = rx.toString() + "<br>";
        		}else {
        			
        		}
        	}
        });

		
	}

}
