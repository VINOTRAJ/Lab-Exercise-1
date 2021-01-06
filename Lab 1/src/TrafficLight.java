
import java.util.Scanner;

public class TrafficLight {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		String val=scan.nextLine();
		if(val.equalsIgnoreCase("Green"))
				{
					System.out.println("go");//t			
				}
				else if(val.equalsIgnoreCase("Red"))
				{
					System.out.println("Stop");//t
				}
				else 
					System.out.println("Ready");//t
	}

}