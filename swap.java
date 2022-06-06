import java.util.Scanner;
public class swap{
	public static void main (String args[]){
		int a,b,temp;
		Scanner sw = new Scanner(System.in);
		System.out.println("Enter two numbers-");
		a = sw.nextInt();
		b = sw.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping a = "+a+" , b = "+b);
	}
}
