//1D  Array
class AnonymousArray {

	public static void main(String[] args) {
		
		 AnonymousArray.sum(new int[]{10,20,30});

	}
	static void sum(int[] no)
	{
		int total=0;
		for(int i:no)        //for each loop.
		{
			total=total+i;
		}
		System.out.println("Sum is:- "+total);
	}

}
