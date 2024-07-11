import java.util.*;
class Validation
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
     
     String username="sathyatech@123",uname;
     int password=1234455,pwd;

 System.out.println("Enter the username");
 uname=sc.next();

  System.out.println("Enter the password");
  pwd=sc.nextInt();

 if(username.equals(uname))
    {
    if(password==pwd)
    {
    System.out.println("valid credential is valid");
    }
    else
    {
     System.out.println("invalid password! please try again");
    }
   }
 else
    {
     System.out.println("invalid username! please try again");
     }
   }
}
