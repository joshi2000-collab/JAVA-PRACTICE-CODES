import java.util.Scanner;

class Max {
	
	public static void main(String[] args) {
	
	
		int[] a=new int[6];
		int max=a[0];
		Scanner s=new Scanner(System.in);
		for(int  i=0;i<a.length;i++)
		{
		 a[i]=s.nextInt();
		}
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i] >max )
			{
				max=a[i];
			}
			
		}
		System.out.println("Max no. is:-"+max);
   }
}
