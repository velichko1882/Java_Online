package by.velichko.jonline.basics.branch;

/*
Заданы размеры А, В прямоугольного отверстия и размеры x, y, z кирпича.
Определить, пройдет ли кирпич через отверстие.
*/

public class Task4 {

	public static void main(String[] args) {

		int a = 65;
		int b = 126;
		int x = 60;
		int y = 600;
		int z = 126;
		
		int minSizeHole;
		int maxSizeHole;
		int minSizeBrick;
		int avgSizeBrick;
		
		if(a > b) {
			minSizeHole = b;
			maxSizeHole = a;
		} else {
			minSizeHole = a;
			maxSizeHole = b;
		}
		
		minSizeBrick = x;
		if(minSizeBrick > y) {
			minSizeBrick = y;
		}
		if(minSizeBrick > z) {
			minSizeBrick = z;
		}
		
		avgSizeBrick = x;
		if((x <= y && y <= z) || (x >= y && y >= z)) {
			avgSizeBrick = y;
		}
		if((x <= z && z <= y) || (x >= z && z >= y)) {
			avgSizeBrick = z;
		}
		
		if(minSizeHole > minSizeBrick && maxSizeHole > avgSizeBrick) {
			System.out.println("the brick will go through the hole");
		} else {
			System.out.println("the brick will not go through the hole");
		}

	}

}
