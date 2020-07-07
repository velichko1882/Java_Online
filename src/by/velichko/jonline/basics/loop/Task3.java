package by.velichko.jonline.basics.loop;

/*
Найти сумму квадратов первых ста чисел.
*/

public class Task3 {

	public static void main(String[] args) {

		int sumI = 0;

		for (int i = 1; i <= 100; i++) {
			sumI = sumI + (int) Math.pow(i, 2);
		}
		
		System.out.println(sumI);
		
	}

}
