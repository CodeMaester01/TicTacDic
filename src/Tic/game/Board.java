package Tic.game;

public class Board {
	private State[][] board;


	public Board() {
		board = new State[3][3];
	}
	
	public State[][] getBoard() {
		return board;
	}
	
	public State getTile(int row,int col) {
		return board[row][col];
	}
	
	public void setTile() {
		
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
	
}
