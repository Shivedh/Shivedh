package javaBasics;

//Inside one Java File, we can have multiple JAVA Classes, but only one public class should be there

//If we do not give any value for the string it will take null as the default value
//If we do not give any value for the integer it will take 0 as the default value
//If we do not give any value for the double it will take 0.0 as the default value
//If we do not give any value for the boolean it will take false as the default value
//If we do not give any value for the character it will take ' ' as the default value

//Constructor is nothing but a method, but it gets executed implicitly or by default during object creation
//Whenever we are creating an object, there will be constructor that will be executed automatically

//For a class, we can have only one default constructor

//For a class, we can have more than one Parameterized Constructor

//Every constructor is a method but not every method is a constructor

//Static methods are always binded to the class ---> That is why we can avoid object creation
//Non Static Methods are always binded to the heap memory
class Names
{
	String firstName;
	String lastName;
	String middleName;
	
	//Syntax of declaring a default constructor
	//public ClassName()
//	{
		//Block Of Code to be Executed
//	}
	
	public Names()
	{
		firstName="Ravee";
		middleName="Nnamdi";
		lastName="Shiva";
	}
	
	//Syntax of declaring a parameterized constructor
	//public ClassName(pass the arguments)
//	{
	    //Block Of Code to be Executed
//  }
	
	public Names(String fName, String mName, String lName)
	{
		firstName=fName;
		lastName=mName;
		middleName=lName;
	}
	
	public Names(String fName, String mName)
	{
		firstName=fName;
		lastName=mName;
//		middleName=lName;
	}
	
	public void displayName()
	{
		System.out.println(firstName+"-"+middleName+"-"+lastName);
	}
	
	public static void staticBlockCalled()
	{
		System.out.println("Static Method Called");
	}
}

class PhoneNumbers
{
	int countryCode;
	int areaCode;
	int phoneNumber;
	
	//Creating my arguments which are having same name as the variable name
	public PhoneNumbers(int countryCode, int areaCode, int phoneNumber)
	{
		//this is the keyword used to refer the current value of a variable, current instance of a object, current method
		
		this.countryCode=countryCode;
		this.areaCode=areaCode;
		this.phoneNumber=phoneNumber;
	}
	
	public void displayPhoneNumber()
	{
		System.out.println("("+countryCode+")"+"("+areaCode+")"+"("+phoneNumber+")");
	}
}

class Students
{
	String studentName;
	String classGrade;
	int rollNo;
	double percentage;
}

public class ConstructorConcepts {
	
	public static void main(String[] args) {
		
		//Create an instance/object of that particular class
		//It is because the method is present in another class and it is non static method too
		
		//Syntax of creating an object:
		//ClassName objName=new ClassName();
		
		//We are storing the reference of the object in objName
		//objName ---> Please follow the same rules used to declare the variables while giving the object name
		
		Names n1=new Names();
		
		//Syntax of calling a non static method that is present in another class
		n1.displayName();
		
		//Whenever we are using Parameterized Constructor, we will be passing the arguments during the object creation
		Names n2=new Names("Divya","Pooja","Sravanthi");
		
		n2.displayName();
		
		Names n3=new Names("Uday","Pavan");
		
		n3.displayName();
		
		//Syntax of calling a static method from another class:
		//ClassName.methodName();
		
		Names.staticBlockCalled();
		
		PhoneNumbers p1=new PhoneNumbers(91,270,932532);
		
		p1.displayPhoneNumber();
		
	}
	
}
