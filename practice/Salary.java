package mypackage;

abstract class Salary
{
	public int a;
	public int GetHRA(int basic)
	{
		a=5;
		return 40*basic/100;
	}
	public int GetPF(int basic)
	{
		return 12*basic/100;
	}
	public abstract int CA();
	public abstract int SA();
}


class Infosys extends Salary
{	
	
	public int CA()
	{
		return 5000;
	}
	
	public int SA()
	{
		return 12000;
	}
}

class Microsoft extends Salary
{
	public int CA()
	{
		return 12000;
	}
	public int SA()
	{
		return 24000;
	}
}
class Accenture extends Salary
{
	public int CA()
	{
		return 6000;
	}
	public int SA()
	{
		return 16000;
	}	
}

class Capgemini extends Salary
{
	public int CA()
	{
		return 4000;
	}
	public int SA()
	{
		return 18000;
	}
}
public class MyClass 
{
	public static int CalculateSalary(Salary obj)
	{
		int sal = obj.CA()+obj.GetHRA(40000)+obj.GetPF(40000)+obj.SA();
		return sal;
	}
	public static void main(String[] args) 
	{
		/*
		Salary obj = new Infosys();
		
		int infosysSalary = obj.CA()+obj.GetHRA(40000)+obj.GetPF(40000)+obj.SA();
		
		obj = new Microsoft();
		
		int microsoftSalary = obj.CA()+obj.GetHRA(40000)+obj.GetPF(40000)+obj.SA();
		
		obj = new Capgemini();
		
		int capgeminiSalary = obj.CA()+obj.GetHRA(40000)+obj.GetPF(40000)+obj.SA();
		*/
		
		System.out.println(CalculateSalary(new Infosys()));
		
		System.out.println(CalculateSalary(new Microsoft()));
		
		System.out.println(CalculateSalary(new Accenture()));

	}
}


