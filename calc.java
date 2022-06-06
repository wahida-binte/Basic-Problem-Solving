import java.util.Scanner;
public class calc{
	public static void main(String [] args){
		int x,y,add,sub,mult,rem;
		float divi;
		Scanner cal= new Scanner(System.in);
		System.out.println("x=");
		x = cal.nextInt();
		System.out.println("y =");
		y = cal.nextInt();
		
		add = x+y;
		if (x>=y)
			sub=x-y;
		else
			sub=y-x;
		mult= x*y;
		divi = (float)x/y;
		rem = x%y;
		System.out.println("Addition = "+add);
		System.out.println("Subtraction = "+sub);
		System.out.println("multiplication = "+mult);
		System.out.println("Division = "+divi);
		System.out.println("Remainder = "+rem);
		
	}
}