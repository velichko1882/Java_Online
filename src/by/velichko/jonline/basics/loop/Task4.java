package by.velichko.jonline.basics.loop;

/*
Составить программу нахождения произведения квадратов первых
двухсот чисел.
*/

public class Task4 {

	public static void main(String[] args) {

		long product = 1;
		int i;

		for (i = 1; i <= 200; i++) {
			int sqr;
			sqr = (int) Math.pow(i, 2);
			if (Long.MAX_VALUE / product >= sqr) {
				product = product * sqr;
			} else {
				break;
			}
			System.out.println("i = " + i + ", sqr = " + sqr + ", product = " + product);
		}

		if (i == 200) {
			System.out.println("Product of first 200 numbers = " + product);
		} else {
			System.out.println("At iteration " + i + " the value exceeds Long max value.");
		}

	}

}
