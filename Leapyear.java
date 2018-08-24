# leapyear
import java.util.*;
class Leapyear
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if((a%4==0) && (a%100!=0))
		{
		System.out.println("leap year");
		}
		else if(a%100==0)
		{
		System.out.println("Not leap year");
		}
		else if(a%400==0)
		{
		System.out.println("leap year");
		}
		else
		{
		System.out.println("Not leap year");
		}
	}
}
