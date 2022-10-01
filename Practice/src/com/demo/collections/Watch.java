package com.demo.collections;

public class Watch 
{
	String brand;
	char type;
	double cost;
	public Watch(String brand,char type,double cost)
	{
		this.brand=brand;
		this.type=type;
		this.cost=cost;
	}
	public String toString()
	{
		return "Watch [brand="+ brand + ",type="+type + ",cost="+cost +"]";
		
	}
	
}
