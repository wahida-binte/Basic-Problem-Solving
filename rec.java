import java.util.Scanner;
public class rec{
	public static void main(String [] args){
		int width,height,area,perimeter;
		Scanner rc = new Scanner(System.in);
		System.out.println("width=");
		width = rc.nextInt();
		System.out.println("Height =");
		height = rc.nextInt();
		area = width*height;
		perimeter = 2*(width+height);
		System.out.println("Area of rectangle is "+area);
		System.out.println("Perimeter of rectangle is "+perimeter);
	}
}
		
		