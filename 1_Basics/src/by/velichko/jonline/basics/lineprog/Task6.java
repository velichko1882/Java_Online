package by.velichko.jonline.basics.lineprog;

/*
Для данной области составить линейную программу, которая
печатает true, если точка с координатами (x, y) принадлежит
закрашенной области, и false - в противном случае.
(область ограничена следующими прямыми:
у=4, у=0, х=-2, х=2, у=-3, х=-4, х=4)
*/

public class Task6 {

	public static void main(String[] args) {
				
		int x;
		int y;
		
		boolean isIncluded;
		
		boolean inArea1;
		int bottomBorder1 = 0;
		int topBorder1 = 4;
		int leftBorder1 = -2;
		int rightBorder1 = 2;
		
		boolean inArea2;
		int bottomBorder2 = -3;
		int topBorder2 = 0;
		int leftBorder2 = -4;
		int rightBorder2 = 4;
		
		x = 0;
		y = 4;
		
		inArea1 = ((y >= bottomBorder1)&&(y <= topBorder1)) && 
				((x >= leftBorder1)&&(x <= rightBorder1));
		inArea2 = ((y >= bottomBorder2)&&(y <= topBorder2)) && 
				((x >= leftBorder2)&&(x <= rightBorder2));
		isIncluded = inArea1 || inArea2;
		
		System.out.println("point coordinates: x = " + x + ", y = " + y);
		System.out.println("is included: " + isIncluded);

	}

}
