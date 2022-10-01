package com.practice.inheritance;

class Program1
{
	String s1;
	Program1(String s1)
	{
		System.out.println("P1 st arg cons");
		this.s1=s1;
	}
}
class Program2 extends Program1
{
	Program2()
	{
		super("concentrate");
		System.out.println("P2 zero arg const");
	}
}
class Program3 extends Program2
{
	double b;
	int a;
	Program3(double b,int a)
	{
		System.out.println("P3 double & int arg const");
		this.b=b;
		this.a=a;
	}
}
class Program4 extends Program3
{
	char ch;
	Program4(char ch)
	{
		super(1.2,25);
		System.out.println("P4 const");
		this.ch=ch;
	}
}
public class MainClass1 
{

	public static void main(String[] args)
	{
		Program4 ref=new Program4('d');
		System.out.println("s1="+ref.s1);
		System.out.println("b="+ref.b);
		System.out.println("a="+ref.a);
		System.out.println("ch="+ref.ch);
		
	}

}
