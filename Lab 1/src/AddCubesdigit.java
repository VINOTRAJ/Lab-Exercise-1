

public class AddCubesdigit {
	public static int sumofcubes(int num)
	{int add=0;
		int cuberoot=num*num*num;
		while(cuberoot!=0)
		{
			int rem=cuberoot%10;
			add=add+rem;
			cuberoot=cuberoot/10;
		}
		return add;
	}
	public static void main(String[] args)
	{
		int num=10;
		for(int i=1;i<=num;i++)
		{
		int add=sumofcubes(i);
		System.out.println(add);
		}
	}

}
