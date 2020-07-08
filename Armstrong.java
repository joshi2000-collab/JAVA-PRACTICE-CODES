import java.util.Scanner;

 class Armstrong {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int no=s.nextInt();  //153
		
		int t1=no;
		int length=0;
		
		while(t1!=0)
		{
			t1=t1/10;
			length=length+1;
			
		}
	
		int t2=no;
		int r,arm=0;
		
		while(t2!=0)
		{
			int mul=1;
			r=t2 %10;
		
			for(int i=1;i<=length;i++)
			{
				mul=mul*r;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		if(arm==no)
		{
			System.out.println(no+" is a armstrong number.");
		}
		else
		{
			System.out.println(no+" is not  a armstrong number.");
		}

	}
	
 }
