package math;
import java.util.*;
public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        scn.close();
        boolean flag=false;
        for(int i=2;i<n;i++)
        {
        if(n%i==0){
        flag=true;
        break;
        }
        }
        if(flag==true){
            System.out.println("Not a prime");
        }
        else{
            System.out.println("prime");
        }

}



}
