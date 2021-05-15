package test;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number : ");
		Scanner num = new Scanner(System.in);
		int a = num.nextInt();
		
		
		if (a%2==0||a%1==0)
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not prime ");
		}
	}
	}


