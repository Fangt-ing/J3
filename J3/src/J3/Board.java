package J3;

import java.util.Arrays;

public class Board {
		private char[][] board = {
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
		public void printBoard()	{
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
		
		public void movePiece(int x0, int y0, int x1, int y1, int turn) throws Message {
			
			if (board[x0][y0] == '1' && Math.abs(x1-x0) == Math.abs(y1-y0) && board[x1][y1] == ' ' &&
					turn == 1) {
				board[x1][y1] = '1';
				board[x0][y0] = ' ';
							}
			else if (board[x0][y0] == '2' && Math.abs(x1-x0) == Math.abs(y1-y0) && board[x1][y1] == ' ' &&
					turn == 2) {
				board[x1][y1] = '2';
				board[x0][y0] = ' ';
			}		
			throw new Message("Illegal move!");
		}
}
