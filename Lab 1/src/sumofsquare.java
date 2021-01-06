
public class sumofsquare {
	public static void main(String[] args)
	{
		int n=4;
		int different=calculateDifference(n);
		System.out.print(different);
		
	}

	private static int calculateDifference(int n)
	{
		int addnum=0,add=0;
		for(int i=1;i<=n;i++)
		{
			addnum=addnum+i;
			add=add+(i*i);
		}
		int square=addnum*addnum;
		return (add-square);
	}
}
