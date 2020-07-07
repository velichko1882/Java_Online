package by.velichko.jonline.basics.loop;

/*
Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
модуль которых больше или равен заданному е.
Общий член ряда имеет вид:
            1     1
    a(n) = --- + ---
           2^n   3^n
*/

public class Task5 {

	public static void main(String[] args) {

		double e = 0.0001;
		double sum = 0;
		
		for (int i = 1; i <= 1000; i++) {
			double a;
			a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
			if(Math.abs(a) >= e) {
				sum = sum + a;
			}else {
				break;
			}
			System.out.println("i = " + i + ", a = " + a + ", sum = " + sum);
		}
		
		System.out.println("sum = " + sum);
	}

}
