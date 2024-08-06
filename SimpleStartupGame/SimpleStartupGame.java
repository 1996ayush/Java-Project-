package SimpleGame;

import java.util.Scanner;
public class SimpleStartupGame {

	public static void main(String[] args) {
		int numOfGuesses=0;
		SimpleStartup dot = new SimpleStartup();
		int random = (int) (Math.random()* 5);
		int [] locations = {random, random+1, random+2};
		dot.setLocationCells(locations);
		boolean isAlive =true;
		
		
		
		while(isAlive==true) {
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
			int guess= scanner.nextInt();
			String result = dot.checkYourSelf(numOfGuesses);
			numOfGuesses++;
			if(result.equals("kill")) {
				isAlive=false;
				System.out.println("you took " + numOfGuesses + " guesses");
			}
		}
		
	
	}

}
