package com.revature.models;

import java.util.Objects;

public class Rx {
	
	protected int id;
	protected String name;
	protected int quantity;
	protected String dosage;
	protected String instructions;
	
	public Rx(int id, String name, int quantity, String dosage, String instructions) {
		super();
		this.id = id;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Rx [id=" + id + ", name=" + name + ", quantity=" + quantity + ", dosage=" + dosage + ", instructions="
				+ instructions + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dosage, id, instructions, name, quantity);
	}

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
	
	

}
