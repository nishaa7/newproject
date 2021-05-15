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
		
		abstractchild obj5 = new abstractchild();
		obj5.method2();
		obj5.method1();
		
		// ----------Interface Example ------------
		
		System.out.println("-----Interface Example------ ");
		
	    Interfacechild obj7 = new Interfacechild();
	    obj7.method1();
	    obj7.method2();
	    obj7.method3();
	    
		
		EncapsulationExample obj6 = new EncapsulationExample();
		obj6.setSalary(2000);
		obj6.setName("nisha");
		obj6.setEmpId("01");
	System.out.println("salary " +obj6.getSalary());
	System.out.println("Employee Name " +obj6.getName());
	System.out.println("Employee Id " +obj6.getEmpId());
	}
	}


