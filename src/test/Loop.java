package test;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5;
		while (num>0)		
		{
		System.out.println("Num " +num);
        num--;
		}
		
	
		//DO  while loop

		System.out.println("Enter any number ");
		Scanner num1 = new Scanner(System.in);
		
		int num2 = num1.nextInt();
		
		
		if (num2%2==0)
		{
			System.out.println("Enter any odd number to print");
			
			
		}
		Scanner num3 = new Scanner(System.in);
		int num4 = num3.nextInt();

			
		System.out.println("Odd numbers ");
		System.out.println("----------------");
		do
		{
			System.out.println( +num4);
			num4=num4-2;
		}
		while(num4>0);
		
	
	
	// -------------For loop---------------
	
	for (int i=0;i<10;i++)
	{
		System.out.println("Value " +i);
	}
	}
	
	// ===============array=============
	
	//int myarray[] = {2,3,4,5,6};
	//for(int i=0;i<myarray.length;i++)
	{ 
	//System.out.println(myarray[]);
		/*System.out.println(myarray[]);*/
		
	//System.out.println(myarray[]);
		
		}
	
		
		}


	
	


