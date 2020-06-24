package by.velichko.jonline.basics.lineprog;

/*
Вычислить значение выражения по формуле (все переменные
принимают действительные значения):
    sinX + cosY
    -----------  * tgXY
    cosX - sinY
*/

public class Task3 {

	public static void main(String[] args) {
		
		double x;
		double y;
		
		double numerator;
		double denominator;
		double result;
		
		x = 5.68;
		y = 3.14;
		
		numerator = Math.sin(x) + Math.cos(y);
		denominator = Math.cos(x) - Math.sin(y);

		result = numerator / denominator * Math.tan(x * y);
		
		System.out.println("result = " + result);
	}

}