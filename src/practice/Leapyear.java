package practice;

public class Leapyear 
{

	public static void main(String[] args)
	{
		
		int year =2022;
		if((year%400==0)||(year%400==0&&year%100!=0))
		{
			System.out.println("This is leap year");
		}
		else
		{
			System.out.println("This is not leap year");
		}
		

	}

}
