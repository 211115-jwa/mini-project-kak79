package com.revature.drivers; //drivers package

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Rx;
import com.revature.util.FormatUtil;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class Driver {
	public static void main(String[] args) {

		Rx rx1 = new Rx(1, "Topomax", 30, "200 mg", "2 X a Day");
		Rx rx2 = new Rx(2, "Cymbalta", 30, "90 mg", "1 X a Day at night");
		Rx rx3 = new Rx(3, "Adderall", 30, "25 mg", "1 X a Day at breakfast");
		Rx rx4 = new Rx(4, "Latuda", 30, "60 mg", "1 X a Day at breakfast");

		/*
		 * initial data for the List<Rx>
		 */

		FormatUtil str = new FormatUtil(); //initialize a new FormatUtil instance named str

		List<Rx> allRxs = new ArrayList<>();
		allRxs.add(rx1); // a
		allRxs.add(rx2); // b
		allRxs.add(rx3); // c
		allRxs.add(rx4); // d
		
		/*
		 * adding data to a list named allRxs
		 */

		Javalin app = Javalin.create(config -> {
			config.addStaticFiles("/public", Location.CLASSPATH);
		}).start(8080);
		
		/*
		 * started a new instance of a Javalin application named app on the port 8080
		 * with the files at the path /public
		 */

		app.get("/get-all-rxs", ctx -> {

			String a = "";

			String b = str.htmlString(a);
			System.out.println("b" + b);
			String c = str.h1ForGetAll(b);
			System.out.println("c" + c);

			for (Rx listItem : allRxs) {
				c += "<p>" + listItem + "</p>";
			}

			ctx.html(c);

		});
		
		/*
		 *  calling the function get on app 
		 *  going to the uri "/get-all-rxs"
		 *  
		 *  ctx arrow function
		 *  in the body of the arrow function:
		 *  declare a new string a and assign it an empty string
		 *  
		 *  declare a new string b and assign it to the function str.htmlString(a)
		 *  which adds some stuff to b
		 *  print to the console the letter b and the string b for debugging
		 *  
		 *  declare a new string c and assign it to the function str.h1ForGetAll(b)
		 *  which adds some stuff to c
		 *  print to the console the letter c and the string c for debugging
		 *  
		 *  you print the letters so you know what is printing to the console
		 *  in what order
		 *  
		 *  do an enhanced for loop
		 *  looping through allRxs calling each Rx listItem
		 *  as it loops through it will append "<p>" + listItem + "</p>" to 
		 *  string c
		 *  
		 *  call ctx.html(c) will return the contents of c to
		 *  "/get-all-rxs?" 
		 */
		

		app.get("/get-one-rx-by-name", ctx -> {

			String d = "";

			String e = str.htmlString(d);
			System.out.println("e" + e);
			String f = str.h1ForGetOne(e);
			System.out.println("f" + f);

			Rx rx = new Rx();

			rx.name = ctx.queryParam("medName");

			for (Rx listItem : allRxs) {
				if (rx.name.equals(listItem.name)) {
					f += "<p>" + listItem.dosage + " " + listItem.instructions + "</p>";
				}

			}

			ctx.html(f);

		});
		
		/*
		 *  calling the function get on app 
		 *  going to the uri "/get-one-rx-by-name"
		 *  
		 *  ctx arrow function
		 *  in the body of the arrow function:
		 *  declare a new string d and assign it an empty string
		 *  
		 *  declare a new string e and assign it to the function str.htmlString(d)
		 *  which adds some stuff to e
		 *  print to the console the letter e and the string e for debugging
		 *  
		 *  declare a new string f and assign it to the function str.h1ForGetOne(e)
		 *  which adds some stuff to f
		 *  print to the console the letter f and the string f for debugging
		 *  
		 *  you print the letters so you know what is printing to the console
		 *  in what order
		 *  
		 *  do an enhanced for loop
		 *  looping through allRxs calling each Rx listItem
		 *  as it loops through it will append "<p>" + listItem.dosage + " " 
		 *  + listItem.instructions + "</p>" to string f
		 *  
		 *  call ctx.html(f) will return the contents of f to
		 *  "/get-one-rx-by-name?" 
		 */
		

		app.post("/add-rx", ctx -> {

			String g = "";

			String h = str.htmlString(g);
			System.out.println("h" + h);
			String i = str.h1ForGetAll(h);
			System.out.println("i" + i);

			Rx rx = new Rx();

			rx.id = rx.setId(allRxs.size() + 1);
			rx.name = ctx.formParam("name");
			rx.quantity = Integer.parseInt(ctx.formParam("quantity"));
			rx.dosage = ctx.formParam("dosage");
			rx.instructions = ctx.formParam("instructions");

			Rx rxn = new Rx(rx.id, rx.name, rx.quantity, rx.dosage, rx.instructions);
			allRxs.add(rxn);

			for (Rx listItem : allRxs) {
				i += "<p>" + listItem + "</p>";
			}

			ctx.html(i);

		});
		
		/*
		 *  calling the function post on app 
		 *  going to the uri "/add-rx"
		 *  
		 *  ctx arrow function
		 *  in the body of the arrow function:
		 *  declare a new string g and assign it an empty string
		 *  
		 *  declare a new string h and assign it to the function str.htmlString(g)
		 *  which adds some stuff to h
		 *  print to the console the letter h and the string h for debugging
		 *  
		 *  declare a new string i and assign it to the function str.h1ForGetAll(h)
		 *  which adds some stuff to i
		 *  print to the console the letter i and the string i for debugging
		 *  
		 *  you print the letters so you know what is printing to the console
		 *  in what order
		 *  
		 *  do an enhanced for loop
		 *  looping through allRxs calling each Rx listItem
		 *  as it loops through it will append "<p>" + listItem + "</p>" to 
		 *  string i
		 *  
		 *  call ctx.html(i) will return the contents of i to
		 *  "/add-rx?" 
		 */
		

	}

}
