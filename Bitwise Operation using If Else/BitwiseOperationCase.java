package basicpackage;
import java.util.Scanner; 

public class BitwiseOperationCase {
	public static void main(String[] args)
	{
		int x,y,z,choice;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first value: ");
		x= sc.nextInt();
		System.out.println("Enter second value: ");
		y = sc.nextInt();
		System.out.print("Choose 1) x&y  2) x|y 3) x^y: ");
		choice = sc.nextInt();
		if(choice == 1)
		{
			z= x&y;
			System.out.println("The value of "+x+" & "+y+" is: "+z);
		}
		else if(choice==2)
		{
			z = x|y;
			System.out.println("The value of "+x+" | "+y+" is: "+z);
		}
		else if(choice==3)
		{
			z = x^y;
			System.out.println("The value of "+x+" ^ "+y+" is: "+z);
		}
		else
			System.out.println("!!Wrong Input!!");
	}
}
