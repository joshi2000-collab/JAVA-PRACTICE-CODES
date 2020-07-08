import java.util.Arrays;

public class StringArrayRev {

	public static void main(String[] args) {
		
		String[] myArray= {"here","is","season","holiday","The"};
		System.out.println("print the string within array in reverse order:"+Arrays.toString(myArray));
		for(int i=0;i<myArray.length/2;i++)
		{
			String temp=myArray[i];
			myArray[i]=myArray[myArray.length-i-1];
			myArray[myArray.length-i-1]=temp;
		}
		System.out.println("Here is the result: ");
		for(int i=0;i<myArray.length;i++)
		{
			System.out.print(myArray[i]+" ");
		}
		// TODO Auto-generated method stub

	}

}
