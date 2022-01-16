package mypackage;

import java.util.Scanner;

class House
{
	public int height;
	public int width;
	
	public House()
	{
		
	}
	
	public House(int height, int width)
	{
		this.height=height;
		this.width=width;
	}
	
	public void readData()
	{		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter height:");
		height=obj.nextInt();
		System.out.println("Enter width");
		width=obj.nextInt();
	}
	
	public void printData()
	{
		System.out.println("Height="+height);
		System.out.println("Width="+width);
	}
}

public class MyClass 
{
	public static void main(String[] args) 
	{
		int height=10;
		int width=10;
		
		House h1=new House(height,width);
		House h2=new House(height,width);
		House h3=new House(height,width);
		House h4=new House(height,width);
		
		House builderHouse = new House();
		builderHouse.readData();
		builderHouse.printData();

	}
}

