import java.util.Scanner;

 class Palindrome {
	 
	 public static void main(String[] args){
		 
		 Scanner s=new Scanner(System.in);
		 int rev=0,r;
		 int no=s.nextInt();
		 int temp=no;
         while(temp!=0)
         {
        	  r=temp%10;
        	  rev=rev*10+r;
        	  temp=temp/10;
         }
         if(no==rev)
         {
        	 System.out.println(no+" is a palindrome no.");
         }
         else
         {
        	 System.out.println(no+" is not a palindrome no.");
         }
		 

		 
	 }
}
