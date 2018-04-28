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
	
}
