package J3;

import java.util.Arrays;

public class Board {
		public static char[][] board = {
						{' ','1',' ','1',' ','1',' ','1'},
						{'1',' ','1',' ','1',' ','1',' '},
						{' ','1',' ','1',' ','1',' ','1'},
						{' ',' ',' ',' ',' ',' ',' ',' '},
						{' ',' ',' ',' ',' ',' ',' ',' '},
						{'2',' ','2',' ','2',' ','2',' '},
						{' ','2',' ','2',' ','2',' ','2'},
						{'2',' ','2',' ','2',' ','2',' '}
				};
				
				// Print the board to console
				public static void printBoard()	{
					//add additional spaces to the board for printing
					String[] sBoard = new String[8];
					Arrays.fill(sBoard, " ");
					for (int i = 0; i < 8; i++) {
						for (int j = 0; j < 8; j++) {
							sBoard[i] += board[i][j] + " ";
						}
					}
					
					//add borders to the board
					String[] fullBoard = {
							"    0 1 2 3 4 5 6 7   <- X axis",
							"  +-----------------+",
							"0 |" + sBoard[0] + "|",
							"1 |" + sBoard[1] + "|",
							"2 |" + sBoard[2] + "|",
							"3 |" + sBoard[3] + "|",
							"4 |" + sBoard[4] + "|",
							"5 |" + sBoard[5] + "|",
							"6 |" + sBoard[6] + "|",
							"7 |" + sBoard[7] + "|",
							"  +-----------------+",
							"    0 1 2 3 4 5 6 7",
					};
					
					//actual printing
					for (int i = 0; i < 12; i++) {
						System.out.println(fullBoard[i]);
					}	
				}
}
