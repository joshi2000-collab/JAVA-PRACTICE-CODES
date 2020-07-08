//bubble sort adjacent ko check karata he and agle round me last vale ko chodata he.

import java.util.Scanner;
 class BubbleSort {
    static int i;
	public static void main(String[] args) {
		
		int temp,flag=0;
		int[] a=new int[6];

		Scanner s=new Scanner(System.in);
		for(i=0;i<a.length;i++)
		{
		 a[i]=s.nextInt();
		}
		
		for( i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j] > a[j+1])
				{
				   temp=a[j];
				   a[j]=a[j+1];
				   a[j+1]=temp;
				   flag=1;
				}
				
			}
			if(flag==0)
			{
				break;
			}
		}
		System.out.print("Sorted array is:-");
        for( i=0;i<a.length;i++)
        {
        	System.out.print(a[i]+" ");
        }
	}

}
