package Tic.gui;

import java.util.Observable;
import java.util.Observer;

import Tic.game.Board;


public class GUI implements Observer {

	Board _b;
	driver _driver;
	public GUI(Board b, driver driv) {
		_b = b;
		_driver = driv;
		
		
	}
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

}
