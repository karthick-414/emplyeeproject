import java.util.*;
 class Vshape {

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
	    		     if(i==4&&j==6 || i==3&&j==7 || i==2&&j==8 || i==1&&j==9)
	    			   System.out.print("*");
               System.out.println(" ");
		     }
	    }
	}
