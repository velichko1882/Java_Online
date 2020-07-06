package by.velichko.jonline.basics.loop;

/*
Вычислить значения функции на отрезке [a, b] с шагом h:
        |x, x > 2
    y = |
        |-x, x <= 2
*/

public class Task2 {

	public static void main(String[] args) {

		double a;
		double b;
		double h;

		double x;
		double y;
		double scale = 10;
		int numberOfDigit = 0;

		a = -5;
		b = 8;
		h = 0.02;

		double temp = h;

		while (temp != (int) temp) {
			temp = temp * 10;
			numberOfDigit++;
		}

		scale = (int) Math.pow(scale, numberOfDigit);

		x = a;

		do {
			if (x > 2 || x == 0) {
				y = x;
			} else {
				y = -x;
			}
			System.out.println("x = " + x + ", y = " + y);
			x = (x + h) * scale;
			x = Math.round(x) / scale;
		} while (x <= b);

	}

}
