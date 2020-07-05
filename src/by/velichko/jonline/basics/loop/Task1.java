package by.velichko.jonline.basics.loop;

import java.util.Scanner;

/*
Напишите программу, где пользователь вводит любое целое
положительное число. А программа суммирует все числа 
от 1 до введенного пользователем числа.
*/

public class Task1 {

	public static void main(String[] args) {

		int number = 0;
		int sum = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Please, give me a positive integer >> ");
			if (sc.hasNextInt()) {
				number = sc.nextInt();
				sc.nextLine();
			} else {
				sc.nextLine();
			}
		} while (number <= 0);

		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		
		System.out.println("Sum of numbers from 1 to " + number + " = " + sum);
	}

}
