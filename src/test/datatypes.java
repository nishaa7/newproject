package test;

import java.util.Scanner;

public class datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		//------Data Types in java ----------
		int num1;
		int num2;
		num1=40;
		num2=20;

		int Sum = num1+num2;
		System.out.println(Sum);
		float div = num1/num2;
		System.out.println(div);

		int num3=12;
		int num4=2;

		int Mul= num3*num4;
		System.out.println(Mul);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of user : ");
		String name = scanner.next();

		System.out.println("Hello " + name);
		System.out.println("Length : " +name.length());
		System.out.println("Upper Case : " +name.toUpperCase());
		System.out.println("Length : " +name.length());

		//==========Arrays=======================

		int myarray[]= {2,3,4,5,6};
		System.out.println("nisha");

		System.out.println("Value of the array " + myarray[2]);
		}



			}

	

