package com.jsp.mobile;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Mobile 
{
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY)
	private int id;
	private String Brand;
	private double cost;
	private String colour;
	private String Ram;
	@OneToMany
	private List<Sim> sims;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getRam() {
		return Ram;
	}
	public void setRam(String ram) {
		Ram = ram;
	}
	public List<Sim> getSims() {
		return sims;
	}
	public void setSims(List<Sim> sims) {
		this.sims = sims;
	}
}