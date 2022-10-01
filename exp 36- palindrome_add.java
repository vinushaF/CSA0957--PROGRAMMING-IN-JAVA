import java.util.*;
public class org{
	public int reverse(int a){
		int rem,rev=0;
		while(a!=0){
			rem=a%10;
			rev=rev*10+rem;
			a/=10;
		}
		return rev;
	}
	public static void main(String args[]){
		try{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number : ");
		float n2=obj.nextFloat();
		int n=(int)n2;
		if(n!=n2 || n<=0)
			System.out.println("invalid.....");
		else{
		int n1=0;
		org o2=new org();
		for(int i=0;;i++){
		if(n1==n){
			System.out.println("it is palindrome.........");
			break;
		}
		else{
			n=n+n1;
			System.out.println(n+" + "+n1+" = "+n);
			n1=o2.reverse(n);
		}
		}
		}
		}
		catch(Exception a){
			System.out.println("invalid.....");
		}
	}
}
