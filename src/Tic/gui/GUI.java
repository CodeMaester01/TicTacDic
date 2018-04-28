package Tic.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JPanel;

import Tic.game.Board;
import Tic.game.State;
import Tic.game.TurnHandler;


public class GUI implements Observer {

	private Board _b;
	private driver _driver;
	private TurnHandler _th;
	
	public GUI(Board b, driver driv) {
		_b = b;
		_driver = driv;
		_th = new TurnHandler();
		State[][] stateBoard = b.getBoard();
		
		JPanel board = new JPanel();
		board.setLayout(new GridLayout(3,3));
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3; col++) {
				LocationButton temp = new LocationButton(row,col, b);
				board.add(temp.getButton());
			}
		}
		
	}
	
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
}