package even_odd_no;

import java.util.Scanner;

//Check if a number is even or odd
public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num+" "+"is an even number");
		}
		else
		{
			System.out.println(num+" "+"is an odd number");
		}
	}
}
