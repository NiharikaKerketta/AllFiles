package com.demo.collections;

public class Laptop 
{
	int ram;
	String brand;
	double weight;
	public Laptop(int ram,String brand,double weight)
	{
		this.ram=ram;
		this.brand=brand;
		this.weight=weight;
	}
	public String toString()
	{
		return "Laptop [ram="+ ram + ", brand="+brand + ",weight="+weight +"]";
		
	}
}
