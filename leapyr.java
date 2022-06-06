import java.util.Scanner;
public class leapyr {
	public static void main (String agrs[]){
		int year;
		Scanner vr = new Scanner(System.in);
		System.out.println("Enter any year- ");
		year = vr.nextInt();
		if(year%4==0 && year%100!=0||year%400==0)
			System.out.println("The given year is a leap year.");
		else
		    System.out.println("The given year is not a leap year.");
			
	}
}