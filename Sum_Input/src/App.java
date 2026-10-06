import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {

        Scanner in = new Scanner(System.in);
        double num1=0 ;
        double num2=0;
        double sum=num1+num2;
        double minus=num1-num2;   
        String s_m = "p";
        
        System.out.println("Please give the value of first number :");
        num1= Double.parseDouble(in.nextLine());
        
 
         System.out.println("Please give the value of second number :");
       
        num2= Double.parseDouble(in.nextLine());
    
    
            
System.out.println("Would you like to calculate sum or substraction. please type p(plus) or m(minus) :");

   
s_m=in.nextLine();

sum=num1+num2;   
minus=num1-num2;

// In this programme we will check sum or subtraction as well as if the sum is greater than 10 or not.

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

}
else {
   System.out.println("Check your inputs" );
  }

    }
    }
    
