package test;

public class throwexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
		int age = 15;
		if (age<18)
			
		{
			throw new ArithmeticException ("not valid age");
			
		}
	else
		{
			System.out.println("you are elegible");
			
		}
}catch (ArithmeticException e)
		{
			System.out.println("Exception Handled");
		}
	}

	}
