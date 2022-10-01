import java.util.*;
public class org{
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		System.out.print("enter M : ");
		int m=obj.nextInt();
		System.out.print("enter N : ");
		int n=obj.nextInt();
		if(m<=0 || n<=0)
			System.out.println("invalid..........");
		else{
		for(int i=1;i<=n;i++)
			System.out.println(m+"x"+i+"="+(m*i));
		}
		
	}
}
