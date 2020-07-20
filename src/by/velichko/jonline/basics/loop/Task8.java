package by.velichko.jonline.basics.loop;

/*
Даны два числа. Определить цифры, входящие в запись как первого 
так и второго числа.
*/

public class Task8 {

	public static void main(String[] args) {

		int a = 1987560448;
		int b = 31580754;

		for (int i = 0; i < 10; i++) {

			boolean isIncludedA = false;
			boolean isIncludedB = false;

			int tempA = a;
			while (tempA > 0) {
				int digitA = tempA % 10;
				if (digitA == i) {
					isIncludedA = true;
					break;
				} else {
					tempA = tempA / 10;
				}
			}

			int tempB = b;
			while (tempB > 0) {
				int digitB = tempB % 10;
				if (digitB == i) {
					isIncludedB = true;
					break;
				} else {
					tempB = tempB / 10;
				}
			}

			if (isIncludedA && isIncludedB) {
				System.out.println("The digit " + i + " included in both numbers");
			}
		}

	}

}
