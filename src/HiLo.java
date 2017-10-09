import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		String playAgain = " ";
		do {
			Scanner scan = new Scanner(System.in);

			int theNumber = (int) (Math.random() * 100 + 1);

			int guess = 0;
			int numOfTries=0;

			while (guess != theNumber) {
				System.out.println("guess a number between 1 and 100");
				guess = scan.nextInt();
				
				numOfTries++;

				if (guess < theNumber) {
					System.out.println("guessed number is too low" + guess);
				} else if (guess > theNumber) {
					System.out.println("guessed number is too high" + guess);

				} else
					System.out.println("guessed number is correct" + guess);
			}
			
			if(numOfTries<10){
				System.out.println("good work you took " + numOfTries+ "only");
			}else
				System.out.println("you took " + numOfTries+ "tries!");
			
			System.out.println("would you like to play again (y)/(n)?");
			playAgain = scan.next();

		} while (playAgain.equalsIgnoreCase("y"));
		System.out.println("thanks for playing");

	}

}
