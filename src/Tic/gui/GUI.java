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


public class GUI{

	private Board _b;
	private driver _driver;
	private TurnHandler _th;
	private JPanel _gamePanel;
	private JFrame _window;
	
	public GUI(Board b, driver driv, JFrame window) {
		_b = b;
		_driver = driv;
		_th = new TurnHandler();
		_window = window;
		_gamePanel = new JPanel();
	}
	
	public JPanel setBoard() {
		_gamePanel.setLayout(new GridLayout(3,3));
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3; col++) {
				LocationButton temp = new LocationButton(row,col, _b,this);
				_gamePanel.add(temp.getButton());
			}
		}
		return _gamePanel;
	}
}