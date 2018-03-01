
public class PiCalculator {
	public static void main(String[] args) {
		double i = 1;
		double pi = 2;
		while (i <= 10000) {
			pi = pi * ( 2*i / (2*i-1) ) * ( 2*i / (2*i+1) );
			i++;
		}
		System.out.println("pi: " + pi);		
	}
}
