
public class PiCalculator2 {
	public static void main(String[] args) {
		double i = 1;
		double pi = 0;
		while (i <= 10000) {
			pi = pi +  1/i - 1/(i+2) ;
			i += 4;
		}
		System.out.println("pi: " + pi*4);
	}
}
