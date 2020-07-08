public class CounterDemo {
	
	 static int count=0;   //whole class ke liye one copy
	CounterDemo()
	{
		count++;
		System.out.println(count);  
	}

	public static void main(String[] args) {
		
		CounterDemo c1=new CounterDemo();
		CounterDemo c2=new CounterDemo();
		CounterDemo c3=new CounterDemo();
		
		// TODO Auto-generated method stub

	}

}
