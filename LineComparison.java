import java.util.*;
import java.lang.Math;

public class LineComparison{
	public static void main(String args[]){
		System.out.println("Welcome to Line Comparison Computation Program");
		int x11,y11,x12,y12,x21,y21,x22,y22;
    		double dist1,dist2;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the co-ordinates of line-1");
		x11=input.nextInt();
		y11=input.nextInt();
		x12=input.nextInt();
		y12=input.nextInt();
		dist1=Math.sqrt((x12-x11)*(x12-x11)+(y12-y11)*(y12-y11));
		System.out.println("Enter the co-ordinates of line-2");
		x21=input.nextInt();
                y21=input.nextInt();
                x22=input.nextInt();
                y22=input.nextInt();
                dist2=Math.sqrt((x22-x21)*(x22-x21)+(y22-y21)*(y22-y21));
		System.out.println("The length of the line1 is:"+String.format("%.4f",dist1));
		System.out.println("The length of the line2 is:"+String.format("%.4f",dist2));		
		if(dist1==dist2)
			System.out.println("The lines are equal");
		else
			System.out.println("The lines are not equal");
}
}
