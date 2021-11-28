package com.revature.drivers;

import com.revature.controllers.RxController;

import io.javalin.Javalin;

public class Driver {
	public static void main(String[] args) {
		
		
		RxController rc = new RxController();

		
		Javalin app = Javalin.create().start(8080);

        app.get("/getAll", ctx -> {
        	rc.getAll();
        });

		
	}

}
