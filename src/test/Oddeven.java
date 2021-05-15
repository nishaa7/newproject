package test;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the num :");
		int number = num.nextInt();
		
		if (number%2==0)

		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
			
		}

	}


