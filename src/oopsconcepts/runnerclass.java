package oopsconcepts;

public class runnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		classA Emp1 = new classA();
		Emp1.Display();
		classA Emp2 = new classA("nisha","xyz",1000);

		classB obj1 = new classB();
		obj1.Name= "ritu";
		obj1.Salary = 7000;
		obj1.Orgname = "pqr";
		obj1.Display();
		obj1.show();
		classC obj2 = new classC();
		obj2.run();
	}

}
