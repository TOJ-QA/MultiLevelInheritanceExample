package day8;

class GrandParent
{
	String lastName = "Mitchell";
	void message1()
	{
		System.out.println("Message from GrandParent");
	}
}

class Parent1 extends GrandParent
{
	String parentJob = "Software Engineer";
	
	void message2()
	{
		System.out.println("Message from Parent");
	}
}

class Child1 extends Parent1
{
	String school = "Central High School";
	
	void message3()
	{ 
		System.out.println("Message from Child");
	}
}

public class MultiLevelInheritanceExample {

	public static void main(String[] args) 
	{
//object of Child1 class
		Child1 obj = new Child1();

//Child's variable
		System.out.println(obj.school); 

//Child's method
		obj.message3(); 

// Inherited from Parent 1
		System.out.println(obj.parentJob); 
		
//Inherited from Parent1
		obj.message2(); 

// Inherited from Grand Parent		
		System.out.println(obj.lastName); 

// Inherited from Grand Parent
		obj.message1(); 
	
	}

}