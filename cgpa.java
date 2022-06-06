import java.util.Scanner;
public class cgpa{
	public static double cg(double [] marks,int numberOfCourse){
		double grade[]= new double[numberOfCourse];
		double cgpa,sum=0;
		
		for(int i=0; i<numberOfCourse; i++){
			grade[i]= (marks[i]/10);
		}
		for(int i=0; i<numberOfCourse; i++){
			sum += grade[i];
		}
		cgpa= sum/numberOfCourse;
		return cgpa;
	}
	public static void main(String args[]){
		int numberOfCourse;
		double marks[];
		marks = new double[100];
		Scanner sub=new Scanner(System.in);
		numberOfCourse = sub.nextInt();
		System.out.println(numberOfCourse);
		for (int i=0;i<numberOfCourse;i++){
			marks[i]=sub.nextDouble();
		}
		double cgpa=cg(marks,numberOfCourse);
		double cgper= cgpa*9.5;
		System.out.println("CGPA = "+cgpa);
		System.out.println("CGPA percentage = "+cgper);
		
		
		
	}
	
}