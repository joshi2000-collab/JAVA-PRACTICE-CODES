import java.util.Scanner;

 class RevSt {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String: ");
        String name=s.next(); //abhi            //String ke 2 method  length() - length calculatr karata he.
        String rev=" ";                            //and charAt(i) ; ith position ka char aayega.
        int length=name.length();   //length=4
        
        for(int i=length-1;i>=0;i--)
        {
        	rev=rev + name.charAt(i);              //i+h
        	                                      //ih  //ih+b //ihb//ihb+a//ihba
        }
        System.out.println(rev);
        
        
        
	}

}
