// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String input = args[0].toUpperCase();
                int repeat = Integer.parseInt(args[1]);
                String vowels = "AEFHILMNORSX";
        
                for (char c : input.toCharArray()) {
                    String article = vowels.indexOf(c) >= 0 ? "an" : "a";
                    System.out.printf("Give me a %s %c: %c!\n", article, c, c);
                }
        
                System.out.println("What does that spell?");
                for (int i = 0; i < repeat; i++) {
                    System.out.println(input + "!!!");
                }
        }
}
