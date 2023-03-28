package in.ineuron.game;
import java.util.Scanner;
//Guesser Method calling
class Guesser {
	int guesNum;

	int guesNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser kindly guess the no");
		guesNum = sc.nextInt();
		return guesNum;
	}
}
//Player method Calling
class Player {
	int guesNum;

	
	int guesNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Players kindly guess the no");
		guesNum = sc.nextInt();
		return guesNum;
	}
}

class Umpire {
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	int numFromPlayer4;
	void collectnumFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser = g.guesNum();
	}
	void collectnumFromPlayer() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		numFromPlayer1 = p1.guesNum();
		numFromPlayer2 = p2.guesNum();
		numFromPlayer3 = p3.guesNum();
	}
	void compare() {
		if (numFromGuesser == numFromPlayer1) {
			if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("All players won the match");
			} else if (numFromGuesser == numFromPlayer2) {
				System.out.println("1&2 won the match");

			} else if (numFromGuesser == numFromPlayer3) {
				System.out.println("1&3 won the match");
			} else {
				System.out.println("Player 1 won the match");

			}
		} else if (numFromGuesser == numFromPlayer2) {
			if (numFromGuesser==numFromPlayer3) {
				System.out.println("2 & 3 won the match");
			}
			else {
				System.out.println("Player 2 won the match");				
			}
		} else if (numFromGuesser == numFromPlayer3) {

			System.out.println("Player 3 won the match");

		} else {
			System.out.println("Match has lost Please Try again");
		}
	}
	}

public class GuesserGameApp {

	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.collectnumFromGuesser();
		u.collectnumFromPlayer();
		u.compare();
	}

}


