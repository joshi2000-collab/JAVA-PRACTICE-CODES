public class Employee {
	
	int empid;
	String name;
	static String company="SP";  //saves only one copy to all object in whole class
	Employee(int empid,String name)  // parametrized constructor
	{
	   this.empid=empid;
	   this.name=name;
	  
	   
	 
    }
void display() {
	
	System.out.println(empid+", "+name+", "+company);
	
	
}

	public static void main(String[] args) {
		
		Employee e1=new  Employee(101,"ab");
		e1.display();
		
		Employee e2=new  Employee(102,"ac");
		e2.display();
		
		
		// TODO Auto-generated method stub

	}

}
