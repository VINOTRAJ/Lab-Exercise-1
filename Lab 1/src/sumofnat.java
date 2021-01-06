import java.util.Scanner;

public class sumofnat {
	public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	int num=5;
	int sum=calculateSum(num);
	System.out.println("Sum of natural number is "+sum);
	}
private static int calculateSum(int num)
{
	int add=0;

	for(int i=1;i<=num;i++)
	{
		if(i%3==0 || i%5==0)
		{
			add=add+i;
		}
	}
	return add;
}
}
