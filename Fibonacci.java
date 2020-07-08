import java.util.Scanner;


class Fib {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int no=s.nextInt();
		
		int t=0,t1=1;
		
		if(no==1)
		{
			System.out.println(t);
		}
		else if(no==2)
		{
			System.out.println(t1);
		}
		else
		{
			int t2;
			 System.out.print(t+" "+t1+" ");
			for(int i=2;i<no;i++)
			{
				 t2=t+t1;
				 System.out.print(t2+" ");
				 t=t1;
				 t1=t2;
				
			}
			
		}

	}

}
