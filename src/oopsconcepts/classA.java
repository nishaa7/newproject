package oopsconcepts;

public class classA {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		public int Salary;
		public String Name;
		public String Orgname;
		
		public classA()
		{
			System.out.println("Inside constructor");
		}
		
		public classA (String Name1,String Orgname1,int Salary1)
		{
		System.out.println("Inside PArametrised Constructor");
		Salary = Salary1;
		Name = Name1;
		Orgname = Orgname1;
		
		}
		public void Display()
		{
			System.out.println("Name of the Emp " +Name);
			System.out.println("Name of the orgsnisation " +Orgname);
			System.out.println("Salary " +Salary);
		}
		}
	


