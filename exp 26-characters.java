import java.util.*;
class characters
{
	public static void main(String[] args) 
	{
		int i,c=0;
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter the sentence: ");
		s=sc.nextLine();
		System.out.print("characters are: ");
		for(i=0;i<s.length();i++)
		{
         //The charAt() method returns the character at the specified index in a string.
			char a=s.charAt(i);
			if(a=='@' || a=='!' ||a=='#' ||a=='$' ||a=='%' ||a=='^' ||a=='&' ||a=='*')
			{
				c++;
				System.out.print(s.charAt(i));
			}
		}
		System.out.println();
		System.out.println("Total special characters= "+c);
	}
}
