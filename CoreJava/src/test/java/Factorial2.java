
public class Factorial2 {

	public static void main(String[] args) {

		System.out.println(factorial(6));
	}

	public static long factorial(int num) {
		if (num < 2) {
			return 1;
		}
		int i = 2;
		long fact = 1;
		while (i <= num) {
			fact = fact * i;
			i++;
		}

		return fact;
	}
}
