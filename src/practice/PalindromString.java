package practice;



public class PalindromString 
{

	public static void main(String[] args) 
	{
		String str="MADAM";
		String rev=null;
		for(int i=str.length()-1;i>=0;i--)
		
		{
			
			System.out.print(str.charAt(i));			
		}
		System.out.println();
		if(str.equals(rev))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		

	}

}
