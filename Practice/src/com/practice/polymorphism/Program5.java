package com.practice.polymorphism;

class CarSeller
{
	void car()
	{
		System.out.println("old car");
	}
}
class CarBuyer extends CarSeller
{
	void car()
	{
		System.out.println("renovated car");
	}
}
public class Program5
{
	public static void main(String[] args)
	{
		CarSeller cs=new CarSeller();
		cs.car();
	}

}
