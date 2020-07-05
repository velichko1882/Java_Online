package by.velichko.jonline.basics.lineprog;

/*
Дано действительное число R вида nnn.ddd (три цифровых разряда
в дробной и целой частях). Поменять местами дробную и целую
части числа и вывести полученное значение числа.
*/

public class Task4 {

	public static void main(String[] args) {
		
		double number;
		int numberOfDigits;
		
		number = 123.456;
		numberOfDigits = 3;
		
		double wholePart;
		double fractionalPart;
		int divider;
		double newNumber;
		
		divider = (int)Math.pow(10, numberOfDigits);
		wholePart = (int)number;
		fractionalPart = number * divider - wholePart * divider;
		wholePart = wholePart / divider;
		newNumber = fractionalPart + wholePart;
		
		System.out.println("initial number = " + number);
		System.out.println("result = " + newNumber);

	}

}
