import java.util.*;
class Valueone
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   
   

    System.out.println("Enter the six values");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    int e=sc.nextInt();
    int f=sc.nextInt();


         if(a>b && a>c && a>d && a>e && a>f)
         System.out.println("a is largest");
         else if(b>c && b>d && b>e && b>f)
         System.out.println("b is largest");  
         else if(c>d && c>e && c>f)
         System.out.println("c is largest");
         else if(d>e && d>f )
         System.out.println("d is largest");
         else if(e>f)
         System.out.println("e is largest");
         else
         System.out.println("f is largest");
    }
}



