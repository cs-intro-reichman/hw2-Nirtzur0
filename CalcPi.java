// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
        int terms = Integer.parseInt(args[0]);
        double piApprox = 0;
        for (int i = 0; i < terms; i++) {
            piApprox += Math.pow(-1, i) / (2 * i + 1);
        }
        piApprox *= 4;
        System.out.printf("pi according to Java: %.15f\n", Math.PI);
        System.out.printf("pi, approximated:     %.15f\n", piApprox);
	}
}
