package by.velichko.jonline.basics.branch;

/*
Найти max{min(a, b), min(c, d)}.
*/

public class Task2 {

	public static void main(String[] args) {

		int a = 89887;
		int b = 4551;
		int c = 455;
		int d = 558874;
		
		int max;
		int minAB;
		int minCD;
		
		if(a > b) {
			minAB = b;
		} else {
			minAB = a;
		}
		
		if(c > d) {
			minCD = d;
		} else {
			minCD = c;
		}
		
		if(minAB > minCD) {
			max = minAB;
		} else {
			max = minCD;
		}
		
		System.out.printf("max{min(%d, %d), min(%d, %d)} = %d", a, b, c, d, max);
		
	}

}
