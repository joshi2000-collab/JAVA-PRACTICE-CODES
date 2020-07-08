class Min {
	
	public static void main(String[] args) {
	
	
		int[] a= {1,2,3,4,5,6};
		int min=a[0];
		
		
		
		for(int i=1;i<a.length;i++)
		{
			if(min > a[i] )
			{
				min=a[i];
			}
			
		}
		System.out.println("Min value is:-"+min);
   }
}
