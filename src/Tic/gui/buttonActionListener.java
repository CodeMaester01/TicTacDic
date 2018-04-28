package Tic.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Tic.game.Board;
import Tic.game.State;

public class buttonActionListener implements ActionListener {
	
	private Board board;
	private LocationButton button;
	
	public buttonActionListener(Board board, LocationButton button) {
		this.board = board;
		this.button = button;
	}

	public void actionPerformed(ActionEvent arg0) {
		int row = button.getRow(); int col = button.getCol();
		
		button.setButton();
		board.setTile(row, col);
	}
}
