import java.util.*;
import java.lang.Math;

public class LineComparison{
	public static void main(String args[]){
		System.out.println("Welcome to Line Comparison Computation Program");
		System.out.println("Enter the line co-ordinates");
		int x1,y1,x2,y2;
    		double dist;
		Scanner input=new Scanner(System.in);
		x1=input.nextInt();
		y1=input.nextInt();
		x2=input.nextInt();
		y2=input.nextInt();
		dist=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("The length of the line is:"+String.format("%.4f",dist));		
}
}
