import java.util.*;
 class Vshapepattern
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      
           int i,j,n;
            System.out.println("Enter the value of n");
             n=sc.nextInt(); 
      
		    for(i=1;i<=n;i++)
		    {
		    	for(j=1;j<i;j++)
		    		   System.out.print(" ");
		    	for(j=1;j<=n;j++)
		    		if(i==j)
		    			System.out.print("*");
		    	 for(j=i;j<n*2-2;j++)
		    		   System.out.print(" ");
		    	 for(j=1;j<=n;j++)
	    		     if(i+j=10)
	    			   System.out.print("*");
               System.out.println(" ");
		     }
	    }
	}
