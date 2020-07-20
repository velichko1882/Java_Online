package by.velichko.jonline.basics.loop;

import java.util.Scanner;

/*
Для каждого натурального числа в промежутке от m до n вывести все делители,
кроме единицы и самого числа. m и n вводятся с клавиатуры.
*/

public class Task7 {

	public static void main(String[] args) {

		int m;
		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Please, enter two integers m and n, (m < n):");
			System.out.print("m >> ");
			while(!sc.hasNextInt()) {
				sc.nextLine();
			}
			m = sc.nextInt();
			sc.nextLine();
			System.out.print("n >> ");
			while(!sc.hasNextInt()) {
				sc.nextLine();
			}
			n = sc.nextInt();
			sc.nextLine();
		} while (m >= n);

		System.out.println("m = " + m + "; n = " + n);
		
		if (n > 0) {
			for (int i = m; i <= n; i++) {
				System.out.print("dividers for " + i + " except 1 and " + i + " is: ");
				for (int j = 2; j < i; j++) {
					if(i % j == 0) {
						System.out.print(j + "  ");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("The interval from " + m + " to " + n 
					+ " has no natural numbers.");
		}
	}

}
