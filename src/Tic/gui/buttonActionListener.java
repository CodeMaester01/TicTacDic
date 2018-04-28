package Tic.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Tic.game.Board;
import Tic.game.State;
import Tic.game.TurnHandler;

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
		TurnHandler t = board.getTurnHandle();
		int row = button.getRow(); int col = button.getCol();
		
		button.setState(t.getPlayerTurn());
		button.setButton();
		board.setTile(row, col);
		t.changeTurn();
	}
}
