//Program to print the highest value in an array

import java.util.Scanner;
public class highest_value
{
	public static void main(String[] args)
	{
		int number,max_value;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no. of elements in the array: ");
		number = s.nextInt();
		int array[] = new int[number];
		System.out.println("Enter elements of array: ");
		for(int i=0; i<number;i++)
		{
			array[i]=s.nextInt();
		}
		max_value = array[0];
		for (int i=0;i<number;i++)
		{
			if(max_value<array[i])
			{
			max_value = array[i];
			}
		}
		System.out.println("The highest value in the array is: "+max_value);
	}
}
