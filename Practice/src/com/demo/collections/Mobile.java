package com.demo.collections;

public class Mobile
{
	String brand;
	int ram;
	char os;
	public Mobile(String brand,int ram,char os)
	{
		this.brand=brand;
		this.ram=ram;
		this.os=os;
	}
	public String toString()
	{
		return "Mobile [brand="+brand + ",ram="+ram + ",os="+os +"]";
		
	}
}
