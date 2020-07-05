package by.velichko.jonline.basics.branch;

/*
Вычислить значение функции:
           |x^2 - 3x + 9, если x <= 3;
           |
    F(x) = |   1
           |-------,      если x > 3.
           |x^3 + 6
*/

public class Task5 {

	public static void main(String[] args) {

		double fX;
		double x;

		x = 4;

		if (x <= 3) {
			fX = Math.pow(x, 2) - 3 * x + 9;
		} else {
			fX = 1 / (Math.pow(x, 3) + 6);
		}

		System.out.println("F(x) = " + fX);

	}

}
