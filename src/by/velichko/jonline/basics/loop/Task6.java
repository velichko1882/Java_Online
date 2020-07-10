package by.velichko.jonline.basics.loop;

/*
Вывести на экран соответствий между символами и их численными 
обозначениями в памяти компьютера.
*/

public class Task6 {

	public static void main(String[] args) {

		char ch;
		
		int maxChar = Character.MAX_VALUE;
		
		for (int i = 0; i <= maxChar; i++) {
			ch = (char) i;
			System.out.println(i + " = " + ch);
		}
	}
	
}
