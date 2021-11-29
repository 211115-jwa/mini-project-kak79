package com.revature.drivers;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Rx;
import com.revature.repositories.RxDao;
import com.revature.repositories.RxList;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class Driver {
	public static void main(String[] args) {
		
//		Rx rx1 = new Rx(1, "Topomax", 30, "200 mg", "bid");
//		Rx rx2 = new Rx(2, "Cymbalta", 30, "90 mg", "qd");
//		Rx rx3 = new Rx(3, "Adderall", 30, "25 mg", "am");
//		Rx rx4 = new Rx(4, "Latuda", 30, "60 mg", "am");
		
		RxDao rd = new RxList();
		List<Rx> rxs = new ArrayList<>();
		
		Javalin app = Javalin.create(config -> {
            config.addStaticFiles("/public", Location.CLASSPATH);
        }).start(8080);

        app.get("/get-all-rxs", ctx -> {
        	
    		ctx.redirect("/allResult1.html");
        	
        });
        
        app.post("/add-rx", ctx -> {
        	
        	Rx rx = new Rx();
        	        	
        	rx.name = ctx.formParam("name");
        	rx.quantity = Integer.parseInt(ctx.formParam("quantity"));
        	rx.dosage = ctx.formParam("dosage");
        	rx.instructions = ctx.formParam("instructions");
        	
        	Rx rxn = new Rx(rx.name, rx.quantity, rx.dosage, rx.instructions);
        	rd.addNewRx(rxn);
//        	rxs.add(rxn);
        	
        	
        });

		
	}

}
