// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
        int maxSeed = Integer.parseInt(args[0]);
        boolean verbose = args[1].equals("v");
        for (int seed = 1; seed <= maxSeed; seed++) {
            int steps = 0, current = seed;
            if (verbose) System.out.print(seed);

            while (current != 1) {
                current = (current % 2 == 0) ? current / 2 : current * 3 + 1;
                if (verbose) System.out.print(" " + current);
                steps++;
            }
            if (verbose) System.out.printf(" (%d)\n", steps);
        }
        System.out.printf("Every one of the first %d hailstone sequences reached 1.\n", maxSeed);
    }
}
