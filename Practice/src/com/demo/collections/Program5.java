package com.demo.collections;

//import java.util.HashSet;
import java.util.LinkedHashSet;

class CurrencyNote
{
	int serialno;
	int value;
	String colour;
	
	public CurrencyNote(int serialno,int value,String colour)
	{
		this.serialno=serialno;
		this.value=value;
		this.colour=colour;
	}
	public String toString()
	{
		return "CurrencyNote [serialno=" + serialno + ", value=" + value + ",colour=" + colour + "]";
	}
	public int hashCode()
	{
		return serialno;
	}
	public boolean equals(Object ob)
	{
		CurrencyNote ct=(CurrencyNote)ob;
		return this.serialno==ct.serialno;
	}
	
}

public class Program5 
{
	public static void main(String[] args)
	{
		CurrencyNote c1=new CurrencyNote(1234,2000,"pink");
		CurrencyNote c2=new CurrencyNote(1234,2000,"pink");
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1==c2);
		
		boolean res=c1.equals(c2);
		System.out.println(res);
		
		LinkedHashSet hs=new LinkedHashSet();
		//HashSet hs=new HashSet();
		hs.add(c1);
		hs.add(c2);
		
		System.out.println("size"+hs.size());
		for (Object ob : hs)
		{
			System.out.println(ob);
		}
	}
}
