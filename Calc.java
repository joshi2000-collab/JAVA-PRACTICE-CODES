import java.util.Scanner;

public class cal1 {

	public static void main(String[] args) {
		
		int ch;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter 1st value: ");
        int a=s.nextInt();
        System.out.print("Enter 2nd value: ");
        int b=s.nextInt();
        
        do
        {
        	
          int res;
          System.out.println("1.addition2.substrction3.multiplication4.division5.Exit");
          System.out.print("Enet ur ch>> ");
          ch=s.nextInt();
          switch(ch)
          {
            case 1:
	    	   res=a+b;
	    	   System.out.println("adiition is: "+res);
		       break;
		    
	        case 2:
		       res=a-b;
		       System.out.println("substrction is: "+res);
		       break;
		       
	        case 3:
		       res=a*b;
		       System.out.println("multiplication is: "+res);
		       break;
		       
	        case 4:
		       res=a/b;
		       System.out.println("division is: "+res);
		       break;
     
	        case 5:
		        break;
	
		       
            default:
   	   
   	               System.out.println("Enter valid choice..");
   	               break;
   	       
          }
		
	}while(ch!=5);

}
}
