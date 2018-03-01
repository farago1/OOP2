
public class Factorial {
	public static void main(String[] args) {
		factorial(10);
	}
	
	public static void factorial(double last) {
		double i = 1;
		double fact = 1; 
		while (i <= last) {
			fact = fact * i;
			System.out.println(fact);
			i++;
		}
	}
}
