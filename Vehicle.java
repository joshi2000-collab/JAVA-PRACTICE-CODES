abstract class Vehicle
{

	abstract void start();
	
 }
 class Car extends Vehicle
 {
	 void start()
	 {
		 System.out.println("start with key");
	 }
 }
 class Scooter extends Vehicle
 {
	 void start()
	 {
		 System.out.println("start with kick");
	 }
 
	public static void main(String[] args) {
		
	//	Vehicle v=new Vehicle();  //we can not create the object of abstract class.
   //		v.start();               
		Car c=new Car();
		c.start();
		Scooter s=new Scooter();
		s.start();
		// TODO Auto-generated method stub

	}

}
