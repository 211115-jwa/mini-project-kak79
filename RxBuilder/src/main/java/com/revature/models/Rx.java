package com.revature.models;  // name of the package

import java.util.Objects;

public class Rx {  // name of the class
	
	public int id; 
	public String name;
	public int quantity;
	public String dosage;
	public String instructions;
	
	/*
	 * 	lines 7 through 11 are where I declare the variables the make up a prescription
	 */
	
	public Rx(int id, String name, int quantity, String dosage, String instructions) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.dosage = dosage;
		this.instructions = instructions;
	}
	
	public Rx(String name, int quantity, String dosage, String instructions) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.dosage = dosage;
		this.instructions = instructions;
	}

	public Rx(int id) {
		super();
		this.id = id;
	}

	public Rx(String name, String dosage, String instructions) {
		super();
		this.name = name;
		this.dosage = dosage;
		this.instructions = instructions;
	}
	
	public Rx() {
		super();
	}
	
	/*
	 *  lines 17 - 48 are my 5 constructors.  I ended up not needing this many,
	 *  but I wasn't sure what I would need when I built them.  Having different
	 *  types of Rx() available for use comes in handy as you are coding :D
	 */

	public int getId() {
		return id;
	}

	public int setId(int id) {
		return this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	/*
	 *  lines 56 - 94 are my getters and setters.  I didn't necessarily need all of them 
	 *  because I made my Rx variables public, but I did use setId and getId.
	 *  They can come in handy.
	 */
	
	@Override
	public String toString() {
		return "Rx [id=" + id + ", name=" + name + ", quantity=" + quantity + ", dosage=" + dosage + ", instructions="
				+ instructions + "]";
	}
	
	/*
	 * to string method - inherited from Object class
	 */

	@Override
	public int hashCode() {
		return Objects.hash(dosage, id, instructions, name, quantity);
	}
	
	/*
	 * hashCode - inherited from Object class
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rx other = (Rx) obj;
		return Objects.equals(dosage, other.dosage) && id == other.id
				&& Objects.equals(instructions, other.instructions) && Objects.equals(name, other.name)
				&& quantity == other.quantity;
	}
	
	/*
	 * equals - inherited from Object class
	 */

}
