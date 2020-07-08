//single inheritance

class A {
     
	void showA()
	{
		System.out.println("a class method.");
	}
	
}
class B extends A
{
	void showB()
	{
		System.out.println("b class method.");
	}
	public static void main(String[] args) {
		
		A ob1=new A();
		B ob2=new B();
		ob1.showA();
		ob2.showA();
		ob2.showB();
		
	
		
		
		// TODO Auto-generated method stub

	}

}
