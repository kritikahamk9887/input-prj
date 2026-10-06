import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {

        Scanner in = new Scanner(System.in);
        int num1=0 ;
        int num2=0;
        int sum=num1+num2;
        int minus=num1-num2;   
        String s_m = "p";
        
        System.out.println("Please give the value of first number :");
        num1= Integer.parseInt(in.nextLine());
        
 
         System.out.println("Please give the value of second number :");
       
        num2=Integer.parseInt(in.nextLine());
    
    
            
System.out.println("Would you like to calculate sum or substraction. please type p(plus) or m(minus) :");

   
s_m=in.nextLine();

sum=num1+num2;   
minus=num1-num2;

if (s_m.equals("m")  ) {
    System.out.println("The result is : " + minus ); 

    
}
else  if (s_m.equals("p") )
     {

if (sum>10) {
    System.out.println("The sum is grater than 10 and it is : " + sum ); 
    
}
else 
{
 System.out.println("The sum is: " + sum );
}
//else{
   // System.out.println("Check your inputs" );
 //   }
}

    }
    }
    
