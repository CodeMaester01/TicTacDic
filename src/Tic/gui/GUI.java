package Tic.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Tic.game.Board;
import Tic.game.State;
import Tic.game.TurnHandler;


public class GUI implements Observer {

	private Board _b;
	private driver _driver;
	private TurnHandler _th;
	private JFrame _window;
	
	public GUI(Board b, driver driv, JFrame window) {
		_b = b;
		_driver = driv;
		_th = new TurnHandler();
		_window = window;
	}
	
	public JPanel setBoard() {
		JPanel board = new JPanel();
		board.setLayout(new GridLayout(3,3));
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3; col++) {
				LocationButton temp = new LocationButton(row,col, _b,this);
				board.add(temp.getButton());
			}
		}
		return(board);
	}
	
	public void update() {
		// TODO Auto-generated method stub
		_window.pack();
		_window.setVisible(true);
	}

	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
}