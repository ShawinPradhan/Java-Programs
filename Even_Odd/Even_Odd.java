import java.util.Scanner;
public class oddeven
{
public static void main(String[] args)
{
	int n;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a no.: ");
	n= s.nextInt();
	if(n%2 == 0)
	{
		System.out.println("Number given "+n+" is even");
	}
	else
	{
		System.out.println("Number given "+n+" is odd");
	}
}
}
