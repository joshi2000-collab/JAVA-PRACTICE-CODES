import java.util.Scanner;
 class SelectionSort {
		static int i;
	public static void main(String[] args) {
	
		int temp;
		int[] a=new int[6];

		Scanner s=new Scanner(System.in);
		for( i=0;i<a.length;i++)
		{
		 a[i]=s.nextInt();
		}
		int min;
		for(  i=0;i<a.length;i++)
		{
			min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j] <a[min])
				{
					min=j;
				}
			}		
				
				temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			  
				
		
				
		}
		System.out.print("Sorted array is:-");
        for( i=0;i<a.length;i++)
        {
        	System.out.print(a[i]+" ");
        }
	}

}
