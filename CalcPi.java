// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
        int terms = Integer.parseInt(args[0]);
        double pi_approx = 0;

        for (int i = 0; i < terms; i++) {
            pi_approx += Math.pow(-1, i) / (2 * i + 1);
        }

        pi_approx *= 4;

        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated: " + pi_approx);	}
}
