//interface supports multiple inheritance.

 interface I1 {
     
	public abstract void show();
}
 interface I2
 {
	 public abstract void display();
 }
 class Test implements I1, I2
 {
	public void show()
	 {
		 System.out.println("1");
	 }
	public void display()
	 {
		 System.out.println("2");
	 }
	 public static void main(String[] args)
	 {
		 Test t=new Test();
		 t.show();
		 t.display();
		 
	 }
 }
