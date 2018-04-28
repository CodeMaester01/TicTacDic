package Tic.gui;

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
		for(int i = 0; i < 9; i++) {
			JButton addy = new JButton("");
			//buttonActionListener listener = buttonActionListener(_th.getPlayerTurn());
			addy.addActionListener(listener);
		}
		
	}
	
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
}