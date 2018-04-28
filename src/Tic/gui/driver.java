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
	public driver(Board b) {
		_b = b;
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new driver(_b));
	}
	
	public void run() {
		_mainWindow = new JFrame();
		_gui = new GUI(_b,this);
		
		_mainWindow.pack();
		_mainWindow.setVisible(true);
		_mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
