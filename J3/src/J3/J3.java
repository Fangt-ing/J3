package J3;

import java.util.Scanner;

public class J3 {

	public static void main(String[] args) {
		Board bd = new Board();
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int pln = 1;
		while (true) {
			boolean legal = false;
			bd.printBoard();
			System.out.println("Turn of player number: " + pln);
			while (!legal) {
				System.out.println("Coordinate of piece to move");
				System.out.print("Enter X:  ");
				int oldX = s.nextInt();
				System.out.print("Enter Y:  ");
				int oldY = s.nextInt();

				System.out.println("Coordinate of new position");
				System.out.print("Enter X:  ");
				int newX = s.nextInt();
				System.out.print("Enter Y:  ");
				int newY = s.nextInt();

				try {
					bd.movePiece(oldX, oldY, newX, newY, pln);
					System.out.println("\nPiece moved!\n");
					if (pln == 1)
						pln = 2;
					else
						pln = 1;
				} catch (Message e) {
					e.getMessage();
					e.printStackTrace();
				}
				
				}
			}}}
