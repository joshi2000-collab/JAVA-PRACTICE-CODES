//swap2 nos with 3rd variable

import java.util.Scanner;

public class Swap2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a=s.nextInt(); // a=10
		System.out.println("Enter b: ");
		int b=s.nextInt(); // b=20
		
		int t;
		t=a;              //t=10;
		a=b;              //a=20;
		b=t;             //b=10'
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);

	}

}
