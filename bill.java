import java.util.Scanner;
public class bill{
	public static void main(String args[]){
		int b,time,days,hour,p,w,Bill;
		Scanner scan= new Scanner(System.in);
		b = scan.nextInt();
		days = scan.nextInt();
		hour = scan.nextInt();
		p = scan.nextInt();
		time=days*hour;
		w=(time*p)/1000;
		Bill= w*b;
		System.out.println("Your monthly electricity bill is "+Bill+" taka.");
	
	}
}