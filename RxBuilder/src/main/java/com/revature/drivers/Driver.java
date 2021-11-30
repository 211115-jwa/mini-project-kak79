package com.revature.drivers;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Rx;


import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class Driver {
	public static void main(String[] args) {
		
		Rx rx1 = new Rx(1, "Topomax", 30, "200 mg", "2 X a Day");
		Rx rx2 = new Rx(2, "Cymbalta", 30, "90 mg", "1 X a Day at night");
		Rx rx3 = new Rx(3, "Adderall", 30, "25 mg", "1 X a Day at breakfast");
		Rx rx4 = new Rx(4, "Latuda", 30, "60 mg", "1 X a Day at breakfast");
		
		
		Javalin app = Javalin.create(config -> {
            config.addStaticFiles("/public", Location.CLASSPATH);
        }).start(8080);

        app.get("/get-all-rxs", ctx -> {
        	
        	List<Rx> allRxs = new ArrayList<>();
        	allRxs.add(rx1);  //a
        	allRxs.add(rx2);  //b
        	allRxs.add(rx3);  //c
        	allRxs.add(rx4);  //d
        	
        	String htmlString = "<html style= "
        			+ "\"font-family: fantasy; "
        			+ "color: white;"
        			+ "background-color: darkslategrey;"
        			+ "text-align: center; \" > "
        			+ "<h1><u><strong>ALL PRESCRIPTIONS</strong></u></h1>";
        	
        	for (Rx listItem : allRxs) {
        	   htmlString += "<p>" + listItem + "</p>";
        	}
        	        	
        	ctx.html(htmlString);
   
        });
        
        app.get("/get-one-rx-by-name", ctx -> {
        	
        	List<Rx> allRxs = new ArrayList<>();
        	allRxs.add(rx1);  //a
        	allRxs.add(rx2);  //b
        	allRxs.add(rx3);  //c
        	allRxs.add(rx4);  //d
        	
        	String htmlString = "<html style= "
        			+ "\"font-family: fantasy; "
        			+ "color: white;"
        			+ "background-color: darkslategrey;"
        			+ "text-align: center; \" > "
        			+ "<h1><u><strong>DOSAGE AND INSTRUCTIONS</strong></u></h1>";
        	
        	Rx rx = new Rx();
        	
        	rx.name = ctx.formParam("name");
        	
        	System.out.println(rx.name);
        	
        	for (Rx listItem : allRxs) {
        		System.out.println(listItem.name);
        		if(rx.name.equals(listItem.name)) {
        			htmlString += "<p>" + listItem.dosage + " " + listItem.instructions + "</p>";
        		}
        	   
        	}
        	        	
        	ctx.html(htmlString);
   
        });
        
        app.post("/add-rx", ctx -> {
        	
        	List<Rx> allRxs = new ArrayList<>();
        	allRxs.add(rx1);  //a
        	allRxs.add(rx2);  //b
        	allRxs.add(rx3);  //c
        	allRxs.add(rx4);  //d
        	
        	Rx rx = new Rx();
        	        	
        	rx.name = ctx.formParam("name");
//        	rx.quantity = Integer.parseInt(ctx.formParam("quantity"));
        	rx.dosage = ctx.formParam("dosage");
        	rx.instructions = ctx.formParam("instructions");
        	
        	Rx rxn = new Rx(rx.name, rx.dosage, rx.instructions);
        	allRxs.add(rxn);
        	
        	String htmlString = "<html style= "
        			+ "\"font-family: fantasy; "
        			+ "color: white;"
        			+ "background-color: darkslategrey;"
        			+ "text-align: center; \" > "
        			+ "<h1><u><strong>ALL PRESCRIPTIONS</strong></u></h1>";
        	
        	for(Rx eachRx : allRxs) {
        		htmlString += "<p>" + eachRx.name 
        					+ " " + eachRx.dosage + " "
        					+ eachRx.instructions + "</p>";
        	}
        	
        	ctx.html(htmlString);
        	
        });

		
	}

}
