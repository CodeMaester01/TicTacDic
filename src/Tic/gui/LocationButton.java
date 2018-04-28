package Tic.gui;

import javax.swing.JButton;

import Tic.game.Board;
import Tic.game.State;

public class LocationButton {
	private State locState;
	private int row;
	private int col;
	private JButton button;
	
	public LocationButton(int r, int c, Board b) {
		locState = State.BLANK;
		row = r;
		col = c;
		button = new JButton();
		button.addActionListener(new buttonActionListener(b, this));
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
			button.setEnabled(false);
		case O:
			button.setText("O");
			button.setEnabled(false);
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
