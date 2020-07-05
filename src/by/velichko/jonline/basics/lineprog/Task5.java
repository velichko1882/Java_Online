package by.velichko.jonline.basics.lineprog;

/*
Дано натуральное число Т, которое представляет длительность
прошедшего времени в секундах. Вывести данное значение длительности
в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
*/

public class Task5 {

	public static void main(String[] args) {
		
		int timeInSeconds;
				
		int seconds;
		int minutes;
		int hours;
		int divider;
		
		timeInSeconds = 2;
		divider = 60;
		
		seconds = timeInSeconds % divider;
		minutes = timeInSeconds / divider;
		hours = minutes / divider;
		minutes = minutes % divider;
		
		System.out.printf("%02dч %02dмин %02dс", hours, minutes, seconds);

	}

}
