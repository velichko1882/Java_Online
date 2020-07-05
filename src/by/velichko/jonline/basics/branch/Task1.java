package by.velichko.jonline.basics.branch;

/*
Даны два угла треугольника (в градусах). Определить, существует ли
такой треугольник, и если да, то будет ли он прямоугольным.
*/

public class Task1 {

	public static void main(String[] args) {

		int angle1;
		int angle2;
		
		int angle3;
		int sumAngles = 180;
		int rightAngle = 90;
		
		angle1 = 60;
		angle2 = 30;
		
		angle3 = sumAngles - angle1 - angle2;
		
		if(angle3 > 0) {
			System.out.print("triangle exists, ");
			if(angle1 == rightAngle || angle2 == rightAngle || angle3 == rightAngle) {
				System.out.println("it is rectangular");
			} else {
				System.out.println("it is not rectangular");
			}
		} else {
			System.out.println("triangle does not exist");
		}
		
	}

}
