package by.velichko.jonline.basics.lineprog;

/*
Вычислить значение выражения по формуле (все переменные
принимают действительные значения):
	      _____________
	b + \/ b^2 + 4*a*c
	-------------------  - a^3*c + b^-2
	         2*a
*/

public class Task2 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		double numerator;
		double denominator;
		double result;
		
		a = 2;
		b = 3;
		c = 2;
		
		
		numerator = b + Math.sqrt(b * b + 4 * a * c);
		denominator = 2 * a;
		
		result = numerator / denominator - Math.pow(a, 3) * c + Math.pow(b, -2);
		
		System.out.println("result = " + result);

	}

}