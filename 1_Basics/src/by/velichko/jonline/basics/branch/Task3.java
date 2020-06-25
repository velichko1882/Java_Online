package by.velichko.jonline.basics.branch;

/*
Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить,
будут ли они расположены на одной прямой.
*/

public class Task3 {

	public static void main(String[] args) {

		int x1 = -8;
		int y1 = 6;
		int x2 = 7;
		int y2 = -3;
		int x3 = 2;
		int y3 = 0;
		
		// (y1 - y2)x + (x2 - x1)y + (x1y2 - x2y1) = 0
		// ax + by + c = 0
		
		int a = y1 - y2;
		int b = x2 - x1;
		int c = (x1 * y2) - (x2 * y1);
		int rightSide = (a * x3) + (b * y3) + c;
		
		if(rightSide == 0) {
			System.out.println("three points are on the same line");
		} else {
			System.out.println("three points are not on the same line");
		}
	}

}
