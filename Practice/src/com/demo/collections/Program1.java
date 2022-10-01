package com.demo.collections;

import java.util.LinkedList;

public class Program1 
{
	public static void main(String[] args) 
	{
		LinkedList a1=new LinkedList();
		
		a1.add(new Watch("mi",'f',2000.20));
		a1.add(new Mobile("vivo",'4','a'));
		a1.add(new Laptop(16,"hp",25.36));
		a1.add(new Watch("mi",'f',2000.20));
		a1.add(new Mobile("vivo",'4','a'));
		a1.add(new Laptop(16,"hp",25.36));
		a1.add(new Watch("mi",'f',2000.20));
		a1.add(new Mobile("vivo",'4','a'));
		a1.add(new Laptop(16,"hp",25.36));
		a1.add(new Mobile("vivo",'4','a'));
		
		a1.add(5,"java");
		
		System.out.println(a1.size());
		
		for (int i=0; i <a1.size();i++)
		{
			Object ob=a1.get(i);
			System.out.println(ob);
		}
		System.out.println("2nd array list");
			
			LinkedList a12=new LinkedList(a1);
			
			for (int i=0; i <a12.size();i++)
			{
				Object ob=a1.get(i);
				System.out.println(ob);	
	}
			
	}
}
