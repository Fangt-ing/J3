package J3;

import java.util.Scanner;

public class J3 {

	public static void main(String[] args) throws Message {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int pln = 1;
		while (true) {
			boolean legal = false;
			Board.printBoard();
			System.out.println("Turn of player number: " + pln);
			while (!legal) {
				System.out.println("Coordinate of piece to move");
				System.out.print("Enter X:  ");
				String oldX = s.nextLine();
				System.out.print("Enter Y:  ");
				String oldY = s.nextLine();

				System.out.println("Coordinate of new position");
				System.out.print("Enter X:  ");
				String newX = s.nextLine();
				System.out.print("Enter Y:  ");
				String newY = s.nextLine();

				legal = Move.movePiece(oldX, oldY, newX, newY, pln);
				if (legal) {
					System.out.println("\nPiece moved!\n");
					if (pln == 1)
						pln = 2;
					else
						pln = 1;
				} else throw new Message("Illegal move!");
//				try {
//					System.out.println("\nMovement is not allowed, please try a new move!\n");
//				} finally {
//					System.out.println("\nPiece moved!\n");
				}
			}
		}
	}
