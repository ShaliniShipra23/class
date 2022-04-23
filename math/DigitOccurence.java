package math;
import java.util.*;
public class DigitOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		Scanner abc=new Scanner(System.in);
		int n=scn.nextInt();
		int m=abc.nextInt();
		scn.close();
		abc.close();
		int count=0;                              
		while(n>0)
		{
			int j;
			j=n%10;
			n=n/10;
			if(m==j) {
				count++;
			}
		}
		System.out.println(count);

	}

}
