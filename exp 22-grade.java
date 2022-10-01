import java.util.*;
public class grade{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		try{
			float mark1,mark2,mark3,mark4;
			System.out.print("Enter Subject 1 mark : ");
			mark1=sc.nextFloat();
			System.out.print("Enter Subject 2 mark : ");
			mark2=sc.nextFloat();
			System.out.print("Enter Subject 3 mark : ");
			mark3=sc.nextFloat();
			System.out.print("Enter Subject 4 mark : ");
			mark4=sc.nextFloat();
			if(mark1>50 && mark2>50 && mark3>50 && mark4>50)
			{
				float avg=(mark1+mark2+mark3+mark4)/4;
				float sum=mark1+mark2+mark3+mark4;
				System.out.println("Your total mark is "+sum);
				System.out.println("Your Average is "+avg);
				if(mark1>=0 && mark2>=0 && mark3>=0 && mark4>=0)
				{
					if(avg>=75)
					{
						System.out.print("Distinction");
					}
					else if(avg>=65 && avg<75)
					{
						System.out.print("First division");
					}
					else if(avg>=50 && avg<65)
					{
						System.out.print("Second division");
					}
					else
					{
						System.out.print("Third Division");
					}
				}
				else{
					System.out.print("Invalid Input");

				}
			}
			else
			{
				System.out.print("fail");
			}
			

			

		}
		catch(InputMismatchException a)
		{
			System.out.print("Invaild");
		}
		
	}
}
