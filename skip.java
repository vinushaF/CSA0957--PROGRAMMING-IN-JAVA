mport java.util.*;

public class skipping{
	public static void main(String args[]){
		Scanner lol=new Scanner(System.in);
		try{
			System.out.println("Enter a value for M :");
			int m=lol.nextInt();
			System.out.println("Enter a value for N :");
			int n=lol.nextInt();
			System.out.println("Enter a Skipping value for K :");
			int k=lol.nextInt();
			if(m<n && m>0 && n>0 && k>0 && m!=n){
				for(int temp=m;temp<n;temp=temp+k+1){
					System.out.println(temp);
				}
				
			}
			else{
				System.out.println("Invalid Input...");
			}
		}
		catch(InputMismatchException e){
			System.out.println("Invalid input...");
		}
	}
}
