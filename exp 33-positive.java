import java.util.*;
public class org{
	public static void main(String args[]){
		try{
		Scanner obj=new Scanner(System.in);
		float n,neg=0,pos=0;
		int n1=0,p1=0;
		for(int i=0;;i++){
			System.out.println("enter the num : ");
			n=obj.nextInt();
			if(n<-1){
				neg+=n;
				n1++;
			}
			else if(n>=0){
				pos+=n;
				p1++;
			}
			else
				break;
		}
		double posavg=pos/p1;
		float negavg=neg/n1;
		System.out.println("positive average : "+posavg);
		System.out.println("negative average : "+negavg);
		}
		catch(Exception a){
			System.out.println("invalid ...........");
		}
		
	}
}
