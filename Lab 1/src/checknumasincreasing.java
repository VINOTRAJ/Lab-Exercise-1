/*
 * @author VINOTH.R
 * Desc:Create a method to check if a number is an increasing number
 */
import java.util.*;
public class checknumasincreasing {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	
	int number=23456;
	boolean check=checkNumber(number);
	
}
private static boolean checkNumber(int number)
{int i=0,min=100000,val;
int [] rem=new int[100];
	//String val=number.toString();
	while(number!=0)
	{
		 rem[i]=number%10;
		 number=number/10;
		 i++;
				 }
	for(int j=i;j>0;j--)
	{
		if(rem[j]<min)
		{
			min=rem[j];
		}
		else
		{
			val=1;
			//return 1;
			return (int)(1);
			
			//System.out.exit(0);
		}
		return val;
	}
}
}
