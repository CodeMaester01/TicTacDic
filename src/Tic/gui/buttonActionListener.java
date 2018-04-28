package Tic.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Tic.game.Board;
import Tic.game.State;

public class buttonActionListener implements ActionListener {
	
	private Board board;
	private LocationButton button;
	private GUI _gui;
	
	public buttonActionListener(Board board, LocationButton button, GUI gui) {
		this.board = board;
		this.button = button;
		_gui = gui;
	}

	public void actionPerformed(ActionEvent arg0) {
		int row = button.getRow(); int col = button.getCol();
		board.getTurnHandle().changeTurn();
		button.setButton();
		board.setTile(row, col);
		_gui.update();
	}
}
