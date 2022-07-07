import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		int number;
		int rev= 0;
		System.out.println("Enter number to reverse: ");
		Scanner s= new Scanner(System.in);
		number = s.nextInt();
		while(number != 0)
		{
			rev = rev *10;
			rev = rev + number%10;
			number = number /10;
		}
		System.out.println("The reverse of the number is: "+rev);

	}

}
