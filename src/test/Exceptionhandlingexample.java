package test;

public class Exceptionhandlingexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 0;
		
		try
		{
		int div = a/b;
	
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmaetic Exception handled");
		}
		
		
		catch(Exception e)
		{
		System.out.println("Exception Handled");
		System.out.println("Hello");
		
	}
		finally
		{
			System.out.println("Try catch block");
		}
		
		int myarray[] = {2,3,4,5};
		
		try
		{
			System.out.println("Third Value in the array " +myarray[6]);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("my array exception handled");
		}
		}
		
	
	}

