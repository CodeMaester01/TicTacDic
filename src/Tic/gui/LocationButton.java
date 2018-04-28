package Tic.gui;

import javax.swing.JButton;

import Tic.game.Board;
import Tic.game.State;

public class LocationButton {
	private State locState;
	private int row;
	private int col;
	private JButton button;
	
	public LocationButton(int r, int c, Board b, GUI gui) {
		locState = State.BLANK;
		row = r;
		col = c;
		button = new JButton();
		button.addActionListener(new buttonActionListener(b, this, gui));
	}
	
	/**
	 * Sets the state of the button
	 * @param s
	 */
	public void setState(State s) {
		locState = s;
	}
	
	public void setButton() {
		switch(locState) {
		case BLANK:
			button.setText("");
		case X:
			button.setText("X");
			button.setEnabled(false);break;
		case O:
			button.setText("O");
			button.setEnabled(false);break;
		}
	}
	
	public JButton getButton() {
		return button;
	}

	public int getRow() {
		return row;
	}
	
	public int getCol() {
		return col;
	}
}
