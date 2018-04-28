package Tic.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;
import Tic.game.*;

public class driver implements Runnable {

	private JFrame _mainWindow;
	private JPanel _boardPanel;
	private GUI _gui;
	private static Board _b;
	public driver() {
		TurnHandler th = new TurnHandler();
		_b = new Board(th);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new driver());
	}
	
	public void run() {
		_mainWindow = new JFrame();
		_gui = new GUI(_b,this, _mainWindow);
		JPanel boardPanel = _gui.setBoard();
		
		_mainWindow.add(boardPanel);
		_mainWindow.setSize(1000,1000);
		_mainWindow.pack();
		_mainWindow.setVisible(true);
		_mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
