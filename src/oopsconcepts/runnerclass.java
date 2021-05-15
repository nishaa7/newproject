package oopsconcepts;

public class runnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*classA Emp1 = new classA();
		Emp1.Display();
		classA Emp2 = new classA("nisha","xyz",1000);

		classB obj1 = new classB();
		obj1.Name= "ritu";
		obj1.Salary = 7000;
		obj1.Orgname = "pqr";
		obj1.Display();
		obj1.show();
		classC obj2 = new classC();
		obj2.run();*/
		
		methodoverloading obj3 = new methodoverloading();
		obj3.add(3, 5);
		obj3.add(4.6, 5.5);
		obj3.add(3.3, 5.5, 7.7);
		
		methodoverridechild obj4 = new methodoverridechild();
		obj4.display();
		
	}

}
