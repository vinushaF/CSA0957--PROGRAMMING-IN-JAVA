import java.io.*;
class Fibonacci extends Thread
{
     public static void main(String args[])
     {
          try
          {
               int a=0, b=1, c=0;
               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

               System.out.print("Enter the Limit for fabonacci: ");

               int n = Integer.parseInt(br.readLine());
               System.out.println("\n=================================");
               System.out.println("Fibonacci series:");
               while(n>0)
               {
                    System.out.print(c+" ");
                    a=b;
                    b=c;
                    c=a+b;
                    n=n-1;
               }
              if (n<0)
               { 
                 System.out.println("invalid.....");
                 return;
               }
                
          }
          catch (Exception ex)
          {
               System.out.println("invalid.....");
          }
     }
}
