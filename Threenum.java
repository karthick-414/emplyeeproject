import java.util.*;
class Threenum{
public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
       int a,b,c,d;
       System.out.println("Enter the value of a,b,cand d");
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       d=sc.nextInt();

 if(a>b)
    {
       if(a>c) {
         if(a>d){
         System.out.println("a is largest");
         }
         else {
         System.out.println("d is largest");   
         }
      }
   }
      else
       {
        if(c>d)
          {
          System.out.println("c is largest");
          }
          else
          {
          System.out.println("d is largest");
          }
       }
 }
     
 else
     {
     if(b>c)
          { 
          if(b>d)
          {
          System.out.println("b is largest");
          }
          else
          {
           System.out.println("d is largest");   
          }
         }
     }
     else 
        {
        if(c>d)
             {
             System.out.println("c is largest");
             }
             else{
             System.out.println("d is largest");
             }
          }
       }
 else{
       if(b>c)
             {
              if(b>d)
             {
             System.out.println("c is largest");
             }
             else{
             System.out.println("d is largest");
              }
            }
        }
}
                 

  
   
 
