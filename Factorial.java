import java.util.Scanner;

 class EvenOdd {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int no=s.nextInt();
		
		if(no%2==0)
		{
			System.out.println(no+" is even no.");
		}
		else
		{
			System.out.println(no+" is odd no.");
		}

	}

}
