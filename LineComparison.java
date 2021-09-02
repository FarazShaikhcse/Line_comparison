import java.util.*;
import java.lang.Math;

class Line {

	int x1, x2, y1, y2;
	double distance;

	/**
	 * This method initializes the coordinates of the line
	 */
	public void getCoordinates() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the co-ordinates of line");
		x1 = input.nextInt();
		y1 = input.nextInt();
		x2 = input.nextInt();
		y2 = input.nextInt();

	}

	/**
	 * This method calculates the distance of the line
	 */
	public void calculateDistance() {
		distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}
}

public class LineComparison {
	public void compareLines(Double dist1, Double dist2) {
		if (dist1.compareTo(dist2) == 0)
			System.out.println("The lines are equal");
		else if (dist1.compareTo(dist2) > 0)
			System.out.println("Line-1 is larger than line-2");
		else
			System.out.println("Line-1 is smaller than line-2");

	}

	public static void main(String args[]) {

		System.out.println("Welcome to Line Comparison Computation Program");
		Line line1 = new Line();
		line1.getCoordinates();
		line1.calculateDistance();

		Line line2 = new Line();
		line2.getCoordinates();
		line2.calculateDistance();

		System.out.println("The length of the line1 is:" + String.format("%.4f", line1.distance));
		System.out.println("The length of the line2 is:" + String.format("%.4f", line2.distance));

		LineComparison compare = new LineComparison();
		compare.compareLines(line1.distance, line2.distance);

	}
}
