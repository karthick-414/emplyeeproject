import java.util.*;
class Testnewmm
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		{
			System.out.println("Application starts..");
			Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number");
			int num=sc.nextInt();
			 
			 try{
				System.out.println(10/num);
			 }

			 catch(Arithmeticexception ae)
				 {
				System.out.println("Given zero check once.."+ae);
			    }
				System.out.println("rest of the application");
		}
	}
}
