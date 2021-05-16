package test;

public class throwsexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throwsexample obj = new throwsexample();
		try {
			
		obj.elegibility(17);
		}catch(ArithmeticException e)
		{
			System.out.println("Exception Handled ");
		}

}
	public void elegibility (int age)throws ArithmeticException
	{
		if(age<18)
		{
			throw new ArithmeticException ("Not valid age");
		}
		else
		{
			System.out.println(" You can give vote");
		}
		
		}
	}
