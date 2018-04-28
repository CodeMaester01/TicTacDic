package Tic.game;

public class Board {
	private State[][] board;
	private TurnHandler turnHandle;

	public Board(TurnHandler t) {
		board = new State[3][3];
		turnHandle = t;
	}
	
	public State[][] getBoard() {
		return board;
	}
	
	public TurnHandler getTurnHandle() {
		return turnHandle;
	}
	
	
	public State getTile(int row,int col) {
		return board[row][col];
	}
	
	public void setTile(int row, int col) {
		board[row][col] = turnHandle.getPlayerTurn();
	}
	
	
	
	/**
	 * Returns the number of empty spaces on the board. This is used to determine the number of future game states.
	 * @param b - The board to be analyzed.
	 * @return - count - the number of empty spaces on the board.
	 */
	public int checkEmptySpaces(State[][] b) {
		int count = 0;
		for(int r = 0; r < b.length; r++) {
			for(int c = 0; c < b[r].length; c++) {
				if(b[r][c] == State.BLANK)
					count++;
			}
		}
		return count;
	}
	
	
	public boolean checkWin(State a) {
		int count = 0;
		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++) {
				if(board[r][c] == a)
					count++;
				else
					break;
				if(count == 3)
					return true;
			}
			count = 0;
		}
		count = 0;
		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++) {
				if(board[c][r] == a)
					count++;
				else
					break;
				if(count == 3)
					return true;
			}
			count = 0;
		}
		count = 0;
		for(int i = 0; i<3; i++) {
			if(board[i][i] == a)
				count++;
			else
				break;
			if(count == 3)
				return true;
		}
		for(int i = 0; i<3; i++) {
			if(board[i][2-i] == a)
				count++;
			else
				break;
			if(count == 3)
				return true;
		}
		return false;
	}
	
	public boolean equals(Board b) {
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				if(board[i][j] != b.getBoard()[i][j])
					return false;
			}
		}return true;
	}
}
