import java.util.Random;

public class BruteForce {

    private final String CODE = "cod";

    public void sequentialCodeBreaker() {
        String guess = "";
        int generation = 0;
        for (int iterator = 0; !guess.equals(CODE); iterator++) {
            int i;
            for (i = ' '; ((char) i) != CODE.charAt(iterator) ; i++) {
                generation++;
            }
            System.out.println("Generation: " + generation + " guess: " + guess + " ");
            guess+=(char) i;

        }

        System.out.println("After " + generation + " the code has been cracked. Code: " + guess);
        randomCodeBreaker();
    }

    public void randomCodeBreaker() {
        String guess = "";
        int generation;
        for (generation = 0; !guess.equals(CODE); generation++) {
            guess = "";
            for (int i = 0; i < CODE.length(); i++) {
                guess+= randomGuess();
            }
        }

        System.out.println("After " + generation + " generations the code has been cracked. Code: " + guess);
    }

    private char randomGuess() {
        return (char)(new Random().nextInt('~' -  ' ' + 1) + ' ');
    }


}
