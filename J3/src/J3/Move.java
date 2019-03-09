package J3;

public class Move {
	
	static boolean check;
	static int x0, y0, x1, y1;

	public static boolean movePiece(String oldX, String oldY, String newX, String newY, int turn) {

		x0 = Integer.parseInt(oldX);
		y0 = Integer.parseInt(oldY);
		x1 = Integer.parseInt(newX);
		y1 = Integer.parseInt(newY);
		if (Board.board[x0][y0] == '1' && Math.abs(x1-x0) == Math.abs(y1-y0) && Board.board[x1][y1] == ' ' &&
				turn == 1) {
			Board.board[x1][y1] = '1';
			Board.board[x0][y0] = ' ';
			check = true;
		}
		else if (Board.board[x0][y0] == '2' && Math.abs(x1-x0) == Math.abs(y1-y0) && Board.board[x1][y1] == ' ' &&
				turn == 2) {
			Board.board[x1][y1] = '2';
			Board.board[x0][y0] = ' ';
			check = true;
		}		
		return check;
	}
	
}
