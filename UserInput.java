import java.util.Scanner; //util Scanner class ka package he.


 class UserInput {

	 
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter name: ");
		String name=s.next();
		System.out.println("Enter Gender: ");
		char gender=s.next().charAt(0);
		System.out.println("Enter age: ");
		int  age=s.nextInt();
		System.out.println("Enter phno: ");
		long phno=s.nextLong();
		
		
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("age: "+age);
		System.out.println("phno: "+phno);
		
		// TODO Auto-generated method stub

	}

}
