package com.practice.polymorphism;

class OperatingSystemV11
{
	void android()
	{
		System.out.println("version of androis 11");
	}
}
class OperatingSystemV12 extends OperatingSystemV11
{
	void android()
	{
		System.out.println("version of androis 12");
	}
}

public class Program1
{
	public static void main(String[] args)
	{
		OperatingSystemV12 ref=new OperatingSystemV12();
		ref.android();
	}

}
